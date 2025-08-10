package Notify;

public class DuplicateIdException extends RuntimeException {
    public DuplicateIdException(int id) {
        super("Уведомление с таким id = " + id + " уже существует");
    }
}