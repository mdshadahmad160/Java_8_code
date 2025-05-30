package com.nc.practice;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "ShadAhmad";
        int[] freq = new int[str.length()];
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    freq[i]++;
                    charArray[j] = '0'; // Mark as counted
                }
            }
        }

        System.out.println("Character Frequency in the string: ");
        for (int i = 0; i < freq.length; i++) {
            if (charArray[i] != '0') {
                System.out.println(charArray[i] + ": " + freq[i]);
            }
        }
    }
}
