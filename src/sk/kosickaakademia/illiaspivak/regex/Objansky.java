package sk.kosickaakademia.illiaspivak.regex;

public class Objansky {
    public boolean isValidOP (String text) {
        if (text == null)
            return false;
        text = text.toUpperCase().trim();
        if (text.length() != 8)
            return false;
        for(int i=0; i<=1; i++){ //kontrola prvych dvuch znakov, ci su to pismena
            if(!Character.isLetter(text.charAt(i)))
                return false;
        }
        for(int i=2; i<=7; i++){ //kontrola dalsich znakov
            if(!Character.isDigit(text.charAt(i)))
                return false;
        }
        return true;
    }
}
