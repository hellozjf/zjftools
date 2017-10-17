package com.hellozjf.zjftools;

import java.util.ResourceBundle;

public class StringResource {
    
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("StringResource");

    public static String getString(String key) {
        return resourceBundle.getString(key);
    }
}
