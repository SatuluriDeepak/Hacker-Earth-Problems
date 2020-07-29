#include <iostream>
#include<cmath>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n,x;
    cout<<"Enter : ";
    cin>>n;
    
    while(n--){
        cin>>x;
        int sum=0;
        for(int i=1;i<=sqrt(x);i++){
            if(x%i==0) {
                if(x/i==i)
                    sum++;
                else sum=sum+2;
            }
        }
        cout<<"op : "<<sum<<endl;
    }

}