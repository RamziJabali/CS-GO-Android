package com.jabali.ramzi.csgo_guns.utilities;

import java.util.List;

public class StringUtil {
    public static String getConcatinate(List<String> stringList, String prefix, String delimiter) {
        String concat = "";
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                concat = stringList.get(i);
            } else {
                concat += delimiter + stringList.get(i);

            }
        }
        return prefix + concat;
    }
}
