package DFS;

import java.io.*;

public class BOJ4963 {

    static void dfs(int i, int j,int[][] map, boolean[][] visited){
        int[] move_row = {-1,-1,0,1,1,1,0,-1};    // 12 1 3 5 6 7 9 11
        int[] move_col = {0,1,1,1,0,-1,-1,-1};    // 12 1 3 5 6 7 9 11
        if(!visited[i][j]){
            visited[i][j] = true;
            for(int k=0; k< move_row.length; k++){
                int rr = i + move_row[k];
                int cc = j + move_col[k];
                if(rr >= 0 && cc >= 0 && rr <map.length && cc<map[0].length){
                    if(map[rr][cc] == 1 && !visited[rr][cc]) {
                        dfs(rr, cc, map, visited);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true){
            int[][] map;
            boolean[][] visited;
            int count = 0;

            String[] input = br.readLine().split(" ");
            if(input[0].equals("0") && input[1].equals("0")) break;
            else{
                int row = Integer.parseInt(input[1]);
                int col = Integer.parseInt(input[0]);
                map = new int[row][col];
                visited = new boolean[row][col];

                for(int i=0; i<row; i++){
                    String[] line = br.readLine().split(" ");
                    for(int j=0; j<col; j++){
                        map[i][j] = Integer.parseInt(line[j]);
                    }
                }

                for(int i=0; i<row; i++){
                    for(int j=0; j<col; j++){
                        if(map[i][j] == 1 && !visited[i][j]){
                            dfs(i,j,map,visited);
                            count++;
                        }
                    }
                }
            }
            sb.append(count+"\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
