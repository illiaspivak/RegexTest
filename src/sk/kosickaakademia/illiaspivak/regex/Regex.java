package sk.kosickaakademia.illiaspivak.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean checkValue (String text){
        if (text == null)
            return false;
        Pattern pattern = Pattern.compile("^(([1-9][0-9]*|0)|(0[\\\\.,]|[1-9][0-9]*[\\\\.,])([1-9][0-9]|0[1-9]))$");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

}
