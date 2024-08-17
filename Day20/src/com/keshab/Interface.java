package com.keshab;
interface Camera
{
    void takeSnap();
    void recordVideo();
    default void record4kVideo()
    {
        System.out.println("Recording in 4k");
    }
}
interface Wifi
{
    String[] getNetworks();
    void ConnectToNetworks(String network);
}
class CellPhone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting...");
    }
    public void takeSnap()
    {
        System.out.println("Snap captured from Cellphone class");
    }
}
class Smartphone extends CellPhone implements Camera,Wifi
{
    public void record4kVideo()
    {
        System.out.println("Recording 4k video in Smartphone");
    }
    public void takeSnap()
    {
        System.out.println("Snap Captured");
    }
    public void recordVideo()
    {
        System.out.println("Video recorded");
    }
    public String[] getNetworks()
    {
        return new String[]{"NTC","Ncell"};
    }
    public void ConnectToNetworks(String networks)
    {
        System.out.println("Connect to networks "+networks+" successfully");
    }
}
public class Interface
{
    public static void main(String[] args) {
        Smartphone ms = new Smartphone();
        String[] ar  = ms.getNetworks();
        for(String item:ar)
        {
            System.out.println(item);
        }
        ms.record4kVideo();
    }

}