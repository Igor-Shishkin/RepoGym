package basicsJava.enumExamples;

public enum AnimalKind {
    HORESe(false),
    CAT(false),
    DOG(true),
    SHARK(true);

    private final boolean isDangerous;

    AnimalKind(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public boolean isDangerous() {
        return isDangerous;
    }
}
