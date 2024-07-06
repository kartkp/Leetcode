class Solution {
  public int passThePillow(int a, int t) {
    t %= (a - 1) * 2;
    if (t < a)
      return 1 + t;
    return a - (t - (a - 1));
  }}
