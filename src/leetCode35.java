public class leetCode35 {

    public static void main(String[] args) throws Exception {
        leetCode35 ob = new leetCode35();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.searchInsert(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at " + "index " + result);
    }

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid + 1;
            } else {
                left = mid - 1;
            }
        }
        return nums[left] < target ? left + 1 : left;
    }
}
