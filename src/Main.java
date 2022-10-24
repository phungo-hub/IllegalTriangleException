public class Main {
    public static void main(String[] args) {
        try{
            Triangle t = new Triangle(0, 0, 1);
        }
        catch (IllegalTriangleException ite) {
            System.out.println("Error");
            ite.printStackTrace();
        }
    }
}
