package TP4_1_H071231071.utils;

import TP4_1_H071231071.models.Profile;

public class StringUtils {

    public static String ambilNick(Profile profile) {
        String[] nickName = profile.getNama().split("\\s+");
        if (nickName.length == 1) {
            return nickName[0];

        } else {
            return nickName[1];
        }
    }

}
