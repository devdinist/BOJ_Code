package java.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findfraction_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int faze = 1;
        while(faze < num){
            if((faze*(faze+1)) / 2 < num){
                faze++;
            }else{
                break;
            }
        }
        int gijun = (faze*(faze+1)) / 2;
        int a = faze % 2 == 0 ? faze : 1;
        int b = faze % 2 == 0 ? 1 : faze;
        while(true){
            if (faze % 2 == 0) {
                if (gijun == num) {
                    System.out.println(a+"/"+b);
                    break;
                }else{
                    a--; b++;
                }
            }else{
                if(gijun == num){
                    System.out.println(a+"/"+b);
                    break;
                }else{
                    a++; b--;
                }
            }
            gijun--;
        }
    }
}
