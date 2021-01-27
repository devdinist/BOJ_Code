#include <cstdio>

int g(int num){
    if(num % 2 != 0) return num / 2 + 1;
    else return num / 2;
}

int main(){
    int n,p1,p2,co = 0;
    scanf("%d %d %d",&n,&p1,&p2);
    while(p1 != p2){
        p1 = g(p1);
        p2 = g(p2);
        co++;
    }
    printf("%d",co);
}