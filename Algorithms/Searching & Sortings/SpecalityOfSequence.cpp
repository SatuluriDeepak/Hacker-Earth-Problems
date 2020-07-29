#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //cin.ignore(); After Int for geline command
    cout<<"Enter :";
    int n,k;
    long sum=0;
    cin>>n>>k;
    long arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n-1;i++){
        int c=0;
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                c++;
            }
            if(c==k){
                sum+=arr[i];
                break;
            }
        }
    }
    cout<<endl;
    cout<<sum<<endl;
}