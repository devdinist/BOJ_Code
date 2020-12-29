package DFS;

import java.io.*;

public class BOJ2468 {

    static int[] move_row = {-1,1,0,0};
    static int[] move_col = {0,0,-1,1};
    static int[][] ground;
    static boolean[][] v;

    static void dfs(int row, int col,int base){
        v[row][col] = true;
        for(int i=0; i< move_col.length; i++){
            int rr = row + move_row[i];
            int cc = col + move_col[i];
            if(rr >= 0 && cc >= 0 && rr < ground.length && cc < ground.length){
                if(ground[rr][cc] > base && !v[rr][cc]){
                    dfs(rr,cc,base);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int max = 0;
        int max_res = 0;

        ground = new int[size][size];
        v = new boolean[size][size];

        for(int i=0; i<size; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<input.length; j++){
                ground[i][j] = Integer.parseInt(input[j]);
                max = Math.max(max,ground[i][j]);
            }
        }

        for(int i=0; i<max; i++){
            int count = 0;
            for(int j=0; j<ground.length; j++){
                for(int k=0; k<ground[j].length; k++){
                    if(ground[j][k] > i && !v[j][k]){
                        count++;
                        dfs(j,k,i);
                    }
                }
            }
            max_res = Math.max(max_res,count);
            v = new boolean[size][size];
        }

        bw.write(max_res+"");
        bw.close();
        br.close();
    }
}
