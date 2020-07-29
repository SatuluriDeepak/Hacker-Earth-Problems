#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
//bool comp()    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //cin.ignore(); After Int for geline command
    cout<<"Enter :";
    int n,inp;
    cin>>n;
    
    vector<pair<int ,int> > v1;
    for(int i=0;i<n;i++){
        cin>>inp;
        v1.push_back(make_pair(inp,i));
    }
    sort(v1.begin(),v1.end());
    for (auto& it : v1) { 
                cout << it.second << " "; 
    }
    cout<<endl;

}