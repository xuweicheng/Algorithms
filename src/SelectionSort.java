public class SelectionSort {

    public static void main(String[] args) {
        int[] intArr = {64, 25, 12, 50, 7};
        int min, minIndex, temp;

        for(int i = 0; i < intArr.length; i++){
            min = intArr[i];
            minIndex = i;
            for(int j = i + 1; j < intArr.length; j++){
                if(intArr[j] < min){
                    min = intArr[j];
                    minIndex = j;
                }
            }

            temp = intArr[i];
            intArr[i] = min;
            intArr[minIndex] = temp;
        }

        for(int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
