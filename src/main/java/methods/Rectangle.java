package methods;

public class Rectangle {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return 2* (this.length + this.width);
    }
    public double calculateArea(){
        return  this.length * this.width;
    }


}


