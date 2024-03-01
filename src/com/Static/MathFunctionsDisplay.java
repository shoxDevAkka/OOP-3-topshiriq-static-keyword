package com.Static;

import java.util.Scanner;

public class MathFunctionsDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathFunctions mathFunctions = new MathFunctions();

        System.out.println("Aylana yuzasini hisoblash :");
        System.out.println("Pi qiymatini kiriting :");
        double pi = scanner.nextDouble();
        System.out.println("Aylana radiusini kiriting :");
        long r = scanner.nextLong();

        MathFunctions.setPi(pi);
        mathFunctions.setR(r);

        System.out.println();
        mathFunctions.areaCircle();
        System.out.println();

        System.out.println("e-ning x-chi darajasiga oid hisob kitob :");
        System.out.println("e-static o'zgaruvchining qiymatini kiriting :");
        double e = scanner.nextDouble();
        System.out.println("Darajani kiriting :");
        long x = scanner.nextLong();

        MathFunctions.setE(e);
        mathFunctions.setX(x);

        System.out.println();
        mathFunctions.ePow();
        System.out.println();

        System.out.println("Uchburchak yuzasini hisoblashga oid masala :");
        System.out.println("Uchburchakining a-tomonini kiriting :");
        long a = scanner.nextLong();
        System.out.println("Uchburchakining b-tomonini kiriting :");
        long b = scanner.nextLong();
        System.out.println("Uchburchakining c-tomonini kiriting :");
        long c = scanner.nextLong();

        mathFunctions.setA(a);
        mathFunctions.setB(b);
        mathFunctions.setC(c);

        System.out.println();
        mathFunctions.areaTriangle();
    }
}
