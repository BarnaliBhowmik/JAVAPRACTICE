class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class userDefinedException {
    static void validate(int age) throws MyException {
        if (age < 18)
            throw new MyException("Age  must be 18 or above.");
        else
            System.out.println("Eligible to vote.");
    }
    public static void main(String[] args) {
        try {
            validate(16);
        }
        catch (MyException e) {
            System.out.println("Caught Exception : " + e.getMessage());
        }
    }
}
