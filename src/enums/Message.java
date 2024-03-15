package enums;

public enum Message {
    A(Priority.HIGH),B(Priority.MEDIUM),C(Priority.LOW),D(Priority.LOW);

    private Priority priority;
    private Message(Priority priority) {
        this.priority = priority;
    }

    public Priority getMessagePriority() {
        return this.priority;
    }
}
