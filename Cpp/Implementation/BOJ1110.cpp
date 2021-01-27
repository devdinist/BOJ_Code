#include <cstdio>

int main(){
    int N,V;
    scanf("%d",&N);
    V = N;
    int a,b,c,r = 0;
    while(true){
        r++;
        a = V / 10;
        b = V % 10;
        c = (a+b) % 10;
        V = b*10+c;
        if(b*10+c == N) break;
    }
    printf("%d",r);
}