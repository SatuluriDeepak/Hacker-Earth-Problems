#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;
long long optimumPrice(long long n,long long a,long long b){

long long x,y;

x=(n*b)/(a+b);

y=x+1;

if(((a*x*x)+(b*(n-x)*(n-x)))>((a*y*y)+(b*(n-y)*(n-y))))
    return ((a*y*y)+(b*(n-y)*(n-y)));

return ((a*x*x)+(b*(n-x)*(n-x)));

}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cout<<"Enter :";
    int t;
    long n,a,b;
    cin>>t;
    while (t--){
      cin>>n>>a>>b;
      cout<<optimumPrice(n,a,b)<<endl;
    }
    
}