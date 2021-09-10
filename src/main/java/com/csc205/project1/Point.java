package com.csc205.project1;

public class Point {

    //Variables
    private double x;
    private double y;

    //Point
    public Point() {
        x = 0;
        y = 0;
    }

    //Point (double, double)
    public Point(double x, double y){
        this.x = x;
        this.y= y;
    }

    //Find Distance
    public double distance(Point z){
        double distance = (Math.sqrt(Math.pow((x - z.getX() ),2)+Math.pow((y - z.getY()),2)));
        return distance;
    }

    //Get x
    public double getX(){
        return x;
    }

    //Set x
    public void setX(double x){
        this.x = x;
    }

    //Get y
    public double getY(){
        return y;
    }
    //Set y
    public void setY(double y){
        this.y = y;
    }

    //Set Point
    public void setPoint(double x1, double y1){
        this.x = x1;
        this.y = y1;
    }

    //shift x
    public void shiftX(double n){
        this.x+= n;
    }

    //shift y
    public void shiftY(double n){
        this.y+= n;
    }

    //rotate
    public void rotate(double rad){
        this.x= (x*(Math.cos(rad)))-(y*(Math.sin(rad)));
        this.y= (x*(Math.sin(rad)))-(y*(Math.cos(rad)));
    }

    //toString
    public String toString(){
        return "{ x = " + x + ", y = " + y + "}";
    }


}
