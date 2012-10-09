import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bagusrianto
 */
public class Problem1 {
    public static void main(String[] args) throws IOException {
        int n, prev;
        n = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        for(;;){
            prev = n;
            n = Integer.parseInt(bf.readLine());
            if(prev == 42){
                break;
            }
            else if(n != 42)
            {
                System.out.println(n);
            }
                
        }
    }
}
