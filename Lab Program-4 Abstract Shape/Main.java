import java.util.Scanner;

class InputScanner 
{
    Scanner in = new Scanner(System.in);

}

abstract class Shape extends InputScanner 
{
    int dim1, dim2;  
    
    void inputDimensions() 
    {
        System.out.print("Enter first dimension: ");
        dim1 = in.nextInt();
        System.out.print("Enter second dimension: ");
        dim2 = in.nextInt();
    }

    abstract void printArea();
}

class Rectangle extends Shape 
{
    
    void inputDimensions() 
    {
        System.out.print("Enter length of rectangle: ");
        dim1 = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        dim2 = in.nextInt();
    }
    
    
    void printArea() 
    {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends Shape 
{
    
    void inputDimensions() 
    {
        System.out.print("Enter base of triangle: ");
        dim1 = in.nextInt();
        System.out.print("Enter height of triangle: ");
        dim2 = in.nextInt();
    }
    
    
    void printArea() 
    {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape 
{
    
    void inputDimensions() 
    {
        System.out.print("Enter radius of circle: ");
        dim1 = in.nextInt();
        dim2 = 0;
    }
    
    
    void printArea() 
    {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle = " + area);
    }
}

public class Main
{
    public static void main(String[] args) 
    {

        Rectangle rect = new Rectangle();
        rect.inputDimensions();
        rect.printArea();

        Triangle tri = new Triangle();
        tri.inputDimensions();
        tri.printArea();

        Circle cir = new Circle();
        cir.inputDimensions();
        cir.printArea();
    }
}
