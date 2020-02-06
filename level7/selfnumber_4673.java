
package level7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class selfnumber_4673 {
    static void d(int n){
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            int[] a = new int[n+1];
            int[] b = new int[n+1];
            for (int i = 0; i < a.length; i++) {
                a[i] = i;
            }
            for (int i = 1; i < a.length; i++) {
                int jarisu = (int)Math.log10(a[i])+1;
                int[] jari = new int[jarisu];
                int jarihap = 0,count=0;
                while(jarisu > 0){
                    jari[count] = (a[i] / (int)Math.pow(10, jarisu-1))%10;
                    jarihap += jari[count];
                    jarisu--;
                    count++;
                }
                for (int j = 1; j<b.length; j++) {
                    b[i] = a[i] + jarihap;
                }
            }
            Arrays.sort(b);
            for (int i = 1; i < a.length; i++) {
                if (Arrays.binarySearch(b, a[i]) < 0) {
                    bw.write(a[i]+"\n");
                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
        }
    }
    
    public static void main(String[] args) {
        d(10000);
    }
}
