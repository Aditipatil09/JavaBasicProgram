public class smallestelementarray {
    public static void main(String args[]){
        int arr[] = new int [] {14, 12,11,10,15,23};
        int min= arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        {
            System.out.println("The smallest elements in a array:" +min);
        }
    }

}
