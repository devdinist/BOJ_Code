#include <iostream>

using namespace std;

int main(){
    int i,j,n;
    cin >> n;
    for(i = 0; i<2*n-1; i++){
        if(i < n){
            for(j = 0; j<n-1-i; j++){
                cout << " ";
            }

            for(j = 0; j<2*i+1; j++){
                cout << "*";
            }
        }else{
            for(j = 0; j<i-n+1; j++){
                cout << " ";
            }

            for(j = 0; j<2*(2*n-i-1)-1; j++){
                cout << "*";
            }
        }
        if(i != 2*n-2) cout << endl;
    }
}