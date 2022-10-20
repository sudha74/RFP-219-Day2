package com.bl;

public class VowelConsonant {
    void checkVowelOrConsonant() {
        char ch = 's';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }

    public static void main(String[] args) {
        VowelConsonant vowelConsonant = new VowelConsonant();
        vowelConsonant.checkVowelOrConsonant();
    }
}
