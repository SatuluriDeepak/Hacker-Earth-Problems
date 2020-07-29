#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    long con;
    string s;
    cout<<"Enter : ";
    cin>>t;
    while (t--)
    {
        cin>>s;
        if(s.find("21")!=-1){
            cout<<"The streak is broken!"<<endl;
        }
        else {
            con = stoi(s);
            if((con%21)==0)
                cout<<"The streak is broken!"<<endl;
            else 
                cout<<"The streak lives still in our heart!"<<endl;
        }
            
        
    }
    

}