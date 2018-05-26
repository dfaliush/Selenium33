import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Methods methods = new Methods();
        int[] masiv4ik = new int[8];

        List chess = new ArrayList();

        chess.add(new Queen());
        chess.add(new Queen());
        chess.add(new King());
        chess.add(new Knight());


        for (Object c: chess){
            if (c instanceof ChessClass){
                // Polimorphism
                ChessClass chessF = (ChessClass) c;
                try {
//                    chessF.drawChess();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        int summ = methods.sumTwoNumbers(5, 7);
        Assert.assertEquals("IsNotEqual", 12, summ);
        Assert.assertEquals("IsNotEqual", 13, methods.sumTwoNumbers(6, 7));
        Assert.assertEquals("IsNotEqual", -2, methods.sumTwoNumbers(-1, -1));
        Assert.assertEquals("IsNotEqual", 0, methods.sumTwoNumbers(-1, 1));
        Assert.assertEquals("IsNotEqual", 0, methods.sumTwoNumbers(0, 0));


        Assert.assertEquals("Wrong calculation", 2, methods.divideTwoNumbers(4, 2));
        Assert.assertEquals("Wrong calculation", 0, methods.divideTwoNumbers(1, 2));
        Assert.assertEquals("Wrong calculation", 1, methods.divideTwoNumbers(2, 2));
        Assert.assertEquals("Wrong calculation", 0, methods.divideTwoNumbers(0, 1));
        Assert.assertEquals("Wrong calculation", -1 , methods.divideTwoNumbers(1, 0));


        Assert.assertEquals("Error detected", 7, methods.maxValueOfTwo(5,7));
        Assert.assertEquals("Error detected", -5, methods.maxValueOfTwo(-5,-7));
        Assert.assertEquals("Error detected", -5, methods.maxValueOfTwo(-7,-5));
        Assert.assertEquals("Error detected", 7, methods.maxValueOfTwo(0,7));
        Assert.assertEquals("Error detected", 1, methods.maxValueOfTwo(1,1));


        Assert.assertEquals("Error detected", 5, methods.minValueOfTwo(5,7));
        Assert.assertEquals("Error detected", -7, methods.minValueOfTwo(-5,-7));
        Assert.assertEquals("Error detected", -7, methods.minValueOfTwo(-7,-5));
        Assert.assertEquals("Error detected", 0, methods.minValueOfTwo(0,7));
        Assert.assertEquals("Error detected", 1, methods.minValueOfTwo(1,1));


//        Assert.assertTrue("isTheSameNumbersPresent = false. " +
//                "Please input number for True case. \n for example: 101", methods.isTheSameNumbersPresent());
//        Assert.assertFalse("isTheSameNumbersPresent = true. " +
//                "Please input number for False case. \n for example: 123", methods.isTheSameNumbersPresent());


        Assert.assertEquals("wrong factorial's calculation", "1", methods.findFactorialFromNumber(0));
        Assert.assertEquals("wrong factorial's calculation", "1", methods.findFactorialFromNumber(1));
        Assert.assertEquals("wrong factorial's calculation", "3", methods.findFactorialFromNumber(6));
        Assert.assertEquals("wrong factorial's calculation", "10", methods.findFactorialFromNumber(3628800));


        Assert.assertEquals("wrong distance", 1.41, Methods.getDistance(1,1, 2,2), 0.01);
        Assert.assertEquals("wrong distance", 0, Methods.getDistance(0,0, 0,0), 0.01);
        Assert.assertEquals("wrong distance", 0, Methods.getDistance(1,1, 1,1), 0.01);
        Assert.assertEquals("wrong distance", 0, Methods.getDistance(-1,-1, -1,-1), 0.01);
        Assert.assertEquals("wrong distance", 1, Methods.getDistance(0,1, 0,2), 0.01);
        Assert.assertEquals("wrong distance", 3, Methods.getDistance(-1,0, 2,0), 0.01);


        Assert.assertTrue("Triange doesn't exist", methods.isTriangleExists(2,2,1));
        Assert.assertTrue("Triange doesn't exist", methods.isTriangleExists(1,1,1));

        Assert.assertFalse("wrong result", methods.isTriangleExists(1,2,3));
        Assert.assertFalse("wrong result", methods.isTriangleExists(1,0,2));
        Assert.assertFalse("wrong result", methods.isTriangleExists(0,0,0));
        Assert.assertFalse("wrong result", methods.isTriangleExists(-1,2,3));


        Assert.assertEquals(24.69,  methods.massIndexOfBody(1.8, 80), 0.01);
        Assert.assertEquals(-1,  methods.massIndexOfBody(0, 80), 0.01);
        Assert.assertEquals(-1,  methods.massIndexOfBody(80, 0), 0.01);


        Assert.assertEquals("wrong volume", 1000, methods.volume(1,1,1), 0.01);
        Assert.assertEquals("wrong volume", -1, methods.volume(0,1,1), 0.01);
        Assert.assertEquals("wrong volume", -1, methods.volume(1,0,1), 0.01);
        Assert.assertEquals("wrong volume", -1, methods.volume(1,1,0), 0.01);


        Assert.assertEquals("wrong counter", 5, methods.numbersCounterInArray(new int[]{2,2,2,2,2}));
        Assert.assertEquals("wrong counter", 1, methods.numbersCounterInArray(new int[]{2}));
        Assert.assertEquals("wrong counter", 0, methods.numbersCounterInArray(new int[]{}));
        Assert.assertEquals("wrong counter", 0, methods.numbersCounterInArray(new int[]{1,3,4,6}));


        Assert.assertEquals("wrong bank", "bank3: 1.4", methods.bankWithTheBestCurrencyRate(new String[]{"bank1 - 1.2", "bank2 - 1.3", "bank3 - 1.4"}));
        Assert.assertEquals("wrong bank", "bank1: 1.2", methods.bankWithTheBestCurrencyRate(new String[]{"bank1 - 1.2", "bank2 - 1.2", "bank3 - 1.2"}));

        Assert.assertEquals("wrong string", "a", methods.printStringSeveralTimes("a", 1));
        Assert.assertEquals("wrong string", "00", methods.printStringSeveralTimes("0", 2));
        Assert.assertEquals("wrong string", "", methods.printStringSeveralTimes("0", 0));
        Assert.assertEquals("wrong string", "", methods.printStringSeveralTimes("0", -1));


        Assert.assertEquals("wrong sum of Min&Max ", 4, methods.sumMinAndMaxfrom3(123));
        Assert.assertEquals("wrong sum of Min&Max ", -1, methods.sumMinAndMaxfrom3(000));
        Assert.assertEquals("wrong sum of Min&Max ", 2, methods.sumMinAndMaxfrom3(111));
        Assert.assertEquals("wrong sum of Min&Max ", -1, methods.sumMinAndMaxfrom3(-111));


        Assert.assertEquals("wrong square of a triangle ", -1, methods.areaOfTriangle(0,0,0), 0.001);
        Assert.assertEquals("wrong square of a triangle ", 0.433, methods.areaOfTriangle(1,1,1), 0.001);
        Assert.assertEquals("wrong square of a triangle ", 1.73, methods.areaOfTriangle(2,2,2), 0.01);



        Assert.assertEquals(2.0,  methods.areaOfEquilateralTriangle(2), 0.3);
        Assert.assertEquals("wrong square of a triangle ", 1.73, methods.areaOfEquilateralTriangle(2), 0.01);
        Assert.assertEquals("wrong square of a triangle ", -1, methods.areaOfEquilateralTriangle(0), 0.01);


        Assert.assertEquals(10.392,  methods.areaOfRegularHexagon(2), 0.001);
        Assert.assertEquals(-6,  methods.areaOfRegularHexagon(0), 0.001);


        Assert.assertEquals(41067.0,  methods.sumOfOddfactorialFrom1To9(), 0.001);


        Assert.assertEquals("wrong price",999,  methods.priceWithDiscount(999), 0.001);
        Assert.assertEquals("wrong price",0,  methods.priceWithDiscount(0), 0.001);
        Assert.assertEquals("wrong price",1001 * 0.98,  methods.priceWithDiscount(1001), 0.001);
        Assert.assertEquals("wrong price",2000 * 0.98,  methods.priceWithDiscount(2000), 0.001);
        Assert.assertEquals("wrong price",2001 * 0.95,  methods.priceWithDiscount(2001), 0.001);
        Assert.assertEquals("wrong price",5000 * 0.95,  methods.priceWithDiscount(5000), 0.001);
        Assert.assertEquals("wrong price",5001 * 0.93,  methods.priceWithDiscount(5001), 0.001);


        Assert.assertEquals("wrong sum",1,  methods.sumOfElementsDivisibleByNumber(new int[]{1}, 1), 0.001);
        Assert.assertEquals("wrong sum",6,  methods.sumOfElementsDivisibleByNumber(new int[]{1, 2, 3}, 1), 0.001);
        Assert.assertEquals("wrong sum",6,  methods.sumOfElementsDivisibleByNumber(new int[]{2, 4, 3}, 2), 0.001);
        Assert.assertEquals("wrong sum",-1,  methods.sumOfElementsDivisibleByNumber(new int[]{1, 2, 3}, 0), 0.001);


        Assert.assertEquals("wrong sum",5,  methods.sumOfElementsMaxMin(new int[]{1, 2, 3}), 0.001);
        Assert.assertEquals("wrong sum",1,  methods.sumOfElementsMaxMin(new int[]{-1, 2, -2, 2}), 0.001);
        Assert.assertEquals("wrong sum",0,  methods.sumOfElementsMaxMin(new int[]{-2, 0, 0}), 0.001);
        Assert.assertEquals("wrong sum",0,  methods.sumOfElementsMaxMin(new int[]{0, 0, 0}), 0.001);
        Assert.assertEquals("wrong sum",-1,  methods.sumOfElementsMaxMin(new int[]{}), 0.001);


        Assert.assertEquals("wrong sum",6,  methods.resultOfMultipleElementsWhichBiggerThanNumber(new int[]{1, 2, 3}, 1), 0.001);
        Assert.assertEquals("wrong sum",0,  methods.resultOfMultipleElementsWhichBiggerThanNumber(new int[]{1, 2, 0}, -1), 0.001);


        Assert.assertEquals("wrong order",false,  methods.isSortedArray(new int[]{1, 2, 0}));
        Assert.assertEquals("wrong order",true,  methods.isSortedArray(new int[]{1, 2, 3}));


        Assert.assertEquals("wrong size", 1,  methods.indexesOfZeroInArray(new int[]{1, 0, 3}).size());
        Assert.assertEquals("wrong size",3,  methods.indexesOfZeroInArray(new int[]{0, 0, 0}).size());


        Assert.assertEquals("wrong sign","positive",  methods.positiveOrNegativeIsTheFirst(new int[]{0, 0, -2}));
        Assert.assertEquals("wrong sign","negative",  methods.positiveOrNegativeIsTheFirst(new int[]{-1, 0, -2}));


        Assert.assertEquals("wrong size", 1,  methods.evenNumbersFromArray(new int[]{1, 0, 3}).size());
        Assert.assertEquals("wrong size",2,  methods.evenNumbersFromArray(new int[]{2, 4, 1}).size());
        Assert.assertEquals("wrong size",0,  methods.evenNumbersFromArray(new int[]{1, 3, 5}).size());


        Assert.assertEquals("wrong count","positive: 1\nnegative: 1\nzero: 1\n",  methods.positiveNegativeZeroCounter(new int[]{-1, 0, 3}));
        Assert.assertEquals("wrong count","positive: 2\nnegative: 1\nzero: 0\n",  methods.positiveNegativeZeroCounter(new int[]{2, 4, -1}));
        Assert.assertEquals("wrong count","positive: 0\nnegative: 2\nzero: 1\n",  methods.positiveNegativeZeroCounter(new int[]{0, -3, -5}));


        Assert.assertEquals("wrong size", 2,  methods.numbersSmallerThanTheirIndex(new double[]{1, 0, 1, 4}).size());


        Assert.assertEquals("wrong size", 4,  methods.remainderOfTheDivision(new int[]{1, 0, 1, 4}, 1, 0).size());
        Assert.assertEquals("wrong size", 2,  methods.remainderOfTheDivision(new int[]{2, 3, 4, 5}, 2, 0).size());
        Assert.assertEquals("wrong size", 2,  methods.remainderOfTheDivision(new int[]{2, 3, 4, 5}, 2, 1).size());


        Assert.assertEquals("wrong size", 2,  methods.printValuesBeforeZero(new int[]{1, 0, 1, 4}).size());
        Assert.assertEquals("wrong size", 4,  methods.printValuesBeforeZero(new int[]{2, 3, 4, 0}).size());


        Assert.assertEquals("wrong size", 2,  methods.arrayWhichEndsOnNumber(new int[]{12, 0, 132, 4}, 2).size());
        Assert.assertEquals("wrong size", 4,  methods.arrayWhichEndsOnNumber(new int[]{210, 30, 40, 0}, 0).size());
        Assert.assertEquals("wrong size", 0,  methods.arrayWhichEndsOnNumber(new int[]{210, 30, 40, 0}, 1).size());


//


//        int c = methods.sumTwoNumbers(5, 7);
//        int d = methods.sumTwoNumbers(10, 11);

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
//        methods.splitArrayForPositiveNegativeZeroNumbers(mass);
//        System.out.println(methods.divideTwoNumbers(10000, 0));
    }

}
