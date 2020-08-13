public class complex_mul {
    public static void main(final String[] args){

        Complex c1 = new Complex(args[0], args[1]);
        Complex c2 = new Complex(args[2], args[3]);

        Complex product = c1.multiply(c2);

        System.out.println("Product:"+ product);
    }
}

class Complex{
    double real, img;

    Complex(String real, String img) {
        this.real = Double.parseDouble(real);
        this.img = Double.parseDouble(img);
    }

    Complex multiply(Complex c) {
        Complex product = new Complex("0.0", "0.0");

        product.real = this.real * c.real - this.img * c.img;
        product.img = this.real * c.img + this.img * c.real;

        return product;
    }

    @Override
    public String toString() {
        return real+" + "+img+"i";
    }
}
