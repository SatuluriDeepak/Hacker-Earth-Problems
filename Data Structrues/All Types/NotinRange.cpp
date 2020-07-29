//#include<bits/stdc++.h>
#include<iostream>
#define pif p[i].first
#define pis p[i].second
using namespace std;
    
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    long i,j,n;
    long long sum=0;
    cin>>n;
    pair<long,long>p[n];
    for( i=0;i<n;i++)
    {
        cin>>p[i].first>>p[i].second;
    }
    sort(p,p+n);
    for(i=0,j=0;i<=1000000;i++)
    {
        if(j<n&&i>=p[j].first&&i<=p[j].second)
        {
            i=p[j].second;
            j++;
            
        }
        else
        sum+=i;
    }
    cout<<sum<<endl;
}