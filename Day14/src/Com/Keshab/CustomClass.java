package Com.Keshab;

public class CustomClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 520;
        e1.name = "keshab Aryal";
        e1.printDetails();
    }
}
class Employee
{
    int id;
    String name;

    void printDetails()
    {
        System.out.format("My name is %s and my id is %d",this.name,this.id);
    }

}