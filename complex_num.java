class Complex {
    int real;
    int imaginary;

    Complex() {
        real = 0;
        imaginary = 0;
    }

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    Complex(Complex obj) {
        real = obj.real;
        imaginary = obj.imaginary;
    }

    Complex add(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        return c3;
    }

    Complex mul(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        return c3;
    }

}

public class complex_num {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(5, 10);
        Complex c3 = new Complex();
        c3 = c3.add(c1, c2);
        System.out.println("Sum: " + c3.real + " + " + c3.imaginary + "i");
    }
}
