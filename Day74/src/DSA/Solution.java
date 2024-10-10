//package DSA;
//
//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        int i;
//        List<Integer> integerList = new ArrayList<>();
//        for (i = 0; i < nums.length; i++) {
//            if (nums[i] == i + 1)
//                continue;
//            else {
//                do {
//                    if (nums[i] == nums[nums[i] - 1])
//                        break;
//                    else
//                        swap(nums, i, nums[i] - 1);
//                } while (nums[i] != i + 1);
//            }
//        }
//        for (i = 0; i < nums.length; i++) {
//            if (nums[i] != (i + 1)) {
//                integerList.add(i + 1);
//            }
//        }
//        return integerList;
//
//    }
//
//    public void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}