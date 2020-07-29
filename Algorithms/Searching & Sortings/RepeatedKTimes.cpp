#include <iostream>

#include <algorithm>

#include<map>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout<<"Enter :";
    int n,inp;
    map<int,int>m1;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>inp;
        m1[inp]++;
    }
    int k;
    cin>>k;
    for(auto x:m1){
        if(k==x.second){
            cout<<x.first<<endl;
            break;
        }

    }
}