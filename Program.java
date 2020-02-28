import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        CustomArrayList<String> customArrayList = new CustomArrayList<String>();
        System.out.printf("Is Empty: %s%n", customArrayList.isEmpty());
        System.out.printf("Array Size: %s%n", customArrayList.size());

        customArrayList.add("value1");
        customArrayList.add("value2");
        customArrayList.add("value3");
        customArrayList.add("value4");
        customArrayList.add("value5");

        System.out.printf("Is Empty: %s%n", customArrayList.isEmpty());
        System.out.printf("Array Size: %s%n", customArrayList.size());
    }
}