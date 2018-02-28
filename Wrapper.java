import java.util.*;
import java.util.Scanner;
public class Wrapper {

	static private Integer array[];
	static private Integer arr[];
    private Integer length;
 
    public void sort(Integer[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lo, int hi) {
    	Integer i = lo;
    	Integer j = hi;
       
        int pivot = array[lo+(hi-lo)/2];
       
        while (i <= j) {
           
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lo < j)
            quickSort(lo, j);
        if (i < hi)
            quickSort(i, hi);
    }
 
    private void exchangeNumbers(Integer i, Integer j) {
    	Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
    	
        Wrapper sorter = new Wrapper();
        System.out.println("How many numbers in array?: ");
        Scanner scnr = new Scanner(System.in);
        int n1 = scnr.nextInt();
        Integer[] input = new Integer[n1];
        for(Integer i = 0; i < n1; i++) {
        	System.out.println("Number?: ");
        	Integer x1 = scnr.nextInt(); 
           	    input[i] = x1;                
        	}
        	sorter.sort(input);
            for(int j:input){
                System.out.print(j);
                System.out.print(" ");
       }
        }
    }



