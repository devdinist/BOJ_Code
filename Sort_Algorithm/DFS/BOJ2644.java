package DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class People2644{
    int index;
    int count = -1;
    boolean v = false;
    LinkedList<Integer> l = new LinkedList<>();

    public People2644(int index){
        this.index = index;
    }
}

public class BOJ2644 {

    static People2644[] ground;
    static int start_num, dst_num;
    static Queue<Integer> q = new LinkedList<>();

    static void bfs() throws IOException{
        while(!q.isEmpty()){
            People2644 p = ground[q.poll().intValue()];
            if(p.index == dst_num){
                break;
            }
            for(Integer pp : p.l){
                if(!ground[pp.intValue()].v){
                    ground[pp.intValue()].count = p.count + 1;
                    ground[pp.intValue()].v = true;
                    q.add(pp);
                }
            }
        }
    }

    static void add_edge(int a, int b){
        if(!ground[a].l.contains(b)) ground[a].l.add(b);
        if(!ground[b].l.contains(a)) ground[b].l.add(a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people_count = Integer.parseInt(br.readLine());
        String[] init_input = br.readLine().split(" ");
        start_num = Integer.parseInt(init_input[0]);
        dst_num = Integer.parseInt(init_input[1]);
        int edge_count = Integer.parseInt(br.readLine());

        ground = new People2644[people_count+1];
        for(int i=1; i<=people_count; i++){
            ground[i] = new People2644(i);
        }

        for(int i=0; i<edge_count; i++){
            String[] input = br.readLine().split(" ");
            add_edge(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
        }

        ground[start_num].count = 0;
        ground[start_num].v = true;
        q.add(start_num);
        bfs();

        bw.write(ground[dst_num].count+"");
        bw.close();
        br.close();
    }
}