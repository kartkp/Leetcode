def sort_array(nums)
  min = nums.min
  max = nums.max
  cnt = Array.new(max- min+ 1, 0)
  nums.each { |x| cnt[x - min] += 1 }
  i = 0
  cnt.each_with_index do |c, idx|
    c.times do
      nums[i] = idx + min
      i += 1
    end
  end

  nums
end
