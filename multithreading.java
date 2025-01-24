
class Fibonacci extends Thread {

    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("Fibonaci");
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Prime extends Thread {
    int lb, ub;

    Prime(int a, int b) {
        lb = a;
        ub = b;
    }

    boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                System.out.println("Prime");
                System.out.print(i + " , ");
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
    }
}

public class multithreading {

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci(25);
        Prime pm = new Prime(3, 63);
        fb.start();
        pm.start();
    }
}