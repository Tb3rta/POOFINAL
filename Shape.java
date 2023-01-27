public class Shape {
    double area() {
       return 0;
    }
 }
 
 class Rectangle extends Shape {
    double width, height;
 
    Rectangle(double width, double height) {
       this.width = width;
       this.height = height;
    }
 
    // Overriding area()
    @Override
    double area() {
       return width * height;
    }
 }
 
 public class Main {
    public static void main(String[] args) {
       Shape shape = new Rectangle(10, 15);
       System.out.println(shape.area());
    }
 }
  {
    
}
