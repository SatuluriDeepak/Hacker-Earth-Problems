#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    double l, r;
    double res;
    cout<<"Enter : ";
    cin>>n;
    long c=0;
    while (n--){
        cin>>l>>r;
        double mi = min(l,r);
        double ma = max(l,r);
        res = ma/mi;
        
        if(res>=1.6 && res<1.71){
            cout<<res<<endl;
            c++;
            
        }   
        
    }
    cout<<c<<endl;
    

}