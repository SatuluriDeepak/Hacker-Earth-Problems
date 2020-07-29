#include <iostream>
#include <vector>

using namespace std;
int main(){
    long n;
    //cout<<"enter"<<endl;
    cin>>n;
    long long arr[n+1];
    for(long i=0;i<n;i++){
        cin>>arr[i];
    }
    sort(arr,arr+n);
    long c=1,d=1,ans=0;
    for(long i=1;i<n;i++){
        if(arr[i]==arr[i-1]+1){
            c++;
            d++;
        }
        else if(arr[i]==arr[i-1]){
            c++;
        }
        else{
            if(c>=2 && d>=2){
                ans+=(c*(c-1))/2;
            }
            c=1;d=1;
        }
    }
    if(c>=2 && d>=2){
        ans+=(c*(c-1))/2;
    }
    cout<<ans<<endl;
    

}