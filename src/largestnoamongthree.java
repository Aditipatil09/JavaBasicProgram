public class largestnoamongthree {
    public static void main(String args[]){
        int n1=12, n2 = 34 , n3= 22;

        if(n1>=n2 && n1>=n3){
            System.out.println( n1 +" is Largest no");
        }else
        if(n2>=n1 && n2>=n3){
            System.out.println(n2 + " is Largest no");
        } else {
            System.out.println(n3 + " is Largest no");
        }
    }
}
