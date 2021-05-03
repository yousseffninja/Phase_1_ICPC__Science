#include<bits/stdc++.h>
typedef long long ll;
using namespace std;
map<ll, ll> m;
int main(){
    ll q, k, v, pp;
    scanf("%lld", &q);
    for(int i = 0; i < q; i++){
        scanf("%lld", &pp);
        switch (pp)
        {
        case 0:
           scanf("%lld %lld", &k, &v);
            m[k] = v ;
            break;
        case 1:
            scanf("%lld", &k);
            printf("%lld\n", m[k]);
            break;
        default:
            break;
        }
    }
}