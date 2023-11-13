package pz_3_1_5__MyNewException;

import java.util.Scanner;

public class Test {
    public void testExp() throws MyNewException {
        throw new MyNewException();
    }

    public static void main(String[] args) throws MyNewException {
        Test myNewException = new Test();
        myNewException.testExp();
    }

}






