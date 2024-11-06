public class Square extends Rectangle{

    private int side;

    public Square(int side) {
        super(side, side);
    }


    @Override
    public void setWidth(int width){
        setSide(width);
    }
    @Override
    public void setHeight(int length){
        setSide(length);
    }

    private void setSide(int width) {
        setHeight(width);
        setWidth(width);
    }

    public void printArea(){
        System.out.println("The area of the square");
    }
}
