
package question_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo
{
    public static void main(String[] args)
    {
        CeilingFanPullChain chain = new CeilingFanPullChain();
        while (true)
        {
            System.out.print("Press ");
            get_line();
            chain.pull();
        }
    }
    static String get_line()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in))
          ;
        String line = null;
        try
        {
            line = in.readLine();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return line;
    }
}
