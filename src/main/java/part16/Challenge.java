package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the two methods below. Then run ChallengeTest until every
// test is green. Change only the lines marked YOUR CODE.
// You need a for loop (part 08) and String methods like charAt and indexOf (part 11).

public class Challenge {

    // Return the text with every character written twice.
    // doubleLetters("hi")     should return "hhii"
    // doubleLetters("Java")   should return "JJaavvaa"
    // doubleLetters("")       should return ""
    public static String doubleLetters(String s) {

        // Starts with an empty String to build the answer
        String result = "";

        // Goes through every character in the String
        for (int i = 0; i < s.length(); i++) {

            // Adds the current character to the result two times
            result = result + s.charAt(i) + s.charAt(i);
        }

        // Returns the finished doubled String
        return result;
    }

    // Count how many times word appears in s. Do not count overlaps:
    // once you find word, keep looking AFTER it.
    // countWord("hi hi hi", "hi")   should return 3
    // countWord("aaaa", "aa")       should return 2   (not 3)
    // countWord("hello", "bye")     should return 0
    public static int countWord(String s, String word) {
        // Starts the number of matches at zero
        int count = 0;
        // Starts searching at the beginning of the String
        int position = 0;
        // Finds the first place where word appears
        position = s.indexOf(word, position);
        // Keeps looping while another copy of word can be found
        while (position != -1) {
            // Adds one to the number of matches
            count++;
            // Moves past the word that was just found so overlaps are not counted
            position = position + word.length();
            // Looks for the next occurrence starting from the new position
            position = s.indexOf(word, position);
        }
        // Returns the total number of times word appeared
        return count;
    }
}