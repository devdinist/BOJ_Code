#include <stdio.h>
#include <algorithm>

using std::min;
int a[1000001];

int main(){
    
    int n,i;
    scanf("%d", &n);
    a[1] = 0;
    a[2] = 1;
    a[3] = 1;

    for(i = 4; i<=n; i++){
        if(i % 2 != 0 && i% 3 != 0){
            a[i] = a[i-1] + 1;
            continue;
        }
        if(i % 2 == 0 && i%3 != 0){
            a[i] = min(a[i/2],a[i-1]) + 1;
            continue;
        }
        if(i%2 != 0){
            a[i] = min(a[i/3],a[i-1]) + 1;
            continue;
        }
        if(i%2 == 0){
            a[i] = min(a[i/3],min(a[i/2],a[i-1])) + 1;
        }
    }

    printf("%d",a[n]);

    return 0;
}