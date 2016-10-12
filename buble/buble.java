
import java.util.Arrays;
public class buble {
   static int tt;


    public static void main(String[] args) {

        int arrayList[] = { 5,3,9,7,1,8 };
        System.out.println("Final result:"+Arrays.toString(ascend(arrayList)));
        System.out.println(tt);

    }

    public static int[] ascend(int[] arr){
        int temp;
        for(int i=0; i < arr.length-1; i++){
            tt = i;
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
        }
        return arr;
    }
}