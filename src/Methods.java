import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        /* Написать буленовский метод принимающий на вход 3 переменных типа int
        которые обозначают длину стороны для треугольника и возвращает правда
        или ложь (может ли существовать треугольник с заданными сторонами)
        Вспоминаем свойство треугольника ни одна сторона не должна быть
        длиннее суммы двух других
         */
        if (x <= 0 || y <= 0 || z <= 0){
            System.out.println("please input a value > 0");
            return false;
        }
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
        // S = sqrt( P/2(P/2 -x)(P/2 -y)(P/2 -z));
        // P = x + y + z;

        if (isTriangleExists(x, y, z)){
            double halfOfThePerimetr = (x + y + z) /2;
            double areaOfTriangle1 = Math.sqrt(halfOfThePerimetr * (halfOfThePerimetr -x) *(halfOfThePerimetr -y) * (halfOfThePerimetr - z));
            return areaOfTriangle1;
        }else {
            System.out.println("triangle isn't exist");
            return 0;
        }
    }

    public double areaOfEquilateralTriangle(double x){

        if (isTriangleExists(x, x, x)){
            double halfOfThePerimetr = (x + x + x) /2;
            double areaOfTriangle1 = Math.sqrt(halfOfThePerimetr * (halfOfThePerimetr -x) *(halfOfThePerimetr -x) * (halfOfThePerimetr - x));
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

    public int[] fillArray(int[] mass){
        /*Заполнение масива рандомными числами до 100*/
        int lengthOfArray = mass.length;
        Random random = new Random();
        for(int i = 0; i < lengthOfArray; i++){
            mass[i] = random.nextInt(100);
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
        return mass;
    }

    public int sumOfElementsDivisibleByNumber(int[] massiv, int k){
        /*Дан целочисленный массив чисел.
        Найти сумму элементов, кратных данному числу K.*/
        int sumOfElements = 0;

        int lengthOfArray = massiv.length;
        for(int i = 0; i < lengthOfArray; i++){

            if (massiv[i] % k == 0) {
                sumOfElements += massiv[i];
            }
        }
        System.out.println(sumOfElements);
        return sumOfElements;
    }


    public int sumOfElementsMaxMin(int[] mass){
        /*Дан массив чисел.
        Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).*/
        int arrayLenght = mass.length;
        int maxElem = mass[0];
        int minOddElem = mass[1];

        for (int i = 2; i < arrayLenght; i++){
            if (i % 2 == 0){
                if (maxElem < mass[i]){
                    maxElem = mass[i];
                }
            } else {
                if (minOddElem > mass[i]){
                    minOddElem = mass[i];
                }
            }
        }
        return minOddElem + maxElem;
    }


    /**
     * Дан массив целых положительных чисел.
     * Найти произведение только тех чисел, которые больше
     заданного числа М. Если таких нет, то выдать сообщение об этом.
     * @return
     */
    public long resultOfMultipleElementsWhichBiggerThanNumber(int[] array, int m){

        long result = 1;
        boolean flag = false;
        int lenght = array.length;
        for (int i=0; i < lenght; i++){
            if (array[i] > m){
                result *= array[i];
                flag = true;
            }
        }

        if (flag){
            return result;
        }else {
            return -1;
        }
    }

    /**
     * Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
     * @param arr
     * @return
     */
    public boolean isSortedArray(int[] arr){

        int l = arr.length;
//        int currentValue = 0;
        boolean flag = true;
        for (int i = 1; i < l; i++){

            if (arr[i - 1] > arr[i]){
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    /**
     * В целочисленном массиве есть нулевые элементы.
     * Создать массив из номеров этих элементов.
     * @param array
     * @return
     */
    public List indexesOfZeroInArray(int[] array){
        List listOfIndexes = new ArrayList();
        int l = array.length;
        for (int i = 0; i < l; i++){

            if (array[i] == 0){
                listOfIndexes.add(i);
            }
        }
        return listOfIndexes;
    }

    /**
     * Выяснить, какое число встречается раньше в массиве
     * – положительное или отрицательное.
     * @param arr
     * @return
     */
    public String positiveOrNegativeIsTheFirst(int[] arr){
        String theFirst = "";

        if (arr[0] >= 0){
            theFirst = "positive";
        }else {
            theFirst =  "negative";
        }
    return theFirst;
    }


    /**
     * Дан массив чисел. Создать массив из четных чисел этого массива.
     * Если таких чисел нет, то вывести сообщение об этом факте.
     * @param array
     * @return
     */
    public List evenNumbersFromArray(int[] array){
        List listOfevenNumbers = new ArrayList();
        int l = array.length;
        for (int i = 0; i < l; i++){

            if (array[i] % 2 == 0){
                listOfevenNumbers.add(array[i]);
            }
        }
        return listOfevenNumbers;
    }

    /**
     * Дан массив чисел. Заменить все его элементы, большие данного числа Z,
     * этим числом. Подсчитать количество замен.
     * @param array
     * @param k
     * @return
     */
    public List replacingSmallerNumberThanKOnK(int[] array, int k){
        List listWithReplacing = new ArrayList();
        int l = array.length;
        int counter = 0;
        for (int i = 0; i < l; i++){

            if (array[i] > k){
                listWithReplacing.add(k);
                counter ++;
            }else {
                listWithReplacing.add(array[i]);
            }
        }
        System.out.println(counter);
        return listWithReplacing;
    }

    /**
     * Дан массив чисел. Подсчитать, сколько в нем отрицательных,
     * положительных и нулевых элементов.
     * @param arr
     * @return
     */
    public String positiveNegativeZeroCounter(int[] arr){
        String positive = "positive: ";
        String negative = "negative: ";
        String zero = "zero: ";

        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        int l = arr.length;
        for (int i = 0; i < l; i++){

            if (arr[i] > 0){
                positiveCounter ++;
            }else if (arr[i] < 0){
                negativeCounter ++;
            }else
                zeroCounter ++;
        }
        return positive + String.valueOf(positiveCounter) + "\n"
                + negative + String.valueOf(negativeCounter) + "\n"
                + zero + String.valueOf(zeroCounter) + "\n";
    }

    /**
     * Дан массив чисел. Поменять местами наибольший и наименьший элементы.
     * @param arr
     * @return
     */
    public int[] changePlacesMaxAndMin(int[] arr){
        // Допускается что в массиве есть только 1 максимальный и 1 минимальный элемент
        int l = arr.length;
        int maxValue = arr[arr.length -1];
        int minValue = arr[0];

        for (int i = 0; i < l; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }

            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }

        //System.out.println(maxValue + " " + minValue);

        for (int i = 0; i < l; i++){
            if (arr[i] == maxValue){
                arr[i] = minValue;
            }else if (arr[i] == minValue){
                arr[i] = maxValue;
            }
        }
        return arr;
    }


}



