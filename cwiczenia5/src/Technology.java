public enum Technology {
    Python(500), Java(650), Linux(700);

    private int value;

    private Technology(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name() + "(" + value + ")";
    }

    public int getValue() {
        return value;
    }
}
