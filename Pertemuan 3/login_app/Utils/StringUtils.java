package Utils;

import models.Profile;

public class StringUtils {
          public static String ambilNickname(Profile profile) {
                    String[] split = profile.getFullname().split("\\s+"); //menggunakan spasi sebagai pemisah setiap array string
                    String nicknames = split[0]; //nama pertama diambil dalam string array dan di simpan dalam nicknames
                    return nicknames;
          }
}
