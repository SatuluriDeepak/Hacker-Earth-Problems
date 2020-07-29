#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n,q;
    vector<int> v;
    cout<<"enter :";
    cin>>n;
    int arr[n+1];
    int arr1[n+1];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<=n;i++){
        string l="",r="";
        for(int k=0;k<i;k++){
            l+=to_string(arr[k]);
        }
        for(int k=i+1;k<n;k++){
            r+=to_string(arr[k]);
        }
        if(l=="") l="0";
        else if(r=="") r="0";
       
        arr1[i]=stoi(l)+stoi(r);   
    }

    cin>>q;
    for(int i=0;i<q;i++){
        int l,r;
        cin>>l>>r;
        int c=0;
        for(int j=l-1;j<r-1;j++){
            int key=arr1[j];
            if(key%2==0 && key%3==0 && key%5==0) c++;
        }
        cout<<c<<endl;
    }

}