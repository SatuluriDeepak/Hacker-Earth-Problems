#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;
void method(string text,string pat){
    int f = text.find(pat);
    while(f!=-1){
        cout<<"Found at "<<f<<endl;
        f = text.find(pat,f+1);
    }
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    string text,pat;
    cout<<"Enter : "<<endl;
    getline(cin,text);
    getline(cin,pat);
    int n=text.length(),m=pat.length();
    for(int i=0;i<=(n-m);i++){
        int j;
        for(j=0;j<m;j++)
            if(text[i+j]!=pat[j])
                break;
        if(j==m)
            cout<<"found at : "<<i<<endl;
    }
    cout<<endl;
    method(text,pat);

}