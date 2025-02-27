package templars.abstergo.helix;

import java.text.MessageFormat;
import java.util.Scanner;

interface SharedResource {
    Scanner scanner = new Scanner(System.in);
}

class ComplexNumber implements SharedResource {
    int real;
    int imaginary;

    void GetInput() {
        System.out.print("Complex Number\nenter real part:");
        real = scanner.nextInt();

        System.out.print("enter imaginary part:");
        imaginary = scanner.nextInt();
    }

    ComplexNumber GetComplexNumberSum(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {

        ComplexNumber complexNumberResult = new ComplexNumber();

        complexNumberResult.real = complexNumber1.real + complexNumber2.real;

        complexNumberResult.imaginary = complexNumber1.imaginary + complexNumber2.imaginary;

        return complexNumberResult;
    }

    void Show() {
        System.out.printf(MessageFormat.format("real : {0} imaginary : {1}", real, imaginary));
    }
}

public class ComplexDemo implements SharedResource {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber();
        ComplexNumber complexNumber2 = new ComplexNumber();

        complexNumber1.GetInput();
        complexNumber2.GetInput();

        scanner.close();

        ComplexNumber resComplexNumber = new ComplexNumber();

        resComplexNumber = resComplexNumber.GetComplexNumberSum(complexNumber1, complexNumber2);

        System.out.println("the resultant complex number is : ");

        resComplexNumber.Show();
    }
}