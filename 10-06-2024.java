class Solution {
  public int Height_Checker(int[] heights) {
    int ans = 0;
    int current_Height = 1;
    int[] count = new int[101];

    for (int height : heights)
      ++count[height];

    for (int height : heights) {
      while (count[current_Height] == 0)
        ++current_Height;
      if (height != current_Height)
        ++ans;
      --count[current_Height];
    }
return ans;
  }}
