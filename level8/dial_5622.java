
package level8;

import java.util.Scanner;

public class dial_5622 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number_s = s.nextLine().toUpperCase();
        char[] stoc = new char[number_s.length()];
        for (int i = 0; i < stoc.length; i++) {
            stoc[i] = number_s.charAt(i);
        }
        
        String[][] numpadarr = new String[10][1];
        char start = 'A';
        for (int i = 2; i < 10; i++) {
            numpadarr[i][0] = "";
            int count = 0;
            int max = (i == 7) || (i ==9) ? 4 : 3;
            while(count < max){
                numpadarr[i][0] += Character.toString(start++);
                count++;
            }
        }
        
        int sum = 0;
        for (int q = 0; q < stoc.length; q++) {
            int number = 0;
            char vv = stoc[q];
            a:for (int i = 2; i < numpadarr.length; i++) {
                for (int j = 0; j < numpadarr[i][0].length(); j++) {
                    if (numpadarr[i][0].charAt(j) == vv) {
                        number = i;
                        break a;
                    }
                }
            }
            sum += number;
        }
        System.out.println(sum+stoc.length);
    }
}
