package CleanCode;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalProgramming {
    private static int sumOfNumbers(List<Integer>list, Predicate<Integer>selector)
    {
        int sum=0;
        for (var number:list) {
            if (selector.test(number))
                sum+=number;
        }
        return sum;
    }
    private static boolean isEven(int num){
        return num%2==0;
    }
    private static boolean isOdd(int num){
        return num%2!=0;
    }
    public static void main(String[] args) {
        var nums=List.of(1,2,3,4,5,6,7,8);
        System.out.println(sumOfNumbers(nums,ignore->true));
        System.out.println(sumOfNumbers(nums,FunctionalProgramming::isEven));
        System.out.println(sumOfNumbers(nums,FunctionalProgramming::isOdd));
    }
}
