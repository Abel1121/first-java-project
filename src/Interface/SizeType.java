package Interface;

public enum SizeType {
    SMALL("Mały"),
    MEDIUM("Średni"),
    BIG("Duży");

    private final String translation;

    SizeType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return this.translation;
    }
}
