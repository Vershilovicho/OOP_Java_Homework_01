package Homework_7.View;

import java.io.*;

public class LogFile implements Logger {
    private String Res;

    public LogFile(String Res) {
        this.Res = Res;
    }

    @Override
    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Res, true))) {
            writer.write("[FileLogger] " + message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}