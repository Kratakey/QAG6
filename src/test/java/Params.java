public enum Params {

    SELENIDE("Селенид"), GRADLE("Градл"), RANDOM("Рандом");

    private final String text;

    Params(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
