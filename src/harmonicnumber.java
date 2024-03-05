public class harmonicnumber {
    public static void main(String args[]){
        int num =3;
        double result = 0.0;
        System.out.println("Harmonic number is:");
        while(num>0)
        {
            result =result + (double)1/num;
            num--;
            System.out.println(result + ",");

        }
    }
}
