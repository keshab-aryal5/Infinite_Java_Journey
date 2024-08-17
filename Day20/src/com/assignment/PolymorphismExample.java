package com.assignment;
interface MyCamera
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void record4kVideo()
    {
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi
{
    String[] getNetworks();
    void connectToNetwork(String network);

}
class MyCellPhone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi
{
    public String[] getNetworks()
    {
        return new String[]{"NTC","Ncell"};
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connect to network "+network);
    }
    public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("Video recording");
    }

}
public class PolymorphismExample {
    public static void main(String[] args) {
        MyCamera mc = new MySmartPhone();
        mc.takeSnap();
        mc.recordVideo();
        mc.record4kVideo();
    }
}
