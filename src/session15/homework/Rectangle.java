package session15.homework;

import java.util.Objects;

public class Rectangle {

    private int height;
    private int width;

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if ( object == null || object.getClass() != this.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return this.getWidth() == rectangle.getWidth() && this.getHeight() == rectangle.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }

}

class Test{

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
        rectangleOne.setHeight(7);
        rectangleOne.setWidth(7);
        Rectangle rectangleTwo = new Rectangle();
        rectangleTwo.setWidth(7);
        rectangleTwo.setHeight(7);

        System.out.println("rectangleOne equals to rectangleTwo:  " + rectangleOne.equals(rectangleTwo));
        System.out.println(rectangleOne.hashCode());
        System.out.println(rectangleTwo.hashCode());
    }
}
