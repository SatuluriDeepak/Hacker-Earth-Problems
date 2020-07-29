#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
bool cmp(int a,int b){
    if(a%2==0 && b%2==0)
        return a<b;
    else if(a%2!=0 && b%2!=0)
        return a<b;
    else if(a%2!=0) return false;
    return true;
}   
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //cin.ignore(); After Int for geline command
    cout<<"Enter :";

    int n,k;
    
    cin>>n;
   
    int arr[n];
    long e_sum=0,o_sum=0,ec=0;
    vector<int>v1;
    for(int i=0;i<n;i++){

        cin>>arr[i];
        v1.push_back(arr[i]);
        if(arr[i]%2==0) {
            e_sum+=arr[i];
            ec++;
            
        }
        else{
            o_sum+=arr[i];
        } 
    }
    sort(v1.begin(),v1.end(),cmp);
    v1.insert(v1.begin()+ec,e_sum);
    v1.push_back(o_sum);
     for(int i=0;i<v1.size();i++){
        cout<<v1[i]<<" ";
    }
    cout<<endl;

    
}
