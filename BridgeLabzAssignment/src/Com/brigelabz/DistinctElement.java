package Com.brigelabz;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DistinctElement {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        HashSet<Integer> distinctElements = new HashSet<>();

        
        for (int num : array1) {
            distinctElements.add(num);
        }

     
        for (int num : array2) {
            if (!distinctElements.contains(num)) {
                distinctElements.add(num);
            }
        }

       
        System.out.println("Distinct elements:");
        for (int num : distinctElements) {
            System.out.print(num+" ");
        }
    }
}
