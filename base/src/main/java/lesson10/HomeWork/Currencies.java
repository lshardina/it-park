package lesson10.HomeWork;

public enum Currencies {

    RUB(1, 810), DOLLAR(74, 840), EURO(84, 978);

    private int course;
    private int code;

    Currencies(int course, int code) {
        this.course = course;
        this.code = code;
    }

    public int getCourse() {
        return course;
    }

}
