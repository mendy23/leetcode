class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        while (i >= m && j < n) {
            temp[k++] = nums2[j++];
        }
        while (j >= n && i < m) {
            temp[k++] = nums1[i++];
        }
        
        k = 0;
        while (k < m + n) {
            nums1[k] = temp[k];
            k++;
        }
        m += n;
        n = 0;
    }
}