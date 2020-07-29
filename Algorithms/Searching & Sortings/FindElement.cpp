#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
bool bs(long arr[],long a,int n){
    int l=0,r=n-1;
    while (l<=r)
    {
       int m=l+(r-l)/2;
       if(arr[m]==a){
           return true;
       }
        if(arr[m]>a){
            r=m-1;
        }
        else l=m+1;
       
    }
    return false;
}   
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //cin.ignore(); After Int for geline command
    cout<<"Enter :";

    int n,q;
    
    cin>>n>>q;
   
    long arr[n];
    long x;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    sort(arr,arr+n);
    while (q--)
    {   
        cin>>x;
        if(bs(arr,x,n)) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
        
}