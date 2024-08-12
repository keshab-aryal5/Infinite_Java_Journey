package com.keshab;
class Employee
{
    private int id = 24;
    String name;
    int age;
    public Employee(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.format("Hello my name is: %s and my age is %d\n",this.name,this.age);
    }
}
public class Keshab {
    public int age = 23;
    int lucky_num = 5;
    private int body_count = 0;
    protected int gf = 0;
    public String name = "Keshab Aryal";
    public static void main(String[] args) {
        Employee e1 = new Employee("Keshab Aryal",23);
        e1.display();
//        System.out.println(e1.id);
        Student s1 = new Student();
        Keshab kes = new Keshab();
        System.out.println(kes.body_count);

    }

}
