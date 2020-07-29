#include <iostream>
#include <vector>
#include<algorithm>
#include <list> 
using namespace std;
int main(){
    string s;
    long n;
    vector<string> l1,l2;
    cout<<"Enter : ";
    cin>>n;
   // string res="132";
    for(long i=0;i<n;i++){
        cin>>s;
        l1.push_back(s);
       
    }
    for (long i = 0; i < n; i++)
    {
        cin>>s;
        l2.push_back(s);
    }
    long c=0;
    while(l1.size()>0){
       
        if(l1[0]==l2[0]){  
            l1.erase(l1.begin());
            l2.erase(l2.begin());
        }
        else{
            l1.push_back(l1[0]);
            l1.erase(l1.begin());
            c++;
        }
           
    }  

    cout<<c+n<<endl;
}
   