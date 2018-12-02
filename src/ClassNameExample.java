import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_CLASS_REGEX = "^[CAP]{1}+[0-9]{4}+[GHIKLM]{1}$";

    public ClassNameExample(){
        pattern = pattern.compile(NAME_CLASS_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
