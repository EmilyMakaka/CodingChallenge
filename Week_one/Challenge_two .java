public class RectanglePerimeter {
  //class RectanglePerimeter
    void CalculatePerimeter() {
        // Declare variables
        double length;
        double width;
        double perimeter;
        
        //Assign values to the variables
        length = 5.0;
        System.out.println("Length: " + length);
        width = 3.0;
        System.out.println("Width: " + width);
    
    perimeter = 2 * (length + width);
        System.out.println("The Perimeter of the Rectangle is: " + perimeter);
    }
  //creates object and starts method CalculatePerimeter
    public static void main(String[] args) {
        (new RectanglePerimeter()).CalculatePerimeter();
    }
}
