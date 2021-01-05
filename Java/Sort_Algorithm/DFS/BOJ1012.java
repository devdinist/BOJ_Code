package DFS;

import java.io.*;
import java.util.Stack;

class Ground{
    int row;
    int col;
    boolean is_visited;
    boolean set;

    public Ground(int row, int col){
        this.row = row;
        this.col = col;
        this.is_visited = false;
        this.set = false;
    }

}

public class BOJ1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] move_row = {-1,1,0,0};    //상 하 좌 우
        int[] move_col = {0,0,-1,1};    //상 하 좌 우

        int case_count = Integer.parseInt(br.readLine());

        StringBuilder print_res = new StringBuilder();

        for(int i=0; i<case_count; i++){
            String[] init = br.readLine().split(" ");
            int row = Integer.parseInt(init[0]);
            int col = Integer.parseInt(init[1]);
            int baechu = Integer.parseInt(init[2]);

            int res = 0;

            Ground[][] g = new Ground[row][col];
            Stack<Ground> s = new Stack<>();

            for(int j=0; j<row; j++){
                for(int k=0; k<col; k++){
                    g[j][k] = new Ground(j,k);
                }
            }

            for(int j=0; j<baechu; j++){
                String[] input = br.readLine().split(" ");
                int roww = Integer.parseInt(input[0]);
                int coll = Integer.parseInt(input[1]);
                g[roww][coll].set = true;
            }

            for(int j=0; j<row; j++){
                for(int k=0; k<col; k++){
                    if(!g[j][k].is_visited && g[j][k].set){
                        res++;
                        s.add(g[j][k]);
                        while(!s.isEmpty()){
                            Ground gg = s.pop();
                            gg.is_visited = true;
                            for(int l=0; l< move_col.length; l++){
                                int rr = gg.row + move_row[l];
                                int cc = gg.col + move_col[l];
                                if(rr >= 0 && cc >= 0 && rr < row && cc < col){
                                    if(g[rr][cc].set && !g[rr][cc].is_visited) s.add(g[rr][cc]);
                                }
                            }
                        }
                    }
                }
            }
            print_res.append(res).append("\n");
        }
        bw.write(print_res.toString());
        bw.close();
        br.close();
    }
}
