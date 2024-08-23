package com.keshab;
enum Laptop
{
    MacBook(2000), XPS(2200), Surface(), ThinkPad(1800);
    private int price;

    private Laptop(int price)
    {
        this.price = price;
    }
    private Laptop()
    {
        this.price = 500;
    }
    public int getPrice()
    {
        return this.price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap = Laptop.MacBook;
//        System.out.println(lap);
//        System.out.println(lap.getPrice());

        for(Laptop lap: Laptop.values())
        {
            System.out.println(lap+" "+lap.getPrice());
        }
    }
}
