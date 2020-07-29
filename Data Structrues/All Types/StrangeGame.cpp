#include <iostream>
#include<algorithm>
using namespace std;
    
int read_int() {
        int n = 0;
        for(int c = getchar_unlocked(); (c>47 && c<58); c = getchar_unlocked())
            n = (n<<1) + (n<<3) +c -48;
        return n;
    }
int main(){

    long n,x,t,k;
    cout<<"enter :";
    t=read_int();
    while(t-->0){
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        n = read_int();
        k = read_int();
        long arr1[n+1];
        long arr2;
        long res=0,max=0;
        for(long i=0;i<n;i++){
            arr1[i] = read_int();
        }
        for(long i=0;i<n;i++){
            arr2 = read_int();
            if(arr2>max) max=arr2;
        }
        //sort(arr2,arr2+n);
        //long max=arr2[n-1];

        for(long i=0;i<n;i++){
            if(arr1[i]<max+1){
                res+=((max+1)-arr1[i])*k;
            }
        }
        cout<<res<<endl;
 
    }
}