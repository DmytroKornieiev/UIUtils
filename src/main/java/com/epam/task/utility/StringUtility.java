package com.epam.task.utility;

import java.util.Properties;

public class StringUtility {

    public static boolean hasLength(String str) {
        return (str != null && str.length() > 0);
    }

    public static String uppercaseFirstChar(String in ) {
        if ( in == null || in .length() == 0) {
            return in;
        }
        int length = in .length();
        StringBuilder sb = new StringBuilder(length);

        sb.append(Character.toUpperCase( in .charAt(0)));
        if (length > 1) {
            String remaining = in .substring(1);
            sb.append(remaining);
        }
        return sb.toString();
    }

    public static String upperCase(final String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static String lowerCase(final String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String getClasspath() {
        Properties prop = System.getProperties();
        return prop.getProperty("java.class.path", null);
    }
}
