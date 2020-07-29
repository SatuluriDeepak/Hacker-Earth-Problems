#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin>>n;
    long long arr[n],k;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cin >>k;
    for(int i=0;i<n;i++){
        if(arr[i]==k) {
            cout<<i<<endl;
            break;
        }
    }


}