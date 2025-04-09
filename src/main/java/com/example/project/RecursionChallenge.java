    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n ==1) {
                    return 2;
                }
                return 2 + bunnyEars(n - 1);
            }
        
            public static int factorial(int n){
                if (n == 1) {
                    return 1;
                }
                return n * factorial(n - 1);
            }

            public static int sumNumbers(int n){
                if (n == 1) {
                    return 1;
                }
                return n + sumNumbers(n - 1);
            }

            public static String countDown(int n){
                if (n == 0) {
                    return "Blast Off!";
                }else if (n == 1){
                    return n + " " + countDown(n - 1);
                }
                return n + "," + countDown(n - 1);
            }

            public static int power(int x, int n){
                if (n == 1) {
                    return x;
                }
                return x * power(x, n - 1);
            }

            public static int fib(int n){
                if (n == 0) {
                    return 0;
                }
                if (n == 1) {
                    return 1;
                }
                return fib(n - 1) + fib(n - 2);
            }

            public static int countX(String s){
                if (s.length() <= 1) {
                    if (s.equals("x")) {
                        return 1;
                    }
                    return 0;
                }
                System.out.println(s.substring(0, s.length() / 2));
                return countX(s.substring(0, s.length() / 2)) + countX(s.substring(s.length() / 2));
            }
            public static String changePi(String s){
                if (s.length() == 0) {
                    return "";
                }
                if (s.startsWith("pi")) {
                    return "3.14" + changePi(s.substring(2));
                }
                return s.substring(0, 1) + changePi(s.substring(1));
            }


            public static String reverse(String s){
                if (s.length() <= 1) {
                    return s;
                }
                return reverse(s.substring(s.length() / 2)) + reverse(s.substring(0, s.length() / 2));
            }

            public static Boolean isPalindrome(String s){
                if (s.length() <= 1) {
                    return true;
                }
                if (s.substring(0, 1).equals(s.substring(s.length() - 1))){
                    return isPalindrome(s.substring(1, s.length() - 1));
                }
                return false;
            }

    }