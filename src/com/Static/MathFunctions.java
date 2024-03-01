package com.Static;

public class MathFunctions {

    private long a;
    private long b;
    private long c;
    private long r;
    private long x;
    private static double pi;
    private static double e;

    public void setA(long a) {
        this.a = a;
    }

    public void setB(long b) {
        this.b = b;
    }

    public void setC(long c) {
        this.c = c;
    }

    public void setR(long r) {
        this.r = r;
    }

    public void setX(long x) {
        this.x = x;
    }

    public static void setPi(double pi) {
        MathFunctions.pi = pi;
    }

    public static void setE(double e) {
        MathFunctions.e = e;
    }

    public void areaCircle(){
        double S = pi*Math.pow(r,2);
        System.out.println("Ayalana yuzasi : " + S);
    }

    public void ePow(){
        double result = Math.pow(e,x);
        System.out.println("e-ning x-chi darajasi : " + result);
    }

    public void areaTriangle(){
        long p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Uchburchak yuzasi : " + S);
    }

}
