import java.util.Scanner;

public class Ex3Loops {
    public static void main(String[] args) {


      /*  1.Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number */

        /*        for (int i = 1; i <= 100; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }  */








        /*    2.Write a Java program to reverse a string.
              Test Data:
              Input a string: The quick brown fox
              Expected Output:
              Reverse string: xof nworb kciuq ehT         */

          /*     Scanner scanner = new Scanner(System.in);
                  System.out.println(" enetr your sentence to reverse it ");

                   String data = scanner.nextLine();
                   String reversstring= "" ;

                   for( int i = data.length() - 1 ; i>=0 ; i-- ){
                    reversstring += data.charAt(i);
               }
                System.out.println(" the revers is : " + reversstring);     */








        /*    3.Write a program to find the factorial value of any number entered
                through the keyboard.  */

        /*    Scanner scanner= new Scanner(System.in);
             System.out.print(" enter number to find factorial : ");
             int num = scanner.nextInt();
             int factnum = 1;

                for (int i = 1 ; i <= num; i++) {
                      factnum *= i;
                 } System.out.println(" the factorial is: " + factnum );    */








       /* 4.Two numbers are entered through the keyboard. Write a program to find
            the value of one number raised to the power of another. (Do not use Java
            built-in method)    */

    /*    Scanner scanner = new Scanner(System.in);
          System.out.println(" enter the number ");
          int num=scanner.nextInt();
          System.out.println(" enetr the power number ");
          int power=scanner.nextInt();
          int result = 1;

          for( int i=1 ; i<= power ; i++ ){
               result *= num;
           }   System.out.println(" the num is :" + num + "   the result of power is :" + result); */








           /* 5.Write a program that reads a set of integers,
              and then prints the sum of the even and odd integers   */



      /*         Scanner scanner = new Scanner(System.in);
                int sumodEven = 0;
                int sumofOdd = 0;
                int number;

                System.out.println("Enter a series of integers ( write  0 to stop ):");
                while (true) {
                    number = scanner.nextInt();
                    if (number == 0) {
                        break;
                    }
                    if (number % 2 == 0) {
                        sumodEven += number;
                    } else {
                        sumofOdd += number;
                    }
                }
                System.out.println("Sum of even numbers: " + sumodEven);
                System.out.println("Sum of odd numbers: " + sumofOdd); */











       /*       6.Write a program that prompts the user to input a positive integer.
                It should then output a message indicating whether the number is a prime number */

               /*    Scanner scanner = new Scanner(System.in);
                      while (true) {
                    System.out.print("enter positive integer ( or 0 to exit ): ");
                    int number = scanner.nextInt();

                    if (number == 0) {
                        System.out.println("Exiting program...");
                        break;
                    }
                    else if (number <= 1) {
                        System.out.println(number+ "  not a prime ");
                    }
                    else if (number == 2) {
                        System.out.println(number+ "  prime  ");
                    }
                    else if (number % 2 == 0) {
                        System.out.println(number+ "  not prime ");
                    }
                    else { boolean isPrime = true;
                           for (int i =3; i*i <=number; i+=2){
                               if (number % i ==0) {
                                      isPrime=false;
                                      break; } }
                        if (isPrime) {
                        System.out.println(number + " is a prime number.");
                        }
                        else {
                        System.out.println(number + " is not a prime number.");
                        }
                    }  }      */










        /*  7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
                another for loop to print the days (Days 1 -7) for each week.
                 Expected Output:
                  Week 1
                   Day1
                   Day2
                   Day3
                   Day4
                   Day5
                   Day6
                   Day7
                   Week 2
                   Day1
                   Day2
                   ..    */


              /*   for ( int week =1 ; week <=4 ; week ++  ){
                       System.out.println("Week "+ week);

                     for ( int day=1 ; day <=7 ; day ++){
                         System.out.println(" Day " +day);
                   }  }   */






        /*   8.Write a program thats check if the word is a palindrome or not. hint: A
             string is said to be a palindrome if it is the same if we start reading it from
             left to right or right to left    */

       /*       Scanner scanner=new Scanner(System.in);
                System.out.println(" Write Word to check if polinomial or not ");
                 String word = scanner.nextLine();
                 boolean palindrome=true;

                 for (int i=0 ; i< word.length()/2 ; i --) {

                if(word.charAt(i) != word.charAt(word.length() - 1 - i )  ) {
                         palindrome = false;
                         System.out.println(" Not plaindorm");
                          break;   }
                   else {
                                palindrome=true;
                                System.out.println(" plaindorm");
                                 break;     } }  */






    } }


