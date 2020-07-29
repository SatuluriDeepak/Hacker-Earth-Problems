#include <iostream>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cout<<"Enter : ";
    cin>>t;
    while (t--)
    {
        int n,p,q,r,c=0;
        cin>>n;
        cin>>p>>q>>r;
       
        for(int i=1;i<=n;i++){
            if((i%p==0)&&(i%q!=0)&&(i%r!=0)){
                c++;
            }
            else if((i%p!=0)&&(i%q==0)&&(i%r!=0)){
                c++;
            }
            else if((i%p!=0)&&(i%q!=0)&&(i%r==0)){
                c++;
            }
        }
        cout<<c<<endl;
       
    } 

}