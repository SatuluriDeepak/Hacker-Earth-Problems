#include <iostream>
#include <vector>
#include <list> 
#include <iterator> 
using namespace std;
    
int read_int() {
        int n = 0;
        for(int c = getchar_unlocked(); (c>47 && c<58); c = getchar_unlocked())
            n = (n<<1) + (n<<3) +c -48;
        return n;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout<<"enter : "<<endl;
    long t = read_int();
    while(t-->0){
        long n = read_int();
        long ans=0,cnt=0;
        for(long i=0;i<n;i++){
            long inp = read_int();
            if(inp%2==0) cnt++;
            else {
                ans=max(ans,cnt);
                cnt=0;
            }
        }
        ans=max(ans,cnt);
        if(ans==0) cout<<-1<<endl;
        else cout<<ans<<endl;
    }

}