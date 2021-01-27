#include <iostream>
#include <cstring>

using namespace std;

int R,C,B,T;
int ground[51][51];
bool visit[51][51];

void dfs(int r, int c){
    visit[r][c] = true;
    int move_r[] = {-1,1,0,0};
    int move_c[] = {0,0,-1,1};

    for(int i=0; i<4; i++){
        int nr = r + move_r[i];
        int nc = c + move_c[i];
        if(nr >= 0 && nc >= 0 && nr < R && nc < C){
            if(!visit[nr][nc] && ground[nr][nc] == 1){
                dfs(nr,nc);
            }
        }
    }
}

int main(){
    cin >> T;
    while(T-- > 0){
        cin >> R >> C >> B;
        int res = 0;
        memset(ground,0,sizeof(ground));
        memset(visit,false,sizeof(visit));
        for(int i=0; i<B; i++){
            int a,b;
            cin >> a >> b;
            ground[a][b] = 1;
        }
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(!visit[i][j] && ground[i][j] == 1){
                    res++;
                    dfs(i,j);
                }
            }
        }
        cout << res << endl;
    }
}



// #include <iostream>
// #include <cstring>

// using namespace std;

// int ground[51][51]{0,};
// bool visit[51][51]{false,};

// void dfs(int r, int c,int m, int n){
//     visit[r][c] = true;
//     int move_r[] = {-1,1,0,0};
//     int move_c[] = {0,0,-1,1};

//     for(int i=0; i<4; i++){
//         int nr = r + move_r[i];
//         int nc = c + move_c[i];
//         if(nr >= 0 && nc >= 0 && nr < m && nc < n){
//             if(!visit[nr][nc] && ground[nr][nc] == 1){
//                 dfs(nr,nc,m,n);
//             }
//         }
//     }
// }

// int main(){
//     int T;
//     cin >> T;
//     while(T-- > 0){
//         int R,C,B;
//         cin >> R >> C >> B;
//         int res = 0;
//         memset(ground,0,sizeof(ground));
//         memset(visit,false,sizeof(visit));
//         for(int i=0; i<B; i++){
//             int a,b;
//             cin >> a >> b;
//             ground[a][b] = 1;
//         }

//         // for(int i=0; i<R; i++){
//         //     for(int j=0; j<C; j++){
//         //         cout << ground[i][j] << " ";
//         //     }
//         //     cout << endl;
//         // }

//         for(int i=0; i<R; i++){
//             for(int j=0; j<C; j++){
//                 if(!visit[i][j] && ground[i][j] == 1){
//                     res++;
//                     dfs(i,j,R,C);
//                 }
//             }
//         }
//         cout << res << endl;
//     }
// }