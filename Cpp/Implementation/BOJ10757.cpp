#include <iostream>
#include <cstring>
#include <cstdlib>

using namespace std;

int main(){
    string a,b;
    cin >> a >> b;
    string ress;
    int gijun = a.length();
    int diff = a.length();
    int diff2 = b.length();
    int res = abs(diff-diff2);
    if(diff > diff2){
        gijun = diff;
        for(int i=0; i<res; i++) b.insert(0,"0");
    }else{
        gijun = diff2;
        for(int i=0; i<res; i++) a.insert(0,"0");
    }
    int base = 0;
    while(gijun-- > 0){
        int top = (int)a.at(gijun) - '0';
        int bottom = (int)b.at(gijun) - '0';
        int res = base + top + bottom;
        base = res / 10;
        ress.insert(0,to_string(res%10));
    }
    if(base != 0) ress.insert(0,to_string(base));
    printf("%s",ress.c_str());
}