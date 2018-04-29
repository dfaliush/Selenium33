import org.junit.Assert;
import java.util.Scanner;

public class Methods {


    public int sumTwoNumbers(int x, int y){
        return x + y;
    }

    public int maxValueOfTwo(int x, int y){
        // without case x equals y
        if(x < y){
            return y;
        } else
            return x;
    }

    public int minValueOfTwo(int x, int y){
        // without case x equals y
        if(x < y){
            return x;
        } else
            return y;
    }

    /**
     *
     */

    boolean isTheSameNumbersPresent() {
        System.out.println("Please, input a three-digit integer: ");
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.nextLine());
        Assert.assertTrue( "The number consists from more than 3 digits", a / 1000 < 1);

        int hundreds = a / 100;
        int tens = a % 100 / 10;
        int units = a % 100 % 10;

        return hundreds == tens || hundreds == units || tens == units;
    }

    public String findFactorialFromNumber(int number){
        int factorial = 1;
        int counter = 1;
        if (number == 0 || number == 1){
            return String.valueOf(factorial);
        }else if (number % 2 != 0){
            return "can't calculate the factorial of " + number;

        }else {
            while (number / counter != 1){
                number = number /counter;
                counter += 1;
                factorial += 1;
            }
            return String.valueOf(factorial);
        }

    }

    public static double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public boolean isTriangleExists(double x, double y, double z){
        return x + y > z && x + z > y && z + y > x;
    }

    public void printTriangleFromZeros(int zerosAmount){
        String zero = "0 ";
        for (int k=zerosAmount; k > 0; k--){
            for (int i=0; i < k; i++){
                System.out.print(zero);
            }
            System.out.println();
        }
    }

    public double massIndexOfBody(double heightInMeters, double weightInKg){
        return weightInKg/Math.pow(heightInMeters, 2);
    }

    public double volume(double lenghtInMeters, double widthInMeters, double depthInMeters){
        return lenghtInMeters * widthInMeters * depthInMeters * 1000;
    }

    public int numbersCounterInArray(int[] list){
        int counter = 0;
        for (int digit : list) {
            if (digit == 2){
                counter += 1;
            }
        }

        return counter;
    }

    public String bankWithTheBestCurrencyRate(String[] listOfBanksWithCurrencyRate){

        double theBestRate = 0;
        String theBestBank = "noBank";


        for (int z=0; z < listOfBanksWithCurrencyRate.length; z++){
            String[] currentBankAndRate = listOfBanksWithCurrencyRate[z].split(" - ");
            String currentBank = currentBankAndRate[0];
            Double currentRate = Double.valueOf(currentBankAndRate[1]);
            if (currentRate > theBestRate){
                theBestBank = currentBank;
                theBestRate = currentRate;
            }
        }
        return theBestBank + ": " + theBestRate;
    }

    public void printStringSeveralTimes(String string, int howManyTimesInt){
        for (int i=0; i < howManyTimesInt; i++){
            System.out.print(string);
        }
    }

    public int sumMinAndMaxfrom3(int number){
        String numberStr = String.valueOf(number);
        if (numberStr.length() < 3 || numberStr.length() > 3){
            throw new AssertionError("please set 3-digit number");
        }

        int first = number /100;
        int second = number % 100 / 10;
        int third = number % 100 % 10;

        int sum = maxValueOfTwo(maxValueOfTwo(first, second), third)
                + minValueOfTwo(minValueOfTwo(first, second), third);
        return sum;
    }

    public double areaOfTriangle(double x, double y, double z){

        if (isTriangleExists(x, y, z)){
            double halfOfThePerimetr = (x + y + z) /2;
            double areaOfTriangle1 = Math.sqrt(halfOfThePerimetr * (halfOfThePerimetr -x) *(halfOfThePerimetr -y) * (halfOfThePerimetr - z));
            return areaOfTriangle1;
        }else {
            System.out.println("triangle isn't exist");
            return 0;
        }

    }

    public double areaOfRegularHexagon(double a){
        return areaOfTriangle(a,a,a) * 6;
    }

    public double sumOfOddfactorialFrom1To9(){
        double sumOfTheOddFactorial = 0;

        for(int i=1; i < 10; i++){
            if (i % 2 != 0 || i == 1){
                double valueOfFactorial = 1;
                for (int k=1; k < i; k++){
                    valueOfFactorial *= k;

                }
                sumOfTheOddFactorial += valueOfFactorial;
            }
        }
        return sumOfTheOddFactorial;
    }

    public double priceWithDiscount(double price){

        if (price <= 1000){
            return price;
        }else if (price >= 1001 && price <= 2000){
            return price * 0.98;
        }else if (price >= 2001 && price <= 5000){
            return price * 0.95;
        }else if (price >= 5001){
            return price * 0.93;
        }else {
            throw new AssertionError("some trouble with price");
        }
    }


}


