package Notify;



import java.util.*;

public class NotificationManager<T extends Notification> {
    private final List<T> notifications = new ArrayList<>();
    private final Map<Priority, List<T>> notifByPriority = new HashMap<>();

    public void add(T notification) {
        notifications.stream().filter(n -> n.getId() == notification.getId()).findAny().ifPresent(n -> {
            throw new DuplicateIdException(notification.getId());
        });
//      for (T notif : notifications) {
//            if (notif.getId() == notification.getId()) {
//                throw new RuntimeException("Duplicate notification id: " + notification.getId());
//      }
        notifications.add(notification);

        Priority priority = notification.getPriority();
        notifByPriority.computeIfAbsent(priority, k -> new ArrayList<>()).add(notification);
    }

    public Optional<T> find(int id) {
        return notifications.stream().filter(n -> n.getId() == id).findFirst();
    }

    public List<T> get(Priority priority) {
        List<T> getPrioritylist = notifByPriority.get(priority);
        if (getPrioritylist == null) {
            return Collections.emptyList();
        } else {
            return new ArrayList<>(getPrioritylist);
        }

    }

    public void sendAll() {
        Sendable.sendAll(notifications);
    }
}



