
import java.util.Arrays;
public class SelectionSort {
    public static void main(String args[]) {
        int list[] = {1,3,2,6,5,9,4};
		//System.out.println(Arrays.toString(list));
        int len =list.length;
        for(int i=0;i<len;i++){
            
            int index = i;
            for(int j=i;j<len;j++){
                if(list[j]<list[i]){
                    
                    index =j;
                }
            }
            int temp = list[index];
            list[index] = list[i];
            list[i] = temp;
        }

        System.out.println(Arrays.toString(list));
    }
}