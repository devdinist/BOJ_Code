
package level7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hansu_1065 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> s = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        sc.close();
        if (a < 100) {
            System.out.println(a);
        }else{
            for (int i = 1; i <= a/100; i++) {
                for (int j = 0; j < 5; j++) {
                    sb.append(i);
                    sb.append(i+j);
                    sb.append(i+(j*2));
                    if (Integer.parseInt(sb.toString()) <=a && sb.length() < 4) {
                       s.add(sb.toString());
                    }
                    sb.delete(0, sb.length());
                }
                for (int j = 4; j >= 0; j--) {
                    if (i-j < 0 || i-(j*2) < 0) {
                    }else{
                        sb.append(i);
                        sb.append(i-j);
                        sb.append(i-(j*2));
                        
                        if (Integer.parseInt(sb.toString()) <=a && sb.length() < 4) {
                            s.add(sb.toString());
                        }
                        sb.delete(0, sb.length());
                    }
                }
                sb.delete(0, sb.length());
            }
            System.out.println((s.size()+99));
        }
    }
}
