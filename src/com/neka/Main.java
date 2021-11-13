package com.neka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// palindrome number : 12321  -even when you reverse it the number still remains the same

        System.out.println("Enter any number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("The number is " +num);
        int orginalNum = num;
        int rev = 0;
        //reverse the number
   while(num!=0){
       rev = rev*10 + num%10;
       num = num/10;
   }

   //checking whether it's palindrom or not
        if(rev == orginalNum){
            System.out.println("Yes Palindrome");
        }
        else{
            System.out.println("No man, nah");
        }



    }
}
