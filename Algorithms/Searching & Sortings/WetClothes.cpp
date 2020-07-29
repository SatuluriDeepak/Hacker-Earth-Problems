#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout<<"Enter : ";

    int n,m,g;
    cin>>n>>m>>g;
    long time[n];
    for(int i=0;i<n;i++){
        cin>>time[i];
    }
    int a[m];
    for(int i=0;i<m;i++){
        cin>>a[i];
    }
    int c=0;
    for(int i=0;i<n-1;i++){
        long dif = time[i+1]-time[i];
        for(int j=0;j<m;j++){
            if(a[j]<=dif){
                a[j] = MAX_INPUT;
                c++;
            }
        }
    }
    cout<<c<<endl;
    

}