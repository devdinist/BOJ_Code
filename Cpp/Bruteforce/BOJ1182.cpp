#include <iostream>
#include <string>

using namespace std;

int N,S,R;
int *arr;

void calc(int c, int s){
    if(c == N) return;
    s += arr[c];
    if(s == S) R++;
    calc(c+1,s-arr[c]);
    calc(c+1,s); 
}

int main(){
    cin >> N >> S;
    arr = new int[N];
    for(int i=0; i<N; i++){
        cin >> arr[i];
    }
    calc(0,0);
    cout << R;
}