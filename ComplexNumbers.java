class Complex{
    double real;
    double imag;
    
    Complex(double r, double i){
        System.out.println("Constructor in progress: ");
        real = r;
        imag = i;
    }
    void displayComplex(){
        System.out.println(real+"+"+"i"+imag);
    }
    void testComplex(){
        Complex C = new Complex(9,9);
        C.displayComplex();
    }
}

class ComplexOperation{
   public static void main(String[]args){
    Complex i = new Complex(10,10);
    i.displayComplex();
    i.testComplex();
}
}
