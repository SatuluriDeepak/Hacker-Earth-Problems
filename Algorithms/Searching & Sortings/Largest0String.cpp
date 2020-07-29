#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
#include <unordered_map>
using namespace std;
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cout<<"Enter :";
    int t;
    string arr;

    cin>>t;
    cin>>arr;
    int flag =1;
    unordered_map<int, int> map;
    int sum = 0, ans = 0;
    for (int i = 0; i < t; i++) {
        if (arr[i] == '0') {
            sum++;
        } else {
            sum--;
        }
 
        if (sum > 0) {
            ans = i + 1;
        } else if (sum <= 0) {
            if (map.find(sum - 1) != map.end()) {
                ans = max(ans, i - map[sum - 1]);
            }
        }

        if (map.find(sum) == map.end()) {
            map[sum] = i;
        }
    }
    cout << ans << endl;
    
}