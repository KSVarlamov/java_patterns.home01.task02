package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    protected int num = 1;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.DD.yyyy hh:mm:ss");

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        Date date = new Date();
        System.out.println("[" + dateFormat.format(date) + " " + num++ + "] " + msg);
    }
}
