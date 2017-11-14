import java.util.Scanner;
import java.util.Stack;

public class classwork2 {
    private static Stack<Double> result=new Stack<Double>();
    public static void main(String []args)
    {
        Scanner er=new Scanner(System.in);

        System.out.println("Enter the line consisting operator Operands");
        String expession=er.nextLine();

        String [] expressionArray=expession.split(" ");

        System.out.println();
        char cha;
        double x,y;

        for(int i=0; i<expressionArray.length; i++)
        {
            if(!isDouble(expressionArray[i]))
            {
                cha= operator(expressionArray[i]);
                if(cha=='+')
                    result.push(result.pop()+result.pop());
                else if(cha=='-') {

                    y=result.pop();
                    x=result.pop();
                    result.push(x-y);
                }
                else if(cha=='*')
                    result.push(result.pop()*result.pop());
                else if(cha=='/') {
                    y=result.pop();
                    x=result.pop();
                    result.push(x/y);
                }
//                System.out.println(result.peek()+"  "+result.toString());

            }
            else if(isDouble(expressionArray[i]))
            {

                result.push(Double.parseDouble(expressionArray[i]));
//                System.out.println(result.toString());
            }
        }

        if(!result.isEmpty())
        {
            System.out.println("result = "+result.pop());
        }

    }

    private static boolean isDouble(String str)
    {
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    private static char operator(String str)
    {
        if(str.charAt(0)=='+')
            return '+';
        else if(str.charAt(0)=='-')
            return '_';
        else if(str.charAt(0)=='*')
            return '*';
        else if(str.charAt(0)=='/')
            return '/';

        return ' ';
    }
}
