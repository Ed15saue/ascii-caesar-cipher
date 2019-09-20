import java.util.Scanner;
/**
 * Accepts a string and encrypts it using the Ceasar Cipher and ASCII
 *
 * @Eric Sauer
 * @1.0
 */

public class caesarCipher
{
    public static void main(String[] args){
        //Declares scanner and variables needed in main
        int[] intAscii;
        int shift;
        Scanner input = new Scanner(System.in);
        //prompts user for string to encrypt
        System.out.println("Enter a string to encrypt:");
        String toEncrypt = input.nextLine();
        //prompts user for amount of shift used in encryption
        System.out.println("Enter the amount of shift:");
        shift = input.nextInt();
        
        intAscii = convertToAscii(toEncrypt, shift).clone();
        
    }
    public static int[] convertToAscii(String input, int shift){
        //converts the string to an array of characters
        char[] encryptArray = input.toCharArray();
        int[] charToInt = new int[encryptArray.length];
        int current;
        int newNum;
        //uses the shift to encrypt the characters in the string
        for(int i = 0; i < encryptArray.length; i++){
            current = (int) encryptArray[i];
            newNum = (current + shift) % 126;
            charToInt[i] = newNum;
            System.out.println(encryptArray[i]);
        }
        return charToInt;
    }
}
