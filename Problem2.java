import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bagusrianto
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int a,b,n,ans_a,ans_b;
        String s;
        String[] ans_string;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        
        for (int i = 0; i < n; i++) {
            s = bf.readLine();
            ans_string = s.split(" ");
            a = reverse(ans_string[0]);
            b = reverse(ans_string[1]);
            System.out.println(reverse(Integer.toString(a + b)));
        }
    }

    public static int reverse(String string) {
        int number;
        int reversedNumber = 0;
        int temp = 0;

        number = Integer.parseInt(string);
        
        while (number > 0) {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }
        
        return reversedNumber;
    }

}
