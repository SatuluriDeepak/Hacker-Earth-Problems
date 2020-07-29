#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int t;
    long k;
    string s;
    cin>>t;
    
    while(t--)
    {
        long len = 0,c=0;
        cin>>k>>s;
       
      
        for(int i=0;i<s.size();i++){
            len = (s[i]-'a')+1;
            if(len == k) c++;
            else {
                for(int j=i+1;j<s.size();j++){
                    len+=(s[j]-'a')+1;
                    if(len == k ){
                        c++;
                        break;
                    }  
                    else if(len>k)
                        break;
                }  
            }
        }
        
        
        cout<<c<<endl;
    }
    
    
 
}