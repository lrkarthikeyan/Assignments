package com;

public class StringUtils {

    String a;
    String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String concatenateTwoStrings(){
        return getA()+getB();
    }
    public String reverseString(){
        String str = "";
        int len = getA().length()-1;
        for(int i = len;i>=0;i--){
            str+=getA().charAt(i);
        }
        return str;
    }

    public int length(){
        int count = 0;
        for(char ch : getA().toCharArray()){
            count++;
        }
        return count;
    }

}
