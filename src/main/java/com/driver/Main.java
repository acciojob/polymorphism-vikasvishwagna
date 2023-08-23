package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();

        int sum1 = p.product(2, 3);
        System.out.println("Product of two integers: " + sum1);

        int sum2 = p.product(2, 3, 4);
        System.out.println("Product of three integers: " + sum2);

        double sum3 = p.product(2.5, 3.5);
        System.out.println("Product of two doubles: " + sum3);
    }

    public static class Product {
        public int product(int x, int y) {
            return x + y;
        }

        public int product(int x, int y, int z) {
            return x + y + z;
        }

        public double product(double x, double y) {
            return x + y;
        }
    }
}