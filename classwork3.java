import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classwork3 {

    private static BufferedReader br;
    public static void main(String [] args) throws Exception
    {
        Scanner er=new Scanner(System.in);
        System.out.println("Please enter the path of .txt file");
        FileReader fr=new FileReader(er.next());
        br=new BufferedReader(fr);



        final String regex = "^[\\+-]?([0-9]+\\.)?[0-9]+$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);


        String string;
        Matcher matcher;
        while((string=br.readLine())!=null)
        {
            matcher = pattern.matcher(string);


            if(matcher.find())
            {
                System.out.println("accept");
            }
            else
                System.out.println("reject");
        }


/*        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
*/


    }
}
