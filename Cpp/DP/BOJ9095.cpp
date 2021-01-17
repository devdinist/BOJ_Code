#include <cstdio>

int main(){
    int i,n,b;
    int a[11];
    scanf("%d", &n);
    a[0] = 1; a[1] = 2; a[2] = 4;
    for(i = 3; i<11; i++){
        a[i] = a[i-3]+a[i-2]+a[i-1];
    }

    for(i = 0; i<n; i++){
        scanf("%d",&b);
        printf("%d\n",a[b-1]);
    }
}