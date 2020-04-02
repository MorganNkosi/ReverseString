public class ReverseString {

    static String reverse(String word) {
        char letters[] = new char[word.length()];           //make each letter a character

        int letterIndex = 0;
        for (int i = word.length() - 1; i >= 0 ; i--) {     //read string from last letter
            letters[letterIndex] = word.charAt(i);          //populate the char array in reverse
            letterIndex++;                                  //increments to next index
        }

        String reversed = "";                               //to store reversed word
        for (int i = 0; i < word.length() ; i++) {
            reversed += letters[i];                         //rewrite the string in reverse
        }
        return reversed;
    }
}
