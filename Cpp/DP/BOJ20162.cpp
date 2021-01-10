#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    int size,i,j,res;
    int arr[1001],dp[1001];
    cin >> size ;
    for(i = 1; i<=size; i++){
        cin >> arr[i];
    }

    for(i = 1; i<=size; i++){
        dp[i] = arr[i];
        for(j = 1; j<i; j++){
            if(arr[j] < arr[i]){
                dp[i] = max(dp[i],dp[j]+arr[i]);
            }
        }
        res = max(res,dp[i]);
    }

    cout << res;
}