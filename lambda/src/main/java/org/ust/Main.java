package org.ust;

import java.awt.image.ImageProducer;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        the normal approach
//       Operation add = new Addition();
//       System.out.println(add.calculate(5,6));
//
//       // anonymous class
//        Operation sub = new Operation() {
//            @Override
//            public int calculate(int a, int b) {
//                return a - b;
//            }
//        };
//
//        // lambda approach
//
//        System.out.println(sub.calculate(10,8));




//        using inbuilt functional interface

        Predicate<Integer> oddOrEven = (a) -> a % 2 == 0;

        Predicate<String> palindrome = (s) -> {
            int low = 0, high = s.length() - 1;
            while(low < high){
                if(s.charAt(low) != s.charAt(high)){
                    return false;
                }
                low ++;
                high --;
            }
            return true;
        };

        BiFunction<Double, Double, Double> power = (a, b) -> Math.pow(a, b);

        String string = "abcdef";

        System.out.println(oddOrEven.test(10) + " " + palindrome.test(string) + " " + power.apply(2.0,4.0));





        }
    }
