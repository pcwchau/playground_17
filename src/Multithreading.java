public class Multithreading {
    public static void main(String[] args) {
        Runnable taskOne = () -> System.out.println("hi");
        Thread thread = new Thread(taskOne);
        thread.start();
    }
}
