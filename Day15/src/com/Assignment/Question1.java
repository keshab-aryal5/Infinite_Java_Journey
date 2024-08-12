package com.Assignment;
class Cylinder
{
    final float PI = 3.14f;
    private float radius;
    private float height;


//    Cylinder(float r, float h)
//    {
//        this.radius = r;
//        this.height = h;
//    }
    float getRadius()
    {
        return this.radius;
    }
    void setRadius(float r)
    {
        this.radius = r;
    }
    float getHeight()
    {
        return this.height;
    }
    void setHeight(float h)
    {
        this.height = h;
    }
    float Area()
    {
        float area = 2*PI*this.radius*(this.radius+this.height);
        return area;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(14.12f);
        System.out.println(cy.getRadius());

        cy.setHeight(15.12f);
        System.out.println(cy.getHeight());
        System.out.println();

    }
}
