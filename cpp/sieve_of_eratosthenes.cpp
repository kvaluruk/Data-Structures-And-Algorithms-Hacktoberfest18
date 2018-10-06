#include <bits/stdc++.h>
using namespace std;
bool prime[1000005];

void Sieve(long long int n){
    memset(prime, true, sizeof(prime));
    prime[0]=false;
    prime[1]=false;
    long long int m = sqrt(n);
    for(long long int i=2;i<=m;i++)
        if(prime[i])
            for(long long int k=i*i;k<=n;k+=i)
                prime[k]=false;
}
int main()
{
    Sieve(100);
    for(long long int i=0;i<=100;i++){
        cout<<i<<" "<<prime[i]<<endl;
    }
    return 0;
}
