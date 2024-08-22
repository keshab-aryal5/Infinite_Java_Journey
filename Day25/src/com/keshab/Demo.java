package com.keshab;
interface A
{
    int age = 44;
    String area = "Mumbai";
    void show();
    void config();

}
interface x
{
    void run();
}
interface Y extends x
{

}
class B implements A,Y
{
    public void show()
    {
        System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void run()
    {
        System.out.println("Running..");
    }
}
public class Demo {
    public static void main(String[] args) {

    }
}
