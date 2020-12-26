package DFS;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

class Ground2{
    int row;
    int col;
    boolean is_house;
    boolean is_visited;

    public Ground2(int row, int col, boolean is_house){
        this.row = row;
        this.col = col;
        this.is_house = is_house;
        this.is_visited = false;
    }
}

public class BOJ2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] move_row = {-1,1,0,0};    //상 하 좌 우
        int[] move_col = {0,0,-1,1};    //상 하 좌 우

        int size = Integer.parseInt(br.readLine());
        int total_count = 0;
        StringBuilder sb = new StringBuilder();

        Ground2[][] ground = new Ground2[size][size];

        Stack<Ground2> s = new Stack<>();

        int[] res = new int[700];

        for(int i=0; i<size; i++){
            String[] input = br.readLine().split("");
            for(int j=0; j<size; j++){
                boolean house = Integer.parseInt(input[j]) == 1;
                ground[i][j] = new Ground2(i,j,house);
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(ground[i][j].is_house && !ground[i][j].is_visited){
                    s.add(ground[i][j]);
                    int current_count = 0;
                    while(!s.isEmpty()){
                        Ground2 g = s.pop();
                        if(!g.is_visited) current_count++;
                        for(int k=0; k<move_col.length; k++){
                            int rr = g.row + move_row[k];
                            int cc = g.col + move_col[k];
                            if(rr >= 0 && cc >=0 && rr < size && cc < size){
                                if(ground[rr][cc].is_house && !ground[rr][cc].is_visited){
                                    s.add(ground[rr][cc]);
                                }
                            }
                        }
                        g.is_visited = true;
                    }
                    res[total_count] = current_count;
//                    sb.append(current_count).append("\n");
                    total_count++;
                }
            }
        }


        bw.write(total_count+"\n");
        Arrays.sort(res);
        for(int i=0; i<res.length; i++){
            if(res[i] != 0) {
                bw.write(res[i] + "\n");
                bw.flush();
            }
        }

        bw.close();
        br.close();

    }
}
