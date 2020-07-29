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
    
    cin>>n;
   
    int arr[n];
    int b[n];
    int x=0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        b[x]=arr[i];
        x++;
    }
   
    for(int i=1;i<n;i++){
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
        
        arr[j+1] = key;   
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(b[i]==arr[j]){
                cout<<j+1<<" ";
            }
        }
    }
    cout<<endl;

}