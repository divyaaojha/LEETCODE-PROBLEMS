class Solution {
    long mod = 1000000007;
    public long pow( int x, long n){
        if(n==0)return 1;

        long half = pow (x, n/2);
        long ans =(half * half) % mod;

        if(n % 2 == 1) ans = (ans * x) % mod;
        
        return ans;
        

    }
    

    public int countGoodNumbers(long n) {
        long evenPlaces = (n + 1) / 2;
        long oddPlaces = n / 2;

        long evenCount = pow(5, evenPlaces);
        long oddCount = pow(4, oddPlaces);

        return (int)((evenCount * oddCount) % mod);
    }
}

//n =0 - 1even
//n =1 - 1even 1 odd
//n =2 - 1e 1o 1e
//n =3 - 1e 1o 1e 1o

//n =4 - 1e 1o 1e 1o 1e
