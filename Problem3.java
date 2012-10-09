import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bagusrianto
 */
public class Problem3 {

    public static void main(String[] args) throws IOException {
        int n;
        String s;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // toioynnkpheleaigshareconhtomesnlewx
        
        for(;;){
            n = Integer.parseInt(bf.readLine());
            
            if(n == 0) break;
            
            s = bf.readLine();
            toandfro(s, n);
        }
    }
    
    protected static void toandfro(String string, int n){
        String s, before, after;
        before = string;
        char c;
        int prev, a;
        prev = 0;
        
        s = before;
        String[] ans = new String[s.length() / n];
        
       
        for (int i = 0; i < s.length() / n; i++) {
            a = prev + n;
            ans[i] = s.substring(prev, a);
            prev = prev + n;
        
            if(i % 2 == 1){
                ans[i] = new StringBuffer(ans[i]).reverse().toString();
            }
        }
       
        after = "";
        for (int i = 0; i < s.length() / n; i++) {
            after = after + ans[i];
        }
        
        // cetak string
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s.length() / n; j++) {
                c = after.charAt((j*n)+i);  
                System.out.print(c);
            }
           
        }
        System.out.println();
    }
    
}
