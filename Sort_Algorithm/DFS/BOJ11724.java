package DFS;

import java.io.*;
import java.util.ArrayList;

public class BOJ11724 {

    static ArrayList<Integer>[] al;
    static boolean[] visited;


    public static void dfs(int num){
        if(!visited[num]) {
            visited[num] = true;
            for(Integer i : al[num]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] init_input = br.readLine().split(" ");
        int node_count = Integer.parseInt(init_input[0]);
        int line_count = Integer.parseInt(init_input[1]);

        al = new ArrayList[node_count + 1];
        visited = new boolean[node_count + 1];

        for(int i=1; i<al.length; i++){
            al[i] = new ArrayList<>();
        }

        for(int i=0; i<line_count; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            al[a].add(b);
            al[b].add(a);
        }

        int count = 0;

        for(int i=1; i<al.length; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        bw.write(count+"\n");
        bw.close();
        br.close();
    }
}