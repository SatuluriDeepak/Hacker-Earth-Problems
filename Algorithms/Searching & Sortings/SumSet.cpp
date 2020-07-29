#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
#include<algorithm>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n,m,x;
    cout<<"Enter : ";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cin>>m;
    vector<int> v1;
    for(int i=0;i<m;i++){
        cin>>x;
        v1.push_back(x);
    }
    for(int i=0;i<=100;i++){
        int count =0;
        bool flag = true;
        for(int j=0;j<n;j++){
            if(find(v1.begin(),v1.end(),(i+arr[j]))==v1.end()){
                flag =false;
                //count++;
            }
        }
        if(flag){
            cout<<i<<" ";
        }
    }
    cout<<endl;

}