package DFS;

import java.io.*;
import java.util.*;

class N{
    int index;
    boolean is_visited;
    ArrayList<Integer> al;

    public N(int index){
        this.index = index;
        this.is_visited = false;
        this.al = new ArrayList<>();
    }
}

class Compare implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

public class DFS_N_BFS1260 {
    N[] arr;
    StringBuilder res_dfs;
    StringBuilder res_bfs;

    void add(int a, int b){
        if(!arr[a].al.contains(b)) {
            arr[a].al.add(b);
        }
        if(!arr[b].al.contains(a)){
            arr[b].al.add(a);
        }
    }

    void dfs(int a){
        if(!arr[a].is_visited){
            arr[a].is_visited = true;
            res_dfs.append(a).append(" ");
            Collections.sort(arr[a].al, new Compare());
            for(int i=0; i<arr[a].al.size(); i++){
                dfs(arr[a].al.get(i));
            }
        }
    }

    void bfs(int start){
        Queue<N> q = new LinkedList<>();
        q.add(arr[start]);
        while(!q.isEmpty()){
            N n = q.poll();
            if(!n.is_visited) {
                n.is_visited = true;
                res_bfs.append(n.index).append(" ");
                Collections.sort(n.al, new Compare());
                for(int i=0; i<n.al.size(); i++){
                    if(!arr[n.al.get(i).intValue()].is_visited){
                        q.add(arr[n.al.get(i).intValue()]);
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] init_input = br.readLine().split(" ");
        int node_count = Integer.parseInt(init_input[0]);
        int edge_count = Integer.parseInt(init_input[1]);
        int start = Integer.parseInt(init_input[2]);

        DFS_N_BFS1260 b = new DFS_N_BFS1260();

        b.arr = new N[node_count+1];
        b.res_bfs = new StringBuilder();
        b.res_dfs = new StringBuilder();

        for(int i=1; i<b.arr.length; i++){
            b.arr[i] = new N(i);
        }

        for(int i=0; i<edge_count; i++){
            String[] input = br.readLine().split(" ");
            b.add(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
        }

        b.dfs(start);

        for(int i=1; i<b.arr.length; i++){
            b.arr[i].is_visited = false;
        }

        b.bfs(start);

        bw.write(b.res_dfs.toString()+"\n");
        bw.write(b.res_bfs.toString());
        bw.close();
        br.close();

    }
}
