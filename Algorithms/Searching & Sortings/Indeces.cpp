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
    
    int arr[26]={0};
    long sum=0;
    for(int i=0;i<n;i++){
        int temp=0;
        for(int j=i+1;j<n;j++){
            if(s[i]==s[j]){
                sum+=temp;
            }
            temp +=arr[s[j]-'a']; 
        }
        arr[s[i]-'a']++;   
    }
    cout<<sum<<endl;

}