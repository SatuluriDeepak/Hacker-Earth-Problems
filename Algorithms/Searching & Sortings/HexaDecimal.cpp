#include <iostream>

#include <algorithm>
using namespace std;
int hexa(int x){
    long s = 0;
    while(x>0){
        s += x%16;
        x = x/16;
    }
    return s;
} 
int gcd(int a,int b){
    if(b==0) return a;
    return gcd(b,a%b);
}  
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    int l,r;
    
    cin>>n;
    int res = 0;
    while(n--){
        cin>>l>>r;
        int c=0;
        for(int i=l;i<=r;i++ ){
            res = gcd(i,hexa(i));
            if(res>1) c++;
        }
        cout<<c<<endl;
    }
}