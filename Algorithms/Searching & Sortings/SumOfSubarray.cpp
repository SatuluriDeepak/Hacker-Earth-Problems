#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
void printSubsequences(int arr[], int n) 
{ 
    
    unsigned int opsize = pow(2, n); 

    for (int counter = 1; counter < opsize; counter++) 
    { 
        for (int j = 0; j < n; j++) 
        { 
            if (counter & (1<<j)) 
                cout << arr[j] << " "; 
        } 
        cout << endl; 
    } 
}  
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //cin.ignore(); After Int for geline command
    cout<<"Enter :";
    int t,n,q;
    cin>>t;
    while(t--){
        cin>>n>>q;
   
        long arr[n];
        long x;
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
    
        

    }
    
        
}