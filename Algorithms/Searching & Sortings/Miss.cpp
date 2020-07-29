#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
int n;
int Solve (vector<int> arr) {
  
    
   long s = 2;
   for(int i:arr){
       if(i>=s) s+=2;
   }
   return s;
}

int main() {

    ios::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin >> T;
    for(int t_i=0; t_i<T; t_i++)
    {
        
        cin >> n;
        vector<int> arr(n);
        for(int i_arr=0; i_arr<n; i_arr++)
        {
        	cin >> arr[i_arr];
        }

        int out_;
        out_ = Solve(arr);
        cout << out_;
        cout << "\n";
    }
}