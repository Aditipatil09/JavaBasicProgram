public class leapyear {
    public static void main(String args[]){
        int year =2024;
        if(year%4==0 || year==100)
        {
            System.out.println("Year is leap:");
        } else
        {
            System.out.println("Year is not a leap:");
        }
    }
}
