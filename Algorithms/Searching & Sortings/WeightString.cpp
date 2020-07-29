#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cout<<"Enter :";
    int t;
    long k,sum=0;
    string s;
    cin>>t;
    
    while(t--)
    {
        long c=0;
        cin>>k>>s;
        long len = s.size();
        int arr[len];
        for(int i=0;i<s.size();i++){
            arr[i] = (s[i]-'a')+1 ;
        }
        for(int i=0;i<len;i++){
        sum = arr[i];
        if(arr[i]==k) c++;
        else{
            for(int j=i+1;j<len;j++){
               sum+=arr[j];
                 if(sum == k){
                   c++;
                   break;
               }
               else if(sum>k) 
                break;
           }
        }
        }
           
        cout<<c<<endl;
    }
    
    

}