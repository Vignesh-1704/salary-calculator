import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the hours worked on Sunday : ");
        int sunday = scanner.nextInt();
        System.out.print("Enter the hours worked on Monday : ");
        int monday = scanner.nextInt();
        System.out.print("Enter the hours worked on Tuesday : ");
        int tuesday = scanner.nextInt();
        System.out.print("Enter the hours worked on Wednesday : ");
        int wednesday = scanner.nextInt();
        System.out.print("Enter the hours worked on Thursday : ");
        int thursday = scanner.nextInt();
        System.out.print("Enter the hours worked on Friday : ");
        int friday = scanner.nextInt();
        System.out.print("Enter the hours worked on Saturday : ");
        int saturday = scanner.nextInt();

        int rate_per_hour = 100;

        int total_hours = sunday + monday + tuesday + wednesday + thursday + friday + saturday;
        if(total_hours > 40)
            rate_per_hour += 25;

        double salary = 0;


        int[] daily_working_hours = new int[]{sunday,monday,tuesday,wednesday,thursday,friday,saturday};
        for(int i = 0; i< daily_working_hours.length; i++)
        {
            if(i == 0)
                salary += (daily_working_hours[i]* rate_per_hour)+((daily_working_hours[i]*rate_per_hour)*0.50);

            else if(i == 6)
                salary += (daily_working_hours[i]* rate_per_hour)+((daily_working_hours[i]*rate_per_hour)*0.25);

            else if(daily_working_hours[i] == 0)
                salary += 0;

            else if(daily_working_hours[i] > 0)
            {
                if(daily_working_hours[i] < 8)
                    salary += daily_working_hours[i] * rate_per_hour;
                else
                    salary += 8 * rate_per_hour;

                int extra_hours = daily_working_hours[i] - 8;
                if(extra_hours > 0)
                {
                    salary += extra_hours * (rate_per_hour + 15);
                }
            }
        }
        System.out.println("Jeevita's Salary After Adding Bonus: " + (int)salary);
    }
}