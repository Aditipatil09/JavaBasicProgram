public class frequencyofarray {
    public static void main(String args[]){
        int arr []= new int[] {12,22,34,10,11};
        int max= arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];

        }
        {
            System.out.println("The largest elements of array:" +max);
        }
    }
}
