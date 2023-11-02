package Homework_07.View;

/** Класс для логирования в консоль
 *
 */
public class LogConsole implements Logging {


    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}