#include <iostream>
#include <vector>
#include <sstream> 
#include<algorithm>
using namespace std;

vector<int>g;
vector<int>m;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    string s;
    cout<<"Enter : ";
    cin>>n;
    cin.ignore();
    long c_19=0,c_other=0;
    while(n--){
        getline(cin,s);
        stringstream ss(s);
        ss<<s;
        string temp;
        int dup;
        if(s[0]=='G'){
            while(!ss.eof()){
                ss>>temp;
                if(stringstream(temp)>>dup){
                    g.push_back(dup);
                }
            }
        }
        else{
             while(!ss.eof()){
                ss>>temp;
                if(stringstream(temp)>>dup){
                    m.push_back(dup);
                }
            }
        }
                 
    }
    
    for(int i=0;i<m.size();i++){
        if(m[i]==19 || m[i]==20){
           c_19 ++;
       }
       else{
           c_other ++;
       }
    }
    for(int i=0;i<g.size();i++){
       if(g[i]==19 || g[i]==20){
           c_19 = c_19+2;
       }
       else{
           c_other = c_other+2;
       }
    }

    if(c_19>0){
        if(c_19<c_other) cout<<"No Date"<<endl;
        else cout<<"Date"<<endl;
    }
    else cout<<"No Date"<<endl;
    

}