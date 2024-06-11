package Easy;
// https://leetcode.com/problems/relative-sort-array/
public class Relative_Sort_Array_1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        for (int num : arr1) {
            count[num]++;
        }

        int i = 0;
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[i++] = num;
                count[num]--;
            }
        }

        for (int num = 0; num < count.length; num++) {
            while (count[num] > 0) {
                arr1[i++] = num;
                count[num]--;
            }
        }

        return arr1;
    }
}
