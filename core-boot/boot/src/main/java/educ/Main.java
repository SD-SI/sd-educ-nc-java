package educ;

public class Main {
    public static void main(String[] args) {
        try {
            new Application();
        } catch (Exception e) {
            System.err.println();
            e.printStackTrace();
            System.exit(0);
        }
    }
}
