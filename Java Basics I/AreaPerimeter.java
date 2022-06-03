// Write a Java program to print the area and perimeter of a circle.
public class AreaPerimeter {
    public static void main(String[] args) {
        int r = 23;
        double area = (2*r)*Math.PI;
        double perimeter = Math.PI*Math.pow(r, 2);
        System.out.println(area + " " + perimeter);
    }
}
