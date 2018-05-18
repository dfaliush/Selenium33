public class MainClass {
    public static void main(String[] args) {

        Methods methods = new Methods();
        int[] masiv4ik = new int[8];

        int c = methods.sumTwoNumbers(5, 7);
        int d = methods.sumTwoNumbers(10, 11);
//        System.out.println("Sum of two numbers: " + methods.sumTwoNumbers(c, d));
//        System.out.println("Max value: " + methods.maxValueOfTwo(c, d));
//        System.out.println("Min value: " + methods.minValueOfTwo (c, d));


//        System.out.println(methods.findFactorialFromNumber(3628800));
//        System.out.println(Methods.getDistance(1,1, 2,2));
//        System.out.println(methods.isTriangleExists(1,2,4));
//        methods.printTriangleFromZeros(7);
//        System.out.println(methods.massIndexOfBody(1.57, 53));
//        System.out.println(methods.isTheSameNumbersPresent());
//        System.out.println(methods.volume(1,1,1));
//        int[] ratingList = new int[]{2, 3, 2,5,5,2};
//        System.out.println(methods.numbersCounterInArray(ratingList));

//        String[] banksWithCurrencyRate = new String[]{"bank1 - 1.2", "bank2 - 1.3", "bank3 - 1.4"};
//        System.out.println(methods.bankWithTheBestCurrencyRate(banksWithCurrencyRate));
//
//        methods.printStringSeveralTimes("bla1", 10);
//        System.out.println(methods.sumMinAndMaxfrom3(589));
//        System.out.println(methods.areaOfTriangle(1,1,1));
//        System.out.println(methods.areaOfRegularHexagon(2));
//        System.out.println(methods.sumOfOddfactorialFrom1To9());
//        System.out.println(methods.priceWithDiscount(5005));
//        System.out.println(methods.areaOfEquilateralTriangle(1));

        methods.fillArray(masiv4ik);

        int[] arr = new int[]{1,2,4,5,6};
        int[] mass = {-1,101,3,4,5,3,8, 100,101,0};
        double[] mass1 = {-1,10,3,4,5,6,8,};

//        methods.sumOfElementsDivisibleByNumber(masiv4ik, 3);
//        System.out.println(methods.sumOfElementsMaxMin(masiv4ik));
//        System.out.println(methods.resultOfMultipleElementsWhichBiggerThanNumber(masiv4ik, 75));
//        System.out.println(methods.isSortedArray(masiv4ik));
//        System.out.println(methods.isSortedArray(arr));
//        System.out.println(methods.isSortedArray(mass));
//        System.out.println(methods.indexesOfZeroInArray(mass));
//        System.out.println(methods.positiveOrNegativeIsTheFirst(mass));
//        System.out.println(methods.replacingSmallerNumberThanKOnK(mass, 3));
//        System.out.println(methods.positiveNegativeZeroCounter(mass));
//        System.out.println(methods.changePlacesMaxAndMin(mass));
//        methods.numbersSmallerThanTheirIndex(mass1);
//        methods.remainderOfTheDivision(mass, 2 , 1);
//        methods.changeThePosinionByOne(mass);
//        methods.printValuesBeforeZero(mass);
//        System.out.println(methods.sumOfElementsMaxMin(mass));
//        methods.arrayWhichEndsOnNumber(mass, 1);
//        System.out.println(methods.arrayWhichEndsOnNumber(mass, 1));
//        System.out.println(methods.resultOfMultipleNegativePositive(mass));
//        methods.findMaxValueInArrayreplaceOnZero(mass);
        methods.splitArrayForPositiveNegativeZeroNumbers(mass);
    }

}
