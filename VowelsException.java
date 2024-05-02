package com.lab_6;

import java.io.IOException;

public class VowelsException {
    String s;

    void vowelsCheck(String s) throws IOException {
        this.s = s;
        boolean hasVowels = false; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                hasVowels = true;
                break; 
            }
        }

        if (!hasVowels) {
            throw new IOException("The String does not contain any vowels.");
        } else {
            System.out.println("The string contains vowels.");
        }
    }

    public static void main(String[] args) {

        VowelsException ve = new VowelsException();

        try {
            ve.vowelsCheck("wynk");
        } catch (IOException e) {
            System.out.println("The String does not contain any vowels.");
        }
    }
}
