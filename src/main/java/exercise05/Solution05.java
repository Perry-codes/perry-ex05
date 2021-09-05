/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Maggie Perry
 */
/*
Simple Math

Set scanner to accept keyboard input

prompt user to enter first number

save input as variable firstNum

prompt user for second number

save input as variable secondNum

output maths (add, sub, mult, div) on separate lines


 */

package exercise05;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the first number? ");

        int firstNum = sc.nextInt();

        System.out.print("What is the second number? ");

        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mult = firstNum * secondNum;
        int div = firstNum / secondNum;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n ",
                firstNum,secondNum,sum,firstNum,secondNum,sub,firstNum,secondNum,mult,firstNum,secondNum,div);
    }
}
