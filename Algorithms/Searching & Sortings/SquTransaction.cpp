#include <iostream>
#include <vector>
#include <iterator>
#include <algorithm>
#include <climits>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    vector<long> v1;
    vector<long> sum;
   
    int t;
    long q,inp;
    long long target;
    cout<<"ENter : ";
    cin>>t;
    sum.push_back(0);
    for(int i=0;i<t;i++){
        cin>>inp;
        v1.push_back(inp);
        sum.push_back(sum.back()+inp);
    }
    cin>>q;
    while (q--)
    {
        cin>>target;
        vector<long>::iterator itr;
        itr = lower_bound(sum.begin(),sum.end(),target);
        if((itr-sum.begin())>t) 
            cout<<-1<<endl;
        else 
            cout<<(itr-sum.begin())<<endl;
    }



}