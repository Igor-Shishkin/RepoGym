package selfStudyJava.May.personData;

public class  Person {
    private String name;
    private String surName;
    private char sex;
    private byte age;
    private String pesel;


    public Person(String name, String surName, char sex, byte age, String pesel) {
        this.name = name;
        this.surName = surName;
        this.sex = sex;
        this.age = age;
        this.pesel = pesel;
    }

    public Person() {
        super();
        this.name = null;
        this.surName = null;
        this.sex = 'x';
        this.age = -1;
        this.pesel = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n\tsex: %c\n\tage: %d\n\tpesel: %s"
                , this.name, this.surName, this.sex, this.age, this.pesel);
    }


}