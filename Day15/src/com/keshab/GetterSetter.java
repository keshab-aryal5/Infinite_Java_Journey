package com.keshab;

public class GetterSetter {
    private String name;
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public static void main(String[] args) {
        GetterSetter getset = new GetterSetter();
        getset.setName("Keshab Aryal");
        System.out.println(getset.getName());
    }
}
