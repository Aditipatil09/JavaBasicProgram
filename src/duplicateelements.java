public class duplicateelements {
    public static void main (String args[]){
        int arr[] =new int[] {1,2,3 ,4 ,2,1,5};
        System.out.println("Duplicate elments in array:");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
