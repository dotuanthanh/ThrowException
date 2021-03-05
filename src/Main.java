public class Main {
    public static void main(String[] args) {
        try {
            TamGiac tamGiac =  new TamGiac(15,15,5);
        } catch (IllegalTriangleException e) {
            e.getMess();
        }
    }
}
