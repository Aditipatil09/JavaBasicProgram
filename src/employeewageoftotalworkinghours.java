
import java.util.Scanner;
public class employeewageoftotalworkinghours {
    private String name;
    private double hourlyRate;
    public employeewageoftotalworkinghours(String name , double hourlyRate)
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }
    public double claculateWage ( int hoursWorked ){
        return hoursWorked *hourlyRate;
    }
    public double calculateMonthlyWage ( int hoursPerDay , int maxTotalHours , int maxWorkingDays) {
        int totalHoursWorked = 0;
        int WorkingDays = 0;

        while (totalHoursWorked < maxTotalHours && WorkingDays < maxWorkingDays) {
            totalHoursWorked += hoursPerDay;
            workingDays++;
        }
        return calculateWage(totalHoursWorked);
    }
    public String getName(){
        return name ;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
}
public class ConditionWageCalculator{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name :");
        String Name = scanner.nextLine();
        double hourlyRate = scanner.nextDouble();

        PartTimeEmployee employee = new PartTimeEmployee(name, hourlyRate);
        int maxToatlHours =100;
        int maxWorkingDays =20;
        double monthlyWage = employee.calculateMonthlyWage(8, TotalHours, maxWorkingdays);

        System.out.println("\nPart-Time Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Hourly Rate: $" + employee.getHourlyRate());
        System.out.println("Maximum Working Days: " + maxWorkingDays);
        System.out.println("Maximum Total Hours: " + maxTotalHours);
        System.out.println("Monthly Wage: $" + monthlyWage);

        Scanner.close();

    }

}
