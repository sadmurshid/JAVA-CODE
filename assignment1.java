import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class assignment1 {

    private static String [] keywords={"abstract","continue","for","new,switch","assert","default","package","synchronized","boolean","do",
            "if","private","this","break","double","implements","protected","throw","byte","else","import","public","throws",
            "case","enum","instanceof","return","transient","catch","extends","int","short","try","char	final",
            "interface","static","void","class","finally","long","strictfp","volatile","float","native","super","while"};
    private static int [] keywordsCount=new int[keywords.length];
    private static String [] identifiers=new String [60];
    private static int [] identifiersCount=new int[60];
    private static String [] mathOperators={"+","-","*","/","%","++","--","="};
    private static int [] mathOperatorsCount=new int [mathOperators.length];
    private static String [] logicalOperators={"&&","||","!","<",">","<=",">="};
    private static int [] logicalOperatorsCount=new int [logicalOperators.length];
    private static int [][] integers=new int [50][2];
    private static double [][] doubles=new double [50][2];
    private static String [] others={",",";","(",")","{","}","[","]"};
    private static int [] othersCount=new int[others.length];

    private static BufferedReader br;

    public static void main(String[]args) throws IOException
    {

        Scanner er=new Scanner(System.in);
        System.out.println("Please enter the path of .txt file");
        FileReader fr=new FileReader(er.next());
        br=new BufferedReader(fr);
//        File f=new File("convertedPlaylist.dpl");


        String line;
        String [] stringArray;
        int size;
//        String [] splitArray={" ",";","-"};


        while((line=br.readLine())!=null)
        {
            if(checkComment(line)==false) {
                stringArray = line.split(" ");
                size = stringArray.length;
                for (int ita = 0; ita < size; ita++) {
                    if (checkKeywords(stringArray[ita])) {
                    } else if (checkMathOperators(stringArray[ita])) {
                    } else if (checkLogicalOperator(stringArray[ita])) {
                    } else if (checkOthers(stringArray[ita])) {
                    } else if (checkDouble(stringArray[ita])) {
                    } else {
                        checkIdentifier(stringArray[ita]);


                    }

//                System.out.println(stringArray[ita]+" ");
                }
            }
        }

        System.out.print("Identifiers: ");
        for(int i=0; i<identifiers.length; i++)
        {
            if(identifiersCount[i]>0)
                System.out.print(identifiers[i]+",");
        }
        System.out.println();

        System.out.print("Keywords: ");
        for(int i=0; i<keywords.length; i++)
        {
            if(keywordsCount[i]>0)
                System.out.print(keywords[i]+",");
        }
        System.out.println();

        System.out.print("Math Operators: ");
        for(int i=0; i<mathOperators.length; i++)
        {
            if(mathOperatorsCount[i]>0)
                System.out.print(mathOperators[i]+",");
        }
        System.out.println();

        System.out.print("Logical Operators: ");
        for(int i=0; i<logicalOperators.length; i++)
        {
            if(logicalOperatorsCount[i]>0)
                System.out.print(logicalOperators[i]+",");
        }
        System.out.println();
        System.out.print("Numerical values: ");
        for(int i=0; i<doubles.length; i++)
        {
            if(doubles[i][1]>0)
                System.out.print(doubles[i][0]+",");
        }
        System.out.println();

        System.out.print("Others: ");
        for(int i=0; i<others.length; i++)
        {
            if(othersCount[i]>0)
                System.out.print(others[i]+",");
        }
        System.out.println();

    }

    private static boolean checkMathOperators(String str)
    {
        boolean boo=false;
        try
        {
            int length=mathOperators.length;
            for(int i=0; i<length; i++)
            {
                if(mathOperators[i].equals(str))
                {
                    mathOperatorsCount[i]++;
                    boo=true;
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("An error occur while checking Math Oparators");
        }
        return boo;
    }

    private static boolean checkKeywords(String str)
    {
        boolean boo=false;
        try
        {
            int length=keywords.length;
            for(int i=0; i<length; i++)
            {
                if(keywords[i].equals(str))
                {
                    keywordsCount[i]++;
                    boo=true;
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("An error occur when checking keywords");
        }
        return boo;
    }

    private static boolean checkLogicalOperator(String str)
    {
        boolean boo=false;
        try
        {
            int length=logicalOperators.length;
            for(int i=0; i<length; i++)
            {
                if(logicalOperators[i].equals(str))
                {
                    logicalOperatorsCount[i]++;
                    boo=true;
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("An error occur when checking Logical Operator");
        }
        return boo;
    }

    private static boolean checkOthers(String str)
    {
        boolean boo=false;
        try
        {
            str=spaceRemoval(str);
            int length=others.length;
            for(int i=0; i<length; i++)
            {
                if(others[i].equals(str))
                {
                    othersCount[i]++;
                    boo=true;
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("An error occur when checking Others");
        }
        return boo;
    }

    private static boolean checkDouble(String str)
    {
        boolean boo=false;
        try
        {
            str=spaceRemoval(str);
            double d=Double.parseDouble(str);
            int length=doubles.length;
            for(int i=0; i<length; i++)
            {
                if(doubles[i].equals(d))
                {
                    doubles[i][1]++;
                    boo=true;
                    break;
                }
            }
            for(int i=0; i<length; i++)
            {
                if(doubles[i][0]==0.0)
                {
                    doubles[i][0]=d;
                    doubles[i][1]=1.0;
                    boo=true;
                    System.out.println(d);
                    break;
                }
            }
        }
        catch(Exception e)
        {
            return false;
//            System.out.println("An error occur while checking Math Oparators");
        }
        return boo;
    }

    private static boolean checkIdentifier(String str) throws IOException
    {
        boolean bool=false;

        boolean contain= false;
        str=spaceRemoval(str);
        for(int i=0; i<identifiersCount.length; i++)
        {
            if(identifiersCount[i]>0) {
                if (identifiers[i].equals(str)) {
                    contain = true;
                    identifiersCount[i]++;
                    break;
                }
            }
        }
        if(contain==false)
        {
            for(int i=0; i<identifiersCount.length; i++)
            {
                if(identifiersCount[i]==0)
                {
                    identifiers[i]=str;
                    identifiersCount[i]++;
                    break;
                }
            }
        }

        return bool;
    }

    private static String spaceRemoval(String str)
    {
        String newString="";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)!=' ' && str.charAt(i)!=',' && str.charAt(i)!=';' && str.charAt(i)!=')' && str.charAt(i)!=' ')
            {
                newString=newString+str.charAt(i);
            }

        }
        System.out.println(newString);
        return newString;
    }

    private static boolean checkComment(String str) throws IOException
    {
        boolean bool=false;
        if(str.length()>2)
        {
            boolean checkComment = true;
            char prev=str.charAt(0), current;
            for(int i=1; i<str.length(); i++)
            {
                current=str.charAt(i);
                if(prev=='/'&& current=='/')
                {
//                    System.out.println("Comment");
                    br.readLine();
                    bool=true;
                    break;
                }
                prev=current;
            }


            if(str.charAt(0)=='/' && str.charAt(1)=='/')
            {
//                System.out.println("Comment");
                bool=true;

            }
            else if(str.charAt(0)=='/' && str.charAt(1)=='*')
            {
//                System.out.println("Long Comment"+ str);
                bool=true;

                int length=str.length();
                if(str.charAt(length-2)=='*'&& str.charAt(length-1)=='/')
                {
//                    System.out.println("Ending Comment");

                }
                else {

                    while (checkComment) {
                        str = br.readLine();
                       // System.out.println(str);
                        if(str!=null) {
                            length = str.length();
                            if (length >= 2) {
                                if (str.charAt(length - 2) == '*' && str.charAt(length - 1) == '/') {
                                    checkComment = false;
                                 //   System.out.println("Ending Comment"+str);

                                }
                            }
                        }
                    }

                }
            }
        }



        return bool;

    }
}
