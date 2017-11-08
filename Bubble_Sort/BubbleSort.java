
import java.util.Arrays;
public class BubbleSort {
    public static void main(String args[]) {
        int list[] = {9,7,6,8};
        int len = list.length;

        boolean doShuffle;
        do{
           doShuffle= false;
            for (int i = 0; i < len-1; i++) {
                
                            if (list[i] > list[i + 1]) {
                                int temp = list[i + 1];
                                list[i + 1] = list[i];
                                list[i] = temp;
                                doShuffle = true;
                            }
                        }
        }
        while (doShuffle==true);
       
        System.out.println(Arrays.toString(list));
    }
}