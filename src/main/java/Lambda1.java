import java.util.function.Consumer;

public class Lambda1 {

    public static void main(String[] args) {

        test1();
        test2();
    }

    //无参数，无返回值
    public static void test1() {
        Runnable runnable = () -> System.out.println("Hello Lambda");
        runnable.run();
    }

    //有一个参数，无返回值
    public static void test2() {
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("Hello Lambda");
    }
}
