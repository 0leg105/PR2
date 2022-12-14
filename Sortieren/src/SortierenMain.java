/*
    Bubblesort
 */

import java.util.stream.IntStream;

public class SortierenMain {
    public static void main(String[] args) {
        int [] arr = bubblesort();
        IntStream.of(arr).forEach(System.out::println);
    }

    public static int[] bubblesort(){
        int[] arr = {6,3,1,5,2,4};
        for(int i = 0; i < arr.length-1; i++){
            if(arr[counter] < arr[counter+1]){
                sortiert[i]= arr[counter];
                arr[]
            }else{
                sortiert[i] = arr[counter+1];

            }
            counter++;
        }
        return sortiert;
    }
}
