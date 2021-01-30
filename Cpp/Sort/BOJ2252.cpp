#include <cstdio>
#include <queue>
#include <vector>

using namespace std;

int N,C;
int* in;
vector<int>* vec;
queue<int> q;

int main(){
    scanf("%d %d",&N, &C);
    in = new int[N+1]{0,};
    vec = new vector<int>[N+1];
    for(int i=0; i<C; i++){
        int v,vv;
        scanf("%d %d",&v, &vv);
        vec[v].push_back(vv);
        in[vv]++;
    }

    for (int i = 1; i <= N; i++){
        if(in[i] == 0) q.push(i);
    }

    while(!q.empty()){
        int v = q.front();
        q.pop();
        printf("%d ",v);
        for (int  i = 0; i < vec[v].size(); i++)
        {
            if(--in[vec[v][i]] == 0) q.push(vec[v][i]);
        }
    }
}
