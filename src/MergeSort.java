public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left; int j = mid + 1; int k = left;

        while(i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i]; i ++; k ++;
            }
            else {
                temp[k] = arr[j]; j ++; k ++;
            }
        }

        while (i <= mid) {
            temp[k] = arr[i]; i ++; k ++;
        }

        while (j <= right) {
            temp[k] = arr[j]; j ++; k ++;
        }

        for (int l = left; l <= right; l ++) {
            arr[l] = temp[l];
        }
    }

}
