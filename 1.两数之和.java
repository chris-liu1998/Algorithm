/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 创建哈希表
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // 判断哈希表中是否存在相应键值对
            if (hash.containsKey(target - nums[i])) {
                return new int[] { hash.get(target - nums[i]), i };
            }
            // 仍需要遍历，将当前元素及下标存入hashmap
            hash.put(nums[i], i);
        }
        // 无结果 输出空
        return new int[0];
    }
}
// @lc code=end
