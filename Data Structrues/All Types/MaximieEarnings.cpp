#include <iostream>
using namespace std;
int main(){

    long n,x,s,r;
    string s1,s2;
    cout<<"Enter : ";
    cin>>s;
    while(s-->0){
        cin>>n>>r;
        long long ele;
        long c1=0,curMax=INT_MIN;
        for(long i=0;i<n;i++){
            cin>>ele;
            if(ele>curMax){
                curMax=ele;
                c1++;
            }
        }
        cout<<c1*r<<endl;
    }
}