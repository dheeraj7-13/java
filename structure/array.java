class ArrayUtilities {
    int[] data;
    // Constructor
    ArrayUtilities(int size) {
        // Instantiate the array 
        data = new int[size];
    }
    // Set data
    void setData(int[] data1) {
        // Copy the contents of data1 into data
        this.data = new int[data1.length];
        System.arraycopy(data1, 0, this.data, 0, data1.length);
    }
    // Function to find the maximum element from the array 
    int getMax() {
        // Check if the array is empty
        if (data.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {   
 
                max = data[i];
            }
        }
        return max; // Return the maximum value found
    }
    // Function to find the maximum element from the array 
    int getMin() {
        // Check if the array is empty
        if (data.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (min > data[i]) {   
                min = data[i];
            }
        }
        return min; // Return the maximum value found
    }
    double findMean() 
   {
            //declare variables
            int sum=0;
            double avg = 0.0;
            //perform addition
            for ( int i : data)  //use temp variable to traverse through array
            {
                sum= sum+i;
            }
            avg=sum/data.length;
            return avg;
 
        
   }
   double findSD() 
   {
            //declare variables
            
            double sd = 0;
            double mean = findMean();
            //perform addition
            for ( int d : data)  //use temp variable to traverse through array
            {
                sd = sd + Math.pow(d-mean,2);   // first part   E(x=x)2
            }
            sd/=data.length;
            return Math.sqrt(sd);
        
   }
 
//     // Function to find the maximum element from the array 
// int printArray() 
// {
 //         for (int i  data.length ) {
 //         System.out.println(i);
 //         }
 // }
 
}
 
class ArrayImp1 {
    public static void main(String[] args) {
        
        // Example data
        int[] data = {3, 5, 1, 8, 2};
        ArrayUtilities a1 = new ArrayUtilities(5);

        a1.setData(data);
        // Find and print the maximum element
        int maxElement = a1.getMax();
        int minElement = a1.getMin();
        System.out.println("Maximum element: " + maxElement); // Output: Maximum element: 8
        System.out.println("Minimum element: " + minElement); // Output: Maximum element: 1
        System.out.println("Mean of the array is: " + a1.findMean());
        System.out.println("The SD of array is: " + a1.findSD());  
    }
 }
