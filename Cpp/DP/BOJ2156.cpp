#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    int a,b;
    int ia[10001];
    int sa[10001];
    cin >> a ;
    for(b = 1; b<=a; b++){
        cin >> ia[b];
    }
    sa[1] = ia[1];
    sa[2] = ia[1] + ia[2];
    for(b = 3; b<=a; b++){
        sa[b] = max(sa[b-1],max(sa[b-3]+ia[b-1]+ia[b],sa[b-2]+ia[b]));
    }

    cout << sa[a];

    return 0;
}