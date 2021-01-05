/*
Short Code
 */

package DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Point1697{
    int point;
    int count = 0;
    boolean v = false;

    public Point1697(int point){
        this.point = point;
    }

}

public class BOJ1697{

    static Queue<Point1697> q = new LinkedList<>();
    static int[] arr = {-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int start_num = Integer.parseInt(input[0]);
        int find_num = Integer.parseInt(input[1]);
        Point1697[] ground = new Point1697[200001];

        if(start_num < find_num){
            for(int i=0; i<ground.length; i++){
                ground[i] = new Point1697(i);
            }

            q.add(ground[start_num]);
            ground[start_num].v = true;
            while(!q.isEmpty()){
                Point1697 pp = q.poll();
                for(int i=0; i<arr.length+1; i++){
                    int idx = i < 2 ? pp.point + arr[i] : pp.point * 2;
                    if(idx >= 0 && idx < 200001 && !ground[idx].v){
                        ground[idx].count = pp.count + 1;
                        ground[idx].v = true;
                        if(idx == find_num){
                            bw.write(ground[idx].count+"");
                            bw.flush();
                            break;
                        }
                        q.add(ground[idx]);
                    }
                }
            }
        }else if(start_num == find_num){
            bw.write("0");
            bw.flush();
        }else {
            bw.write((start_num - find_num)+"");
            bw.flush();
        }
    }
}



/*
Original Code
 */

//import java.io.*;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Point1697{
//    int point;
//    int count = 0;
//    boolean v = false;
//
//    public Point1697(int point){
//        this.point = point;
//    }
//
//}
//
//public class BOJ1697{
//
//    static Queue<Point1697> q = new LinkedList<>();
//    static int[] arr = {-1,1};
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] input = br.readLine().split(" ");
//        int start_num = Integer.parseInt(input[0]);
//        int find_num = Integer.parseInt(input[1]);
//        Point1697[] ground = new Point1697[200001];
//
//        if(start_num < find_num){
//            for(int i=0; i<ground.length; i++){
//                ground[i] = new Point1697(i);
//            }
//
//            q.add(ground[start_num]);
//            ground[start_num].v = true;
//            while(!q.isEmpty()){
//                Point1697 pp = q.poll();
//
//                if(pp.point - 1 >= 0 && pp.point - 1 < 200001 && !ground[pp.point - 1].v){
//                    ground[pp.point - 1].count = pp.count + 1;
//                    ground[pp.point - 1].v = true;
//                    if(pp.point-1 == find_num){
//                        bw.write(ground[pp.point-1].count+"");
//                        bw.flush();
//                        break;
//                    }
//                    q.add(ground[pp.point - 1]);
//                }
//
//                if(pp.point + 1 >= 0 && pp.point + 1 < 200001 && !ground[pp.point + 1].v){
//                    ground[pp.point + 1].count = pp.count + 1;
//                    ground[pp.point + 1].v = true;
//                    if(pp.point+1 == find_num){
//                        bw.write(ground[pp.point+1].count+"");
//                        bw.flush();
//                        break;
//                    }
//                    q.add(ground[pp.point + 1]);
//                }
//
//                if(pp.point * 2 >= 0 && pp.point * 2 < 200001 && !ground[pp.point * 2].v){
//                    ground[pp.point * 2].count = pp.count+ 1;
//                    ground[pp.point * 2].v = true;
//                    if(pp.point*2 == find_num){
//                        bw.write(ground[pp.point*2].count+"");
//                        bw.flush();
//                        break;
//                    }
//                    q.add(ground[pp.point * 2]);
//                }
//            }
//        }else if(start_num == find_num){
//            bw.write("0");
//            bw.flush();
//        }else {
//            bw.write((start_num - find_num)+"");
//            bw.flush();
//        }
//    }
//}