package Notify;

import java.sql.SQLOutput;
import java.util.List;

public interface Sendable {

    void send();


    static void sendAll(List<? extends Sendable> sendables) {
        for (Sendable sendable : sendables) {
            sendable.send();
        }

    };

    default void sendWithLogging(){
        System.out.println("[LOG] Начинаю отправку");
        send();
        System.out.println("[LOG] Завершаю отправку");
    }
}
