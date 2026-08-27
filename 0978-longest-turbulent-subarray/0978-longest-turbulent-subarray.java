class Solution {
    public int maxTurbulenceSize(int[] arr) {

        int count = 1;
        int max = 1;

        for (int i = 1; i < arr.length; i++) {

            if ((arr[i] > arr[i - 1] && i > 1 && arr[i - 1] < arr[i - 2]) ||
                (arr[i] < arr[i - 1] && i > 1 && arr[i - 1] > arr[i - 2])) {

                count++;
            } 
            else if (arr[i] != arr[i - 1]) {
                count = 2;
            } 
            else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}