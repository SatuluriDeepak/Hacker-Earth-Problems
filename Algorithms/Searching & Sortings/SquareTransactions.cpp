#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    long q;
    long long target,sum=0,is=0;
    cout<<"Enter : ";
    cin>>t;
    int arr[t];
    for(int i=0;i<t;i++){
        cin>>arr[i];
        is+=arr[i];
    }
    cin>>q;
    while (q--)
    {
        cin>>target;
        if(target>is){
            cout<<-1<<endl;
        }
        else if(target==is) 
            cout<<t<<endl;
        else{
            sum=0;
            for(int i=0;i<t;i++){
                sum+=arr[i];
                if(sum>=target){
                    cout<<i+1<<endl;
                    break;
                }
            }
        }
        
    }
    

    

}