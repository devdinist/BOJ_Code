package Backtracking;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ1759 {
    static int len,c;
    static char[] ch;
    static char[] tmp;
    static ArrayList<Character> mo = new ArrayList<>();
    static ArrayList<Character> ja = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    static void back(int co,int s){
        if(co == len){
            int jc = 0;
            boolean mc = false;
            for(int i=0; i<len; i++){
                if(ja.contains(tmp[i])) jc++;
                if(mo.contains(tmp[i])) mc = true;
            }
            if(jc < 2 || !mc) return;

            for(int i=0; i<len; i++){
                sb.append(tmp[i]);
            }
            sb.append("\n");
            return;
        }
        for(int i=s; i<c; i++){
            tmp[co] = ch[i];
            back(co+1,i+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=97; i<=122; i++){
            if((char)i == 'a' || (char)i == 'e' || (char)i == 'i' || (char)i =='o' || (char)i =='u'){
                mo.add((char)i);
            }else{
                ja.add((char)i);
            }
        }

        String[] in = br.readLine().split(" ");

        len = Integer.parseInt(in[0]);
        c = Integer.parseInt(in[1]);
        ch = new char[c];
        tmp = new char[len];

        in = br.readLine().split(" ");

        for(int i=0; i<c; i++){
            ch[i] = in[i].charAt(0);
        }

        Arrays.sort(ch);

        back(0,0);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
