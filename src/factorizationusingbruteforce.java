import java.util.Scanner;

public class factorizationusingbruteforce {
    public static void main(String args[]){
        int number =24;
        Scanner sc = new Scanner (System.in);


        System.out.println("Enter a number:");
        number= sc.nextInt();

        for (int i=0;i<number;i++){
            while (number%i==0)
                {
                    System.out.println(i+" ");
                    number =number /i;
                }
        }
        if(number>2) {
            System.out.println("number:");
        }




    }
}
