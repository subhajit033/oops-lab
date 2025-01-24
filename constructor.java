class test {
    static int a = 3;
    int b = 4;

    test() {
        System.out.println("Hello from test");
    }

    test(int a) {
        System.out.println("Test - " + a);
    }

    final void greet() {
        System.out.println("Hello");
    }

    void dislay() {
        System.out.println("Hello kaka");
    }

}

class check extends test {
    check() {
        // super(5);
        System.out.println("Hello from check");
    }

}

public class constructor {
    public static void main(String[] args) {
        check ck = new check();
        ck.dislay();
        System.out.println(test.a);
        test t = new test();
        System.out.println(t.b);
    }
}
