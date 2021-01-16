#include <iostream>
#define D 1000000000;

using namespace std;

int main(){
    int n,i;
    long long a09[101],a18[101],a27[101],a36[101],a45[101]={0,};

    cin >> n;
    a09[1] = 1; a18[1] = 2; a27[1] = 2; a36[1] = 2; a45[1] = 2;
    for(i = 2; i<=n; i++){
        a09[i] = a18[i-1] % D; 
        a18[i] = a09[i-1] + a27[i-1] % D;
        a27[i] = a18[i-1] + a36[i-1] % D; 
        a36[i] = a27[i-1] + a45[i-1] % D;
        a45[i] = a36[i-1] + a45[i-1] % D;
    }

    cout << (a09[n] + a18[n] + a27[n] + a36[n] + a45[n]) % D;
}


/*
    2차원 배열 사용
*/

// #include <iostream>
// #define D 1000000000;

// using namespace std;

// int main(){
//     int n,i;
//     long long a[101][5];

//     cin >> n;
//     a[1][0] = 1; a[1][1] = 2; a[1][2] = 2; a[1][3] = 2; a[1][4] = 2;

//     for(i = 2; i<=n; i++){
//         a[i][0] = a[i-1][1] % D; 
//         a[i][1] = a[i-1][0] + a[i-1][2] % D;
//         a[i][2] = a[i-1][1] + a[i-1][3] % D; 
//         a[i][3] = a[i-1][2] + a[i-1][4] % D;
//         a[i][4] = a[i-1][3] + a[i-1][4] % D;
//     }

//     cout << (a[n][0] + a[n][1] + a[n][2] + a[n][3] + a[n][4]) % D;
// }