class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        // p1=m-1;
        // p2=n-2;
        m--;
        n--;
        for(int i= m+n+1; i>=0; i--){
            int a=m>=0? num1[m]:Integer.MIN_VALUE;
            int b=n>=0? num2[n]:Integer.MIN_VALUE;
            if (a>b){
                num1[i]= a;
                m--;
            }
            else{
                num1[i]=b;
                n--;
            }
        }
    }
}