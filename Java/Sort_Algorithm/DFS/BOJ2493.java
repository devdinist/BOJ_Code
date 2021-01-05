package DFS;

import java.io.*;
import java.util.Stack;

class T{
    int index;
    int floor;

    public T(int index, int floor){
        this.index = index;
        this.floor = floor;
    }
}

public class BOJ2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        Stack<T> s = new Stack<>();

        for(int i=0; i<size; i++){
            int num = Integer.parseInt(input[i]);
            if(s.isEmpty()){
                s.push(new T(i+1,num));
                bw.write("0 ");
                bw.flush();
            }else{
                while(true){
                    if(s.isEmpty()){
                        bw.write("0 ");
                        bw.flush();
                        break;
                    }
                    T t = s.peek();
                    if(t.floor > num){
                        bw.write(t.index+" ");
                        bw.flush();
                        break;
                    }else{
                        s.pop();
                    }
                }
                s.push(new T(i+1,num));
            }
        }

        bw.close();
        br.close();
    }
}
