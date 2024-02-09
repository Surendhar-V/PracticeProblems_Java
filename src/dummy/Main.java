package dummy;

public class Main {

    public static void main(String[] args) {

        int i = -3;
        validateAge(i);

    }

    private static void validateAge(int age){
        if(age <0){
            throw new MyCustomException(new RuntimeException());
        }
        System.out.println("Accepted");
    }
}
