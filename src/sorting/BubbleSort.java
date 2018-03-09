package sorting;

//Bubble Sort
//        1.6
//        Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
//
//        Example:
//        First Pass:
//        ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
//        ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
//        ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
//        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
//
//        Second Pass:
//        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
//        ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
//        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//        ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
//        Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
//
//        Third Pass:
//        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 5, 1, 8, 4, 2};

//        sortWithWhile(array);
//        sortWithFor(array);
        sortRecursive(array, array.length);

        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    static void sortWithFor(int[] array) {
        for (int i = 0; i < array.length; i++){
            for(int j = i; j < array.length - 1 - i; j++){
                int temp;
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    static void sortWithWhile(int[] array) {
        boolean needPass;
        int temp;

        do {
            needPass = false;
            for(int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    needPass = true;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }while(needPass);

    }

    static void sortRecursive(int[] array, int size){
        if(size == 1)
            return;

        for(int i = 0; i < size-1; i ++){
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }

        size--;
        sortRecursive(array, size);
    }
}
