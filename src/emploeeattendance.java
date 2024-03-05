import java.util.Random;

public class emploeeattendance {
    public static void main(String args[]){
        int attendanceStatus = generateRandomAttendance();
         if(attendanceStatus ==1)
         {
             System.out.println("Employee is present:");
         }else
         {
             System.out.println("Employee is absent:");
         }

        }
    private static int generateRandomAttendance(){
        Random random = new Random();
        return random.nextInt(2);

    }
}
