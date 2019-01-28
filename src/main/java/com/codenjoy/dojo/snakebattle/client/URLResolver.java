package com.codenjoy.dojo.snakebattle.client;

import java.io.IOException;
import java.util.Properties;

public class URLResolver {
    public static String getURL() {
        Properties properties = new Properties();
        try {
            properties.load(YourSolver.class.getClassLoader().getResourceAsStream("/server-local.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("server.url");
    }
}
