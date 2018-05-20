import org.apache.log4j.Logger;
import org.junit.Assert;

import java.util.*;

import static java.lang.Math.abs;

public class Methods {
    Logger log;

    public Methods(){
        log = Logger.getLogger(getClass());
    }


    public int sumTwoNumbers(int x, int y){
        log.info("This method return sum of two numbers");
        return x + y;
    }

    public int divideTwoNumbers(int x, int y){

        int c;
        try {
            c = x/y;
            log.info("x / y is equal " + c);
            return c;
        }catch (ArithmeticException ex){
            log.error("Something bad. AR ex.");
            return -1;
        }
        catch (Exception e){
            log.error("Something bad");
            return -1;
        }

    }



    public int maxValueOfTwo(int x, int y){
        // without case x equals y
        int resultNumber;
        try {
            if(x < y){
                log.info("return second number");
                resultNumber = y;
            } else {
                log.info("return first number");
                resultNumber = x;
            }
        } catch (Exception e) {
            log.error("something bad");
            return -1;
        }
        return resultNumber;
    }

    public int minValueOfTwo(int x, int y){
        // without case x equals y
        if(x < y){
            return x;
        } else
            return y;
    }

    boolean isTheSameNumbersPresent() {
        boolean isSame = false;
        try {
             log.info("Please, input a three-digit integer: ");

            Scanner s = new Scanner(System.in);

            int a = Integer.parseInt(s.nextLine());
            Assert.assertTrue( "The number consists from more than 3 digits", a / 1000 < 1);

            int hundreds = a / 100;
            int tens = a % 100 / 10;
            int units = a % 100 % 10;

            isSame = hundreds == tens || hundreds == units || tens == units;
        } catch (Exception e) {
            log.error("something went wrong.");
        }

        return isSame;
    }

    public String findFactorialFromNumber(int number){
        int factorial = 1;
        int counter = 1;
        try {
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
        } catch (Exception e) {
            log.error("Something went wrong");
            return "-1";
        }

    }

    public static double getDistance(int x1, int y1, int x2, int y2){
        Double distance ;

        try {
            distance  = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            return distance;
        } catch (Exception e) {
            distance = -1.0;
            return distance;
        }

    }

