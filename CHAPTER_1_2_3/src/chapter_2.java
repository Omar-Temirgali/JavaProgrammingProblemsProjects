import java.util.Scanner;

public class chapter_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ex 2.1
        /*System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextInt();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");*/

        //ex 2.2
        /*System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);*/

        //ex 2.3
        /*System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * .305;
        System.out.println(feet + " feet is " + meters + " meters");*/

        //ex 2.4
        /*System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * .454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");*/

        //ex 2.5
        /*System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRateInput  = input.nextDouble();
        double gratuityRate = subtotal * ((gratuityRateInput)/100);
        System.out.println("The gratuity is $" + gratuityRate + " and total is $" + (subtotal + gratuityRate));*/

        //ex 2.6
        /*System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = number % 10;
        System.out.println("The sum of the digits is " + (firstDigit + secondDigit + thirdDigit));*/

        //ex 2.7
        /*System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int years = (minutes / 60) / 24 / 365;
        int days = (minutes / 60) / 24 % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");*/

        //ex 2.8
        /*System.out.print("Enter the time zone offset to GMT: ");
        int GMT = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("The current time is " + (currentHour + GMT) + ":" + currentMinute + ":" + currentSecond);*/

        //ex 2.9
        /*System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double acceleration = (v1 - v0) / t;
        System.out.println("The average acceleration is " + acceleration);*/

        //ex 2.10
        /*System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finTemperature = input.nextDouble();
        double energy = waterMass * (finTemperature - initTemperature) * 4184;
        System.out.println("The energy needed is " + energy);*/

        //ex 2.11
        /*System.out.print("Enter a number of years: ");
        int years = input.nextInt();
        System.out.println("The population in " + years + " years is " + (312032486 + (years * (int)((365 * 24 * 60 * 60.0)/7 - (365 * 24 * 60 * 60.0)/13 + (365 * 24 * 60 * 60.0)/45))));*/

        //ex 2.12
        /*System.out.print("Enter the speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = (speed * speed) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + Math.round(length * 1000) / 1000.0);*/

        //ex 2.13
        /*System.out.print("Enter the monthly saving amount: ");
        int monthlySavingAmount = input.nextInt();
        double interestRate = 1 + 0.00417;
        double firstMonth = monthlySavingAmount * interestRate;
        double secondMonth = (monthlySavingAmount + firstMonth) * interestRate;
        double thirdMonth = (monthlySavingAmount + secondMonth) * interestRate;
        double fourthMonth = (monthlySavingAmount + thirdMonth) * interestRate;
        double fifthMonth = (monthlySavingAmount + fourthMonth) * interestRate;
        double sixthMonth = (monthlySavingAmount + fifthMonth) * interestRate;
        System.out.println("After the sixth month, the account values is $" + Math.floor(sixthMonth * 100) / 100.0);*/

        //ex 2.14
        /*System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() * .45359237;
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble() * .0254;
        double BMI = weight / (height * height);
        System.out.print("BMI is " + Math.round(BMI * 10000) / 10000.0);*/

        //ex 2.15
        /*System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.pow((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))), 0.5);
        System.out.println("The distance between the two points is " + distance);*/

        //ex 2.16
        /*System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
        System.out.println("The area of hexagon is " + Math.round(area * 10000) / 10000.0);*/

        //ex 2.17
        /*System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();
        double index = 35.74 + 0.6215 * fahrenheit - 35.74 * Math.pow(speed, 0.16) + 0.4275 * fahrenheit * Math.pow(speed, 0.16);
        System.out.println("The wind chill index is " + Math.round(index * 100000) / 100000.0);*/

        //ex 2.18
        /*System.out.println("a    b    pow(a, b)");
        System.out.println(1 + "    " + 2 + "    " + (int)Math.pow(1, 2));
        System.out.println(2 + "    " + 3 + "    " + (int)Math.pow(2, 3));
        System.out.println(3 + "    " + 4 + "    " + (int)Math.pow(3, 4));
        System.out.println(4 + "    " + 5 + "    " + (int)Math.pow(4, 5));
        System.out.println(5 + "    " + 6 + "    " + (int)Math.pow(5, 6));*/

        //ex 2.19
        /*System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double side1 = Math.pow((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))), 0.5);
        double side2 = Math.pow((Math.pow((x3 - x2), 2) + (Math.pow((y3 - y2), 2))), 0.5);
        double side3 = Math.pow((Math.pow((x3 - x1), 2) + (Math.pow((y3 - y1), 2))), 0.5);
        double p = (side1 + side2 + side3) / 2;
        double area = Math.pow((p * (p - side1) * (p -side2) * (p - side3)), 0.5);
        System.out.println("The area of the triangle is " + Math.round(area * 10)/10.0);*/

        //ex 2.20
        /*System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is " + Math.round(interest * 100000) / 100000.0);*/

        //ex 2.21
        /*System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble()/1200;
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
        System.out.println("Accumulated value is $" + Math.round(futureInvestmentValue * 100) / 100.0);*/

        //ex 2.22
        /*System.out.print("Enter the input as an integer whose last two digits represent the cents: ");
        int amount = input.nextInt();;
        int remainingAmount = amount;
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");*/

        //ex 2.23
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        System.out.println("The cost of driving is $" + Math.round(((distance / milesPerGallon) * pricePerGallon)* 100) / 100.0);
    }
}
