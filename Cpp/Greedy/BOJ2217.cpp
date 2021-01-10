#include <iostream>
#include <algorithm>

using namespace std;

int main(){

    int n,i,m = 0;
    int *a;
    cin >> n;
    a = new int[n];
    for(i=0; i<n; i++){
        cin >> a[i];
        m = std::max(m,a[i]);
    }
    sort(a,a+n);
    for(i = 0; i<n-1; i++){
        m = std::max(m,a[i] * (n-i));
    }
    cout << m;
    return 0;
}