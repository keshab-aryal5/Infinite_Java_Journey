package com.keshab;

public class Main {
    int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = x*y;
        }
        return z;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        Main ma = new Main();

        System.out.println(ma.logic(x,y));
    }
}
