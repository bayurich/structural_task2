package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //2 + 2:    BIN: 10 + 10 = 100
        System.out.println(bins.sum(getBinary(2),getBinary(2)));
        System.out.println(bins.sum("10","10"));

        //10 + 22   BIN: 1010 + 10110 = 100000
        System.out.println(bins.sum(getBinary(10),getBinary(22)));
        System.out.println(bins.sum("1010","10110"));

        //10 * 33   BIN: 1010 * 100001 = 101001010
        System.out.println(bins.mult(getBinary(10),getBinary(33)));
        System.out.println(bins.mult("1010","100001"));
    }

    public static String getBinary(int i){
        return Integer.toBinaryString(i);
    }
}
