public class Payroll
{
    public static void main(String[] args)
    {
        int hoursWorked = 40;
        double grossPay;
        double payRate = 25.0;
        grossPay = hoursWorked * payRate;
        String totalPhrase = "Your gross pay is $ ";
        System.out.println(totalPhrase + grossPay);
    }
}
