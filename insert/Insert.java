import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {
        int[] arr  = { 9,8,7,1,5,3 };
        System.out.println(" result:"+ Arrays.toString(arr));
//        System.out.println(" result:"+ Arrays.toString(ascend(arr));
        System.out.println(" result:"+ Arrays.toString( whl(arr)));
    }
    public static int[] ascend(int[] arr){
        int temp;
        for(int i=1; i < arr.length; i++){

            for(int j=i; j >0; j--){
                if(arr[j]  < arr[j-1]){
                    temp=arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
            System.out.println((i)+"th iteration result: "+Arrays.toString(arr));
        }
        return arr;
    }
    public static int[] whl (int[] arr){
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
            System.out.println((i)+"th iteration result: "+Arrays.toString(arr));
        }


        return arr;
    }


}
