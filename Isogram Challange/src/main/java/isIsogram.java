import java.util.Locale;

public class isIsogram {
    public static boolean  isIsogram(String str) {
        String Input = str;
        String lowercaseInput = Input.toLowerCase();
        char letter ;
        boolean isLetterUnique = true;


        for (int i = 0; i < lowercaseInput.length(); i++ ){
            letter = lowercaseInput.charAt(i);
            int count = 0;
            for (int j = 0; j < lowercaseInput.length(); j++){
                if ( letter == lowercaseInput.charAt(j))
                    count++;

            }
            if(count == 1) {
                isLetterUnique = true;
            }
            else {
                isLetterUnique = false;
                break;
            }

        }
        return isLetterUnique;
    }
}