package login_app.utils;

public class StringUtils {

    public static String nickName(String fullname){
        String[] x = fullname.split(" ");
        if (x.length > 1){
            return x[1];
        } else {
            return x[0];
        }
    }
}
