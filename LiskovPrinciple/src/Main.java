//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square.CalculateArea());
        square.printArea();

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.CalculateArea());
        rectangle.printArea();

        useRectangle(rectangle);

        useRectangle(square);

    }

    public static void useRectangle(Rectangle rectangle){
        rectangle.setHeight(10);
        rectangle.setWidth(20);

        if(rectangle.getHeight() == 10){
            System.out.println("The height is 10");
        }
        else {
            System.out.println("The height is not 10");
        }
        if (rectangle.getWidth() == 20){
            System.out.println("The width is 20");
        }
        else {
            System.out.println("The width is not 20");
        }


    }
}