#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout<<"Enter : ";
    long int n,x;
    cin>>n;
    while(n--){
        cin>>x;
        long long sum=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                sum+=i;
            } 
        }
        cout<<sum<<endl;
    }

}