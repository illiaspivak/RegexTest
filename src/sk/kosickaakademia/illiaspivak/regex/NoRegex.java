package sk.kosickaakademia.illiaspivak.regex;

public class NoRegex {
    public boolean isValidSPZ (String text) {
        if (text == null)
            return false;
        text = text.toUpperCase().trim();
        if (text.length() != 7)
            return false;
        return true;
    }
}
