#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;
int main(){
    long n;
    cout<<"Enter : ";

    cin>>n;
    string s,s2;
    long len=0;
    cin>>s;

    
    for(long i=0;i<n;i++){
        len=s2.size();
        if(len!=0 && s2[len-1]==s[i]){
            s2.erase(s2.begin()+(len-1));
        }
        else{ 
            s2+=s[i];
        }
    }
    cout<<s2.size()<<endl;
    cout<<s2<<endl;
}