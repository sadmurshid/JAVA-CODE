import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classwork1 {

    private static BufferedReader br;
    public static void main (String [] args) throws Exception
    {

        Scanner er=new Scanner(System.in);
        System.out.println("Please enter the path of .txt file");
        FileReader fr=new FileReader(er.next());
        br=new BufferedReader(fr);

        final String regex = "(public|private|protected)?\\s+(static)?\\s*(int|byte|short|long|String|char|double|boolean|float|void|\\w+)\\s+(\\w+)\\s*\\(((\\s*(int|byte|short|long|String|char|double|boolean|float)\\s+(\\[\\])?\\s*\\w+\\s*)(\\,\\s*((int|byte|short|long|String|char|double|boolean|float)\\s+(\\[\\])?\\s*\\w+)*\\s*)*)*\\)";

        final Pattern pattern = Pattern.compile(regex);

        String line;
/*        String [] stringArray;
        int size;*/

        while((line=br.readLine())!=null)
        {
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
//                System.out.println("Full match: " + matcher.group(0));

                System.out.println(matcher.group(4)+" ("+matcher.group(5)+") , "+"return type: "+matcher.group(3));


/*                for (int i = 1; i <= matcher.groupCount(); i++) {
                    System.out.println("Group " + i + ": " + matcher.group(i));
                }*/
            }
        }






         line = "public static void main(String [] args)\n"
                 + "{\n"
                 + "}\n"
                 + "public int emni()\n"
                 + "{\n"
                 + "}";





    }


}
