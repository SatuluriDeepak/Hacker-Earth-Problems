#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout<<"Enter :";
    int n;
    cin>>n;
    string s;
    cin>>s;
    int count=0;
    for(int i=0;i<(n-3);i++){
        if(s[i]==s[i+2] && s[i+1]==s[i+3]){   
            count++;
        }
    }
    cout<<count<<endl;

}