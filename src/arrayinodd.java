public class arrayinodd {
    public static void main(String args[]){
        int arr [] = new int[] {1,3,2,5,6};
        System.out.println("Elements of array in odd position:");
        for (int i=0; i<arr.length; i=i+2)
        {
            System.out.println(arr[i]);
        }
    }
}
