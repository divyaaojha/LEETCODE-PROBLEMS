class Solution {
    public double powrec( double x, long n ){
        //base cond
        if(n ==0)return 1;

        double half = powrec(x, n/2);

        if(n % 2 ==0) return half * half;
        return x * half * half;

    }
    public double myPow(double x, int n) {
   
        long N = n;
        if( N < 0){
            x = 1/x;
            N = -N;
        }
        return powrec( x,n);


/*
Intuition
Instead of reducing exponent by:
n-1
we reduce it by:
n/2
That is the entire optimization.
*/
    }
}