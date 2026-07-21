public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array Basics");
        System.out.println("Length: " + arr.length);
        System.out.println("Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }
    }
}
