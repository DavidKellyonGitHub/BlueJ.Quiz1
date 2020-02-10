
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String concatenated = baseValue + valueToBeAdded;
        return concatenated;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reversedStringOutput = "";
        for (int i = valueToBeReversed.length() -1;i>= 0;i--){
            reversedStringOutput += valueToBeReversed.charAt(i);
        }
        
        return reversedStringOutput;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        Character midChar = word.charAt((word.length() / 2) + (1/2));
        
        return midChar;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String removeMe = charToRemove.toString(charToRemove);
        String removed = value.replaceAll(removeMe, "");
        return removed;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    
    public String getLastWord(String sentence) {
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        String lastWord = sentence.substring(lastSpaceIndex+1,sentence.length());
        return lastWord;
    }
}
