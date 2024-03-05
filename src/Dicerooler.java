
import java.util.Random;
public class Dicerooler {
    public static void main(String args[]){
        Random random =new Random();
        int diceResult =random.nextInt(6) +1;
        System.out.println("The player rolls die and gets:" +diceResult);
    }
}
