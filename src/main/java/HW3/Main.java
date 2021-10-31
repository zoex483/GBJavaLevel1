package HW3;

public class Main { public static int[] changer (int[] array){
    for(int i = 0; i < array.length; i++){
        array[i] = (array[i] == 0)? 1 : 0;
    }
    return array;
}
    public static void fillingNumbers (int[] array, int step, int shift) {
        for (int i = 0; i < 100; i++) {
            array[i] = shift + i * step;
        }
    }
    public static void multiplicationNumbers(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }
    public static void fillDiagonal() {
        int[][] arr = new int[0][1];
        for (int i = 0; i < 2; i++) {
        }
    }
    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    public static int minInArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int maxInArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}
