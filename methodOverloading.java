public class methodOverloading {
    void calculate(int a, int b) {
        System.out.println("Sum : " + (a+b));
    }
    void calculate(double a, double b) {
        System.out.println("Product : " +(a*b));
    }
    public static void main(String[] args) {
        methodOverloading mo = new methodOverloading();
        mo.calculate(5, 3);
        mo.calculate(2.5, 4.5);
    }
}