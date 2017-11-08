import java.util.Arrays;
public class mergesort {
    public static void main(String args[]) {

        int[] test = {6,9,1,3,4,2,11};
        int[] returnValue = mergesorts(test);
        
        System.out.println(Arrays.toString(returnValue));
    }

    static int[] mergesorts(int[] array){
         
        int n = array.length;
        //base case : important for recursion
        if(n<2){
            System.out.println("base: " + array[0]);
            return array;
        }
        int[] left;
        int[] right;

          // creating space for left and right subarrays
                if (n % 2 == 0) {
                    left = new int[n/2];
                    right = new int[n/2];
                } 
                else {
                    left = new int[n/2];  // {7/2 = 3}
                    right = new int[n/2+1]; // {7/2 +1  = 4}
                }

                //filling up these two arrays

                for(int i=0;i<n;i++){
                    if(i<n/2){
                        left[i] = array[i];
                    }
                    else{
                        //System.out.println(i + "," + n + "," + n/2+ "," + (i-n/2));
                        right[i-(n/2)] = array[i];
                    }
                }

                left = mergesorts(left);
                right = mergesorts(right);

                System.out.println("left size: " + left.length + ", array: " + Arrays.toString(left));
                System.out.println("right size: " + right.length + ", array: " + Arrays.toString(right));
                
                return mergeTwoArrays(left,right);
    }

    static int[] mergeTwoArrays(int[] a,int[] b){
        int totalSize = a.length + b.length;
        int[] returnValue = new int[totalSize];  
        int leftArrayBegin = 0; int rightArrayBegin = 0;
        int pointer = 0;
        while(leftArrayBegin <= a.length-1 && rightArrayBegin <= b.length-1){
            //System.out.println("here : " + leftArrayBegin + ": " + rightArrayBegin);
            if(a[leftArrayBegin]<b[rightArrayBegin]){
                
                returnValue[pointer++] = a[leftArrayBegin++];
                
            }
            else if (a[leftArrayBegin]>b[rightArrayBegin]){
                
                returnValue[pointer++] = b[rightArrayBegin++];
                
            }
        }

        while(leftArrayBegin<=a.length-1){
            returnValue[pointer] = a[leftArrayBegin];
            pointer++; leftArrayBegin++;
        }

        while(rightArrayBegin<=b.length-1){
            returnValue[pointer] = b[rightArrayBegin];
            pointer++; rightArrayBegin++;
        }

        System.out.println(Arrays.toString(returnValue));
        return returnValue;
    }
}