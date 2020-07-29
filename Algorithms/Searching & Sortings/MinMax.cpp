#include <iostream>
#include <vector>
#include<algorithm>
 
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin>>n;
    long arr[n];
    long sum=0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sum+=arr[i];
    }
    sort(arr,arr+n);
    cout<<sum-(arr[n-1])<<" "<<sum-(arr[0])<<endl;
 
 
}