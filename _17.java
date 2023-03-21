package javabasics._17;

import java.time.LocalDate;

public class _17 {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        long myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;
        myBankBalanceEuro=questionableFundsEuro+myBankBalanceEuro;
        System.out.println(myBankBalanceEuro);
        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    //we use long because it is the type that can hold the largest numbers we can write in java "also we should add l, otherwise it will be identified as an int"
     *
     *    double = 16 decimal places
     *    //we use double to give precise and accurate results
     *
     *    float = 7 decimal places
     *    // we use float when the amount of numbers we can use is 7 decimal to save memory
     *
     *
     *    int = -2,147,483,648 to 2,147,483,647
     *    // we use short when the amount of numbers we can use is 2,147,483,647
     *
     *    short = -32,768 to 32,768
     *    // we use short when the amount of numbers we can use is 32,768
     *
     *    byte = -127 to 127
     *    //we use byte for small numbers and specifically for binary calculation "maximum number in binary is 127"
     *
     *    2a: Someone's age
     *    short
     *    2b: The age of a baby in months
     *    byte
     *    2c: Money in a hedgefund in euros
     *    long
     *    2d: Price of a good in euros on amazon.com
     *    float
     *    2e: The exact weight of an apple measured by scientific equipment
     *    double
     *    2f: The number of kilometers from any 2 places in the world
     *    short
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
        LocalDate myDate= LocalDate.now();
        System.out.println(LocalDate.now());
        System.out.println(myDate.getDayOfMonth());
        System.out.println(myDate.getDayOfWeek());
        System.out.println(myDate.getDayOfYear());
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getMonthValue());
        LocalDate future= LocalDate.of(2023,10,22);
        System.out.println(myDate.isBefore(future));
        System.out.println(myDate.isAfter(future));


    }
}
