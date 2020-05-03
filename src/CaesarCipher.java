public class CaesarCipher {
    public static String encrypt(String input, int key){
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input.toUpperCase());
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + alphabet;

        //Count from 0 to < length of encrypted (call it i))
        for (int i = 0; i < encrypted.length(); i++){
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
            //If currChar is in the alphabet
                if (idx != -1){
                    //Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabet.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    encrypted.setCharAt(i, newChar);
                }
        }
        return encrypted.toString();
    }

    public static void main(String args[]){
        String message= "Hello you";
        int key=17;
        System.out.println(encrypt(message,key));
    }

}