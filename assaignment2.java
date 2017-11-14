import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Scanner;

public class assaignment2 {

    static String [] identifiers;
    static int [] identifiersValue;



    public static void main(String [] args) throws Exception
    {
        Scanner er = new Scanner(System.in);
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        System.out.println("Please enter the number of identifiers.");
        int numberOfIdentifiers=er.nextInt();
        er.nextLine();

        identifiers=new String[numberOfIdentifiers];
        identifiersValue=new int[numberOfIdentifiers];
        String temp;
        String [] temp1;

        for (int i=0; i<numberOfIdentifiers; i++)
        {
            temp=er.nextLine();
            temp1=temp.split("=");
            if(temp1.length==2) {
                identifiers[i] = spaceRemoval(temp1[0]);
                identifiersValue[i] = Integer.parseInt(spaceRemoval(temp1[1]));
            }
            else{
                System.out.println("invalid Structure");
                i--;
            }
        }

        System.out.println("Enter the number of expression");
        int numberOfExpression=er.nextInt();
        er.nextLine();

        String [] expression=new String[numberOfExpression];
        String simplifiedExpression;


        for (int i=0; i<numberOfExpression; i++)
        {
            temp=er.nextLine();
            temp1=temp.split("\\+|-|\\*|/|x|-");
/*            for(int j=0; j<temp1.length; j++)
                System.out.println(temp1[j]);                */
            simplifiedExpression=""+identifierToValue(spaceRemoval(temp1[0]));
            boolean flag, compilationError=false;
            int ita=0, value;
            char current;

            for(int j=1; j<=temp1.length-1; j++) {
                flag = true;

                temp1[j] = spaceRemoval(temp1[j]);
                value = identifierToValue(temp1[j]);
                if (value == -10) {
                    System.out.println("Compilation error");
                    compilationError=true;
                    break;

                }
//                System.out.println(temp1[j]);
                else {
                    while (flag) {
                        current = temp.charAt(ita);
                        if (current == '+' || current == '-' || current == '*' || current == '/') {
                            simplifiedExpression = simplifiedExpression + current + value;
                            flag = false;
                        } else if (current == 'x') {
                            simplifiedExpression = simplifiedExpression + '*' + value;
                            flag = false;
                        }
                        ita++;
                    }
//                    System.out.println(simplifiedExpression);
                }
            }
            if(compilationError==false) {
                System.out.println(engine.eval(simplifiedExpression));
            }

        }

    }

    private static String spaceRemoval(String str)
    {
        String [] tempo= str.split(" ");
        for(int i=0; i<tempo.length; i++)
        {
            str=tempo[i];
        }
//        System.out.println(str);
        return str;
    }
    private static int identifierToValue(String str)
    {
        boolean flag=true;
        int value=-10, ita=0;
        while(flag)
        {
            if(ita<identifiers.length) {
                if (str.equals(identifiers[ita])) {
                    value = identifiersValue[ita];
                    flag = false;
                }
                ita++;
            }
            else
                flag=false;
        }
        return value;
    }
}
