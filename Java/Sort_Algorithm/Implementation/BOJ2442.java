package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        for(int i=0; i<line; i++){
            for(int j=i; j<line-1; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            if(i != line-1) System.out.println();
        }
    }
}
