
package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class croataia_2941 {
    public static void main(String[] args) throws IOException{
        String[] chro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String v = br.readLine();
        for (String string : chro) {
            v = v.replace(string, ".");
        }
        System.out.println(v.length());
    }

}