    /**
     * Написать буленовский метод принимающий на вход 3 переменных типа int
     которые обозначают длину стороны для треугольника и возвращает правда
     или ложь (может ли существовать треугольник с заданными сторонами)
     Вспоминаем свойство треугольника ни одна сторона не должна быть
     длиннее суммы двух других
     * @param x
     * @param y
     * @param z
     * @return
     */
    public boolean isTriangleExists(double x, double y, double z){

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

    /**
     * 2.Дан целочисленный массив чисел.
     * Найти сумму элементов, кратных данному числу K.
     * @param massiv
     * @param k
     * @return
     */
    public int sumOfElementsDivisibleByNumber(int[] massiv, int k){

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


    /**
     * 14. Дан массив чисел.
     * Найтиmаx(а[0], а[2], ..., а[2к]) +min(а[1], а[3], …, а[2к-1]).
     * @param mass
     * @return
     */
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
     * 15.Дан массив целых положительных чисел.
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
     * 5.Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
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
     * 3.В целочисленном массиве есть нулевые элементы.
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
     * 4.Выяснить, какое число встречается раньше в массиве
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
     * 6.Дан массив чисел. Создать массив из четных чисел этого массива.
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
     * 7.Дан массив чисел. Заменить все его элементы, большие данного числа Z,
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
     * 8.Дан массив чисел. Подсчитать, сколько в нем отрицательных,
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
     * 9.Дан массив чисел. Поменять местами наибольший и наименьший элементы.
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


    /**
     * 10.Дан массив.
     * Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     * @param arr
     * @return
     */
    public double[] numbersSmallerThanTheirIndex(double[] arr){
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            if (arr[i] <= i) {
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println("");
        return arr;
    }


    /**
     * 11.Дан массив чисел. Вывести те числа,
     * у которых остаток от деления на число М равен L.
     * @param arr
     * @return
     */
    public int[] remainderOfTheDivision(int[] arr, int m, int l){
        int len = arr.length;

        for (int i = 0; i < len; i++){
            if (arr[i] % m == l){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        return  arr;
    }

    /**
     * 12. Дан массив чисел.
     * Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     * @param arr
     * @return
     */
    public int[] changeThePosinionByOne(int[] arr){
        int l = arr.length;
        for(int i=0; i < l -1 ; i +=2){
            int temporaryResult = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temporaryResult;

        }
        for (int i=0; i < l ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    /**
     * 13.Дан массив чисел, среди которых имеется один нуль.
     * Вывести на печать все числа, включительно
     до нуля.
     * @param arr
     * @return
     */
    public int[] printValuesBeforeZero(int[] arr){
        int l = arr.length;
        int zeroIndex = 0;
        for(int i=0; i < l ; i ++){
            if (arr[i] == 0){
                zeroIndex = i;
            }
        }
        for (int i=0; i <= zeroIndex; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }


    /**
     * 16.	Дан массив положительных и отрицательных чисел.
     * Заменить нулями те числа, величина которых по модулю
     * больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
     * @param mass
     * @return
     */
    public int[] zeroReplacement(int[] mass){
        int l = mass.length;
        int maxValue = mass[0];
        System.out.println();
        for (int i =1; i < l; i++){
            if (maxValue < mass[i]){
                maxValue = mass[i];
            }
        }
        for (int i =0; i < l; i++){
            if (abs(mass[i])> maxValue){
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");
        }
        return mass;
    }


    /**
     * 19.Дан массив чисел. Образовать новый массив,
     * элементами которого будут элементы исходного, оканчивающиеся на цифру k.
     * @return
     */
    public List arrayWhichEndsOnNumber(int[] mass, int k){

        int lenghtMass = mass.length;
        List list = new ArrayList();
        for(int i=0; i < lenghtMass; i++){
            if (mass[i] % 10 == k || mass[i] ==k){
                list.add(mass[i]);
            }
        }

        /* int[] array1;
        int counter = 0;
        int j = 0;
        for(int i=0; i < lenghtMass; i++){
            if (mass[i] % 10 == k || mass[i] ==k){
                counter += 1;
            }
        }
        array1 = new int[counter];
        for(int i=0; i < lenghtMass; i++){
            if (mass[i] % 10 == k || mass[i] ==k){
                array1[j] = mass[i];
                System.out.print(array1[j] + " ");
                j++;
            }
        }*/

        return list;
    }

    /**
     * 17. Дан массив чисел с положительными и отрицательными элементы.
     * Вычислить произведение отрицательных элементовP 1
     * и произведение положительных элементов Р 2 . Сравнить модуль Р 2 с
     * модулем Р 1 и указать, какое из произведений по модулю больше.
     * @param arr
     * @return
     */
    public String resultOfMultipleNegativePositive(int[] arr){
        int resultOfMultiplePositive = 1;
        int resultOfMultipleNegative = 1;

        int l = arr.length;
        for(int i=0; i<l; i++){
            if (arr[i] >= 0){
                if (arr[i] == 0){
                    resultOfMultiplePositive =0;
                }
                resultOfMultiplePositive *= arr[i];
            }else if(arr[i] < 0){
                resultOfMultipleNegative *= arr[i];
            }
        }
        if (abs(resultOfMultipleNegative) > resultOfMultiplePositive){
            return "The biggest module is: resultOfMultipleNegative";
        }else if (abs(resultOfMultipleNegative) < resultOfMultiplePositive){
            return "The biggest module is: resultOfMultiplePositive";
        }else
            return "The modules are equels";
    }

    /**
     * 18. Дан массив чисел. Среди них есть равные.
     * Найти первый максимальный элемент массива и заменить его нулем.
     * @param arr
     * @return
     */
    public int[] findMaxValueInArrayreplaceOnZero(int[] arr){
        int maxValue = 0;
        int indexOfMaxValue= 0;
        int l = arr.length;
        for(int i=0; i<l; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                indexOfMaxValue = i;
            }
        }

        arr[indexOfMaxValue] = 0;
        return arr;
    }

    /**
     * Дан масив чисел. Из этого масива создать 2-3 новых масива.
     * в первый - четные, второй - нечетные,третий - нули.
     * может быть ситуаия, что каких-то цифр нет. например, четных.
     * @param arr
     */
    public void splitArrayForPositiveNegativeZeroNumbers(int[] arr){
        List positive = new ArrayList();
        List negative = new ArrayList();
        List zeros = new ArrayList();

        int l = arr.length;
        for(int i=0; i<l; i++){
            if (arr[i] >0){
                positive.add(arr[i]);
            }else if(arr[i] < 0){
                negative.add(arr[i]);
            }else if(arr[i] == 0){
                zeros.add(arr[i]);
            }else {
                System.out.println("array is empty");
            }
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeros);
    }
}



