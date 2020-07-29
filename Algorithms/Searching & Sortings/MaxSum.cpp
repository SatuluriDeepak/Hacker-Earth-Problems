#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout<<"Enter : ";
    long n;
    cin>>n;
    long num = -1000000000,s=0,c=0;
    long arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        if(arr[i]>=0){
            s=s+arr[i];
            c++;
        }
        else {
            if(arr[i]>num) num = arr[i];
        }
    }
    if(s==0 && c==0) cout<<num<<" "<<1<<endl;
    else cout<<s<<" "<<c<<endl;
}