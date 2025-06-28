public class constructorOverloading {
    constructorOverloading(int length, int breadth) {
        System.out.println("Rectangle Area : " + (length*breadth));
    }
    constructorOverloading(int side) {
        System.out.println("Cube Area : " + (6*side*side));
    }
    public static void main(String[] args) {
        constructorOverloading rect = new constructorOverloading(5, 10);
        constructorOverloading cube = new constructorOverloading(4);
    }
}
