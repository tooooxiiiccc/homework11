package Notify;

public class Notification {
        private final int id;
        private String message;
        private final Priority priority;
        private static int nextId = 1;

        public Notification() {
                this("empty", Priority.NORMAL);
        }

        public Notification(String message, Priority priority) {
                this.id = nextId++;
                this.message = message;
                this.priority = priority;
        }

        public void send(){
                System.out.println(this);
        }

        public void send(String extra) {
                System.out.println(this + "\n" + extra);
        }

        @Override
        public String toString() {
                return String.format("Notification{id=%d, message='%s', priority=%s}", id, message, priority);
        }
}