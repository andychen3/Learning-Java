public class Books {
    private String title;
    private int age;

    public Books(String title, int age) {
        this.title = title;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return getTitle() + " (recommended for " + getAge() + " year-olds or older)";
    }
    

}
