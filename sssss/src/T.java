import java.util.Date;
import java.util.Scanner;




class Geometric{
    String color = "green";
    boolean filled;
    private Date dateCreated;

    Geometric() {
        dateCreated = new Date();
    }

    Geometric(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    Date getDateCreated() {
        return dateCreated;
    }
    public String toString() {
        return "created on" + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}

class Triangles extends Geometric {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    Triangles() { }

    Triangles(double side1,double side2,double side3,String color,boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    double getSide1() {
        return side1;
    }

    double getSide2() {
        return side2;
    }

    double getSide3() {
        return side3;
    }

    double getArea() {
        return side1 * side2 * side3;
    }
    double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString1() {
        return "created on side is " + side1 + " " + side2 +
                " " + side3 + "\nArea is " + getArea() +
                "\nPerimeter is " + getPerimeter();
    }
}

public class T {
    public static void main(String[] args) {
        System.out.println("请输入三角形三边长度，是否填充，颜色：");
        Scanner k=new Scanner(System.in);
        double a=k.nextDouble();
        double b=k.nextDouble();
        double c=k.nextDouble();
        boolean e=k.nextBoolean();
        String d=k.nextLine();
        Triangles t = new Triangles(a,b,c,d,e);
        System.out.println("A triangle" + t.toString()+t.toString1());
    }
}

