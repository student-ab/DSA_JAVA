package BASIC_DATA_STRUCTURE.ARRAY;

public class Fourth {
    public static void main(String[] args) {
        // -----------------------------------OPERATION ARRAY --------------------------------------------- 


        // -----------------------tranversal-------------------------
        // vist each element in array with its index through loops
        // and allocate the  memory for elements in system CAPACITY [4] 
        // int [] arr = new int[4];
        // for (int i = 0; i < arr.length; i++) {
            
        //     System.out.println(arr[i]);
        // }




         // -----------------------INSERTION-------------------------


        //  Arrays: In Java, arrays are fixed-size data structures that store elements of the same data type.
        //   Check if the array has enough space to accommodate the new element. If not, you need to resize the array.
        //  Find the index where you want to insert the new element.
        //  Shift the elements from the insertion index to the end of the array by one position.
        //  Insert the new element at the insertion index. 


        int[] arr = {1, 2, 3, 4, 5};

        // Insert the element 6 at index 2
        int index = 2;
        int newElement = 6;

        // Shift the elements from index 2 to the end of the array by one position
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the new element at index 2
        arr[index] = newElement;

        // Print the updated array
        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }



        
        





    }
    
}
