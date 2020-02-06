
package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class groupwordchecker_1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] keyword = new String[size];
        boolean[] statarr = new boolean[size];
        
        int count = 0;
        while(count < size){
            keyword[count] = br.readLine();
            count++;
        }
        
        Set<Character> s = new LinkedHashSet<>();
        Queue<Character> st = new LinkedList<>();
        
        for (int i = 0; i < keyword.length; i++) {
            String v = keyword[i];
            for (int x = 0; x < v.length(); x++) {
                s.add(v.charAt(x));
            }

            for (Character character : s) {
                st.add(character);
            }
            
            try {
                for (int j = 0; j < v.length(); j++) {
                    if (v.charAt(j) == st.peek()) {
                    }else{
                        st.poll();
                        if (v.charAt(j) == st.peek()) {
                        }else{
                            statarr[i] = true;
                            break;
                        }
                    }
                }
            } catch (NullPointerException e) {
               statarr[i] = true;
            }
            s.clear();
            st.clear();
        }
        int sum = 0;
        for (boolean b : statarr) {
            if(!b) sum++;
        }
        System.out.println(sum);
    }
}
