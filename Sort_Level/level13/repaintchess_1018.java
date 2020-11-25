package javacode.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class repaintchess_1018 {
    
    public static void main(String[] args) throws IOException {
        String[][] oa = new String[51][51];
        int min = 64;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mn = br.readLine();
        String[] mna = mn.split(" ");
        int row = Integer.parseInt(mna[0]);
        int col = Integer.parseInt(mna[1]);
        int csize = 0;
        while(csize < row){
            mna = br.readLine().split("");
            for (int i = 0; i < mna.length; i++) {
                oa[csize][i] = mna[i];
            }
            csize++;
        }
        br.close();

        for (int a = 0; a < row-7; a++) {    
            for (int c=0; c < col-7 ; c++) {
                int BFpaintcount = 0;
                for (int i = a; i < a+8; i++) {
                    for (int k=c; k< c+8; k++) {
                        if( (i%2 ==0 && k%2 == 0) || (i%2 == 1 && k%2 == 1)){
                            if(oa[i][k].equals("W")) BFpaintcount+=1;
                        }else{
                            if(oa[i][k].equals("B")) BFpaintcount+=1;
                        }
                    }
                }
                min = Math.min(min,BFpaintcount);
                min = Math.min(min,64-BFpaintcount);
            }
        }
        System.out.println(min);
    }
}
