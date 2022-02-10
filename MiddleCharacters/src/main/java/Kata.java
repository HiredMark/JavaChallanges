class Kata {
    public static String getMiddle(String word) {
        short wordLength = (short) word.length();
        String answer = "";
        if(wordLength%2==0){
            char firstLetter = word.charAt(wordLength/2-1);
            char secondLetter = word.charAt(wordLength/2);
          answer = "" + firstLetter + secondLetter ;
        }
        else
            answer = "" + word.charAt(wordLength/2);
    return answer;
    }
}