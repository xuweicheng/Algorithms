package sorting;

/**
 * Created by Weicheng on 3/9/2018.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {19, 16, 3, 8, 10};

//        sortWithFor(array);
//        sortWithWhile(array);
        sortWithWhileEnhanced(array);

        for(int i=0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    static void sortWithWhileEnhanced(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; //j executed j-- in the last loop
        }
    }

    static void sortWithWhile(int[] array){
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i-1;
            while(j>=0){
                if(key < array[j]){
                    array[j+1] = array[j];
                    array[j] = key;
                }
                j--;
            }
        }
    }

    static void sortWithFor(int[] array){
        for(int i = 1; i < array.length; i++){

            int key = array[i];

            for(int j = i-1; j >= 0; j--){
                if(key < array[j]){
                    array[j+1] = array[j];
                    array[j] = key;
                }
            }
        }
    }
}
