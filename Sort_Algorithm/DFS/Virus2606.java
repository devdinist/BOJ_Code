package DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Stack;

class Computer{
    int number;
    boolean infected;
    boolean visited;
    LinkedList<Computer> lc;

    public Computer(int number){
        this.number = number;
        this.infected = false;
        this.visited = false;
        lc = new LinkedList<>();
    }
}

public class Virus2606 {
    Computer[] com;
    int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Computer> s = new Stack<>();
        int count_com = Integer.parseInt(br.readLine());
        int count_connected = Integer.parseInt(br.readLine());

        Virus2606 v = new Virus2606();
        v.com = new Computer[count_com+1];

        for(int i=0; i<count_com; i++){
            v.com[i+1] = new Computer(i+1);
        }

        v.com[1].infected = true;

        for(int i=0; i<count_connected; i++){
            String[] input = br.readLine().split(" ");
            v.Add_edge(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
        }

        v.dfs(1);
        bw.write(v.count+"");
        bw.close();
        br.close();
    }

    public void dfs(int start_num){
        Stack<Computer> s = new Stack<>();
        s.push(com[start_num]);
        while(!s.isEmpty()){
            Computer c = s.pop();
            c.visited = true;
            if(!c.infected){
                c.infected = true;
                count++;
            }

            for(Computer cc : c.lc){
                if(!cc.visited){
                    s.push(cc);
                }
            }
        }
    }

    public void Add_edge(int a, int b){
        Computer c1 = com[a];
        Computer c2 = com[b];

        if(!c1.lc.contains(c2)){
            c1.lc.add(c2);
        }
        if(!c2.lc.contains(c1)){
            c2.lc.add(c1);
        }
    }
}
