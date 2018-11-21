public class Runner {

    public static void main(String[] args) {
        int[] arr = {34, 364, 12, 463, 9, 543, 234};

        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }

        MergeSort.merge(arr, 0, (arr.length / 2), arr.length, temp);

        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }
}
