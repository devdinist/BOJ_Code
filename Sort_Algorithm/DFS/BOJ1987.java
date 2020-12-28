package DFS;
import java.io.*;

public class BOJ1987 {

    static final int A = 65;
    static boolean[] visit = new boolean[50];
    static char[][] ground;
    static int max = -1;
    static int row;
    static int col;
    static int[] move_row = {-1,1,0,0};
    static int[] move_col = {0,0,-1,1};

    static void dfs(int r, int c, int count){
        visit[ground[r][c] - A] = true;
        for(int i=0; i< move_row.length; i++){
            int rr = r + move_row[i];
            int cc = c + move_col[i];
            if(rr < 0 || cc < 0 || rr >= row || cc >= col) continue;
            if(!visit[ground[rr][cc] - A]){
                dfs(rr,cc,count + 1);
                visit[ground[rr][cc] - A] = false;
            }

        }
        max = Math.max(max,count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] init_input = br.readLine().split(" ");
        row = Integer.parseInt(init_input[0]);
        col = Integer.parseInt(init_input[1]);
        ground = new char[row][col];

        for(int i=0; i< ground.length; i++){
            ground[i] = br.readLine().toCharArray();
        }
        dfs(0,0,1);
        StringBuilder sb = new StringBuilder();
        sb.append(max);
        bw.write(sb.toString());
        bw.close();
        br.close();

    }
}