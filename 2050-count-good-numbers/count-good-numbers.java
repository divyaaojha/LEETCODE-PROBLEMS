class Solution {
    long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long ans=(pow(5,even)*pow(4,odd))%mod;
        return (int) ans;
    }
    public long pow(long x,long n){
        if(n==0){
            return 1;
        }
        long half= pow(x,n/2);
        long result=(half*half)%mod;
        if(n%2==1){
            result=(result*x)%mod;
        }
        return result;
    }
}

//n =0 - 1even
//n =1 - 1even 1 odd
//n =2 - 1e 1o 1e
//n =3 - 1e 1o 1e 1o

//n =4 - 1e 1o 1e 1o 1e
