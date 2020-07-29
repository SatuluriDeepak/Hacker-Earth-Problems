#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
#include<algorithm>
using namespace std;
void getMissingNo(long arr[], int len)  
{  
   for(int i=0;i<len-1;i++){
       if(arr[i]+1!=arr[i+1]){
           cout<<arr[i]+1<<endl;
           break;
       }
   }
}  
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cout<<"enter : ";
    cin>>n;
    long arr[n];
   
    for(int i=0;i<n;i++ ){
        cin>>arr[i];
    }
    getMissingNo(arr,n);
   
}