public class ShapeArray {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(2.5);
        Shape rectangle = new Rectangle(2, 2); 
        
        Shape[] shapeArray = {triangle, circle, rectangle};
        
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}