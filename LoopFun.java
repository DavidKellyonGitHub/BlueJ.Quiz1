 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int fact = 1;
          for (int i = number; i > 0; i--){
              fact *=i;
            }
          return fact;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
        /*StringBuilder acronymFeed = new StringBuilder("");
        String wordHolder = "";
        int spaceIndex;
        char firstLetter;
        do{
            spaceIndex = phrase.indexOf(" ");
            wordHolder = phrase.substring(0,spaceIndex);
            acronymFeed.append(wordHolder.charAt(0));
            phrase = phrase.replaceFirst(wordHolder, "");
        } while (spaceIndex != -1 && wordHolder != "" && phrase != "");
        
        
        
            
        
          String acronymResult = acronymFeed.toString().toUpperCase();
        return acronymResult;
        */
       
        char[] letters = phrase.toCharArray();
        String firstLetters = "";
        firstLetters += String.valueOf(letters[0]);
        for (int i = 1; i < phrase.length();i++){
            if (letters[i-1] == ' '){
                firstLetters += String.valueOf(letters[i]);
            }
        }
        firstLetters = firstLetters.toUpperCase();
      return firstLetters;
    }
      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
        char[] encrypted = word.toCharArray();
        for (int i = 0; i < encrypted.length; i++){
                if (encrypted[i] == 'x' || encrypted[i] == 'y' || encrypted[i] == 'z'){
                encrypted[i] -= 23;
                } else {
                    encrypted[i] += 3;
        }
    
    }
        String encryptedResult = new String(encrypted);
        return encryptedResult;
        }
    }
