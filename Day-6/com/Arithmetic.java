package com;

public class Arithmetic {

    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int addition(){
        return getA()+getB();
    }
    public int subtraction(){
        return getA()-getB();
    }
    public int multiplication(){
        return getA()*getB();
    }
    public int division(){
        return getA()/getB();
    }
    public int modulus(){
        return getA()%getB();
    }
}