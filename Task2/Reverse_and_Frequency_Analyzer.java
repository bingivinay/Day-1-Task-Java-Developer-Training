package Task2;

import java.util.Scanner;

public class Reverse_and_Frequency_Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Total Words: " + words.length);
        System.out.println("\nReversed Words:");
        for (String word : words) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.println(word + " -> " + reverse);
        }
        String longest = words[0];
        String shortest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        System.out.println("\nLongest Word: " + longest);
        System.out.println("Shortest Word: " + shortest);
        
        System.out.println("\nWord Frequency:");
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (words[i].equals(words[k])) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            System.out.println(words[i] + " : " + count);
        }

        sc.close();
    }
}
