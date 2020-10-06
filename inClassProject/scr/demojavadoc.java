
/**
 * this is a demo of javadoc
 * @author Thordur Eythosson
 * @version 1.0
 * @since 6/10-2020
 *                 //other @className (this will link to it) @see
 */

public class demojavadoc {

    /**
     *
     */



    /**
     * this method adds two numbers
     *
     * @param num1  This is the first number to add
     * @param num2  This is the second number to add
     * @param num3  This is the third number to add
     * @return      The result of the addition of num1 and num2
     */
    public static int add(int num1, int num2, int num3){

        int result = num1 + num2;

        return result;
    }

    /**
     *
     * @param args the argumentsfor the VM
     */

    public static void main(String args[]) {
        System.out.println(add(2,3));

    }
}
