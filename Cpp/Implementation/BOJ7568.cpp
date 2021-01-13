#include <stdio.h>

int main(){
    int n,i,j;
    int w[50],h[50],r[50]={0,};

    scanf("%d",&n);
    for(i=0; i<n; i++){
        scanf("%d %d",&w[i],&h[i]);
    }

    for(i=0; i<n-1; i++){
        for(j=i+1; j<n; j++){
            if(w[i] < w[j] && h[i] < h[j]) r[i]++;
            else if(w[i] > w[j] && h[i] > h[j]) r[j]++;
        }
    }

    for(i=0; i<n; i++){
        printf("%d ",r[i]+1);
    }
}