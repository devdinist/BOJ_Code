#include <cstdio>
#include <cstring>

bool v[10];
int* tmp;
int n;

void backtrack(int c){
    if(c == n){
        for(int i=0; i<n; i++){
            printf("%d ",tmp[i]);
        }
        printf("\n");
        return;
    }
    for(int i=1; i<=n; i++){
        if(!v[i]){
            v[i] = true;
            tmp[c] = i;
            backtrack(c+1);
            v[i] = false;
        }
    }
}

int main(){
    scanf("%d", &n);
    tmp = new int[n];
    backtrack(0);
}