public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {76, 102, 2, 8, 100 ,21, 82, 4, 16};
       int[] sortedArray = arraySorting(arr);
       for(int i =0 ; i< sortedArray.length; i+=1){
           System.out.print(sortedArray[i]+ " ");
       }
    }

    public static int[] arraySorting(int[] arr) {
        int i, j, minValue, minIndex, temp = 0;
        for (i = 0; i < arr.length; i += 1) {
            minValue = arr[i];
            minIndex = i;
            for (j = i; j < arr.length; j += 1) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (minValue < arr[i]) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}

