package com.automationframework.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hooks {
    public static Properties config;

    /**
     * <p>This method reads the config properties files and parses the same
     * into Key value pairs for usage across the framework</p>
     * @return Properties
     * @Version 1.0
     */
    public Properties readConfig() {
        try {
            FileInputStream fis = new FileInputStream(new File("src/main/resources/config.properties"));
            config = new Properties();
            config.load(fis);
            return config;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Hooks hooks = new Hooks();
        System.out.println(hooks.readConfig().getProperty("url"));
    }
}
