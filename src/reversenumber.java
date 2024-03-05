public class reversenumber {
    public static void main(String args[]){
        int n=231 , reverse=0;
        while(n!=0)
        {
            int remainder= n%10;
            reverse= reverse*10+remainder;
            n=n/10;

        }
        System.out.println("The Reverse of a given number:" +reverse);
    }
}
