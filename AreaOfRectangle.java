public class AreaOfRectangle {
    int length, breadth;

    AreaOfRectangle(int len, int bre)
    {
        this.length = len;
        this.breadth = bre;
    }
    
    public int getArea()
    {
        int area = this.length * this.breadth;
        return area;
    }

    public static void main(String[] args) {
        AreaOfRectangle rectangle = new AreaOfRectangle(5,8);

        System.out.println("Area of rectangle: "+rectangle.getArea());
    }
}
