#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t,n,q;
    cout<<"Enter : ";
    cin>>t;
    while(t-->0){
        vector<long long>b;
        cin>>n;
        long a[n];
       
        for(int i=0;i<n;i++){
            cin>>a[i];
            b.push_back(a[i]);
        }
        cin>>q;
        
        long long l[q],r[q];

        for(int i=0;i<q;i++){
            cin>>l[i];
        }
        for(int i=0;i<q;i++){
            cin>>r[i];
        }
        for(int i=0;i<q;i++){
            
            while(r[i]>b.size()){
                for(int j=0;j<n;j++){
                    b.push_back(a[j]);
                }   
            }
            //cout<<"Size : "<<b.size()<<endl;
            long sum=0;
            for(long k=l[i]-1;k<r[i];k++ ){
                sum+=b[k];
            }
            cout<<sum<<" ";
        }
        cout<<endl;
    }
    
    
}