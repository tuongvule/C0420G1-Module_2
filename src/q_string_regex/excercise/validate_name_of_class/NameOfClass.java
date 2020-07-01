package q_string_regex.excercise.validate_name_of_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameOfClass {
private static Pattern pattern;
private static Matcher matcher;

private static final String  NAME_CLASS_REGEX = "^[ACP][0-9]{4}[GHIKLM]$";

    public NameOfClass() {
        pattern = Pattern.compile(NAME_CLASS_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
