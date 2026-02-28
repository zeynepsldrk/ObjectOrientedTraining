package ReaderSimulation;

public class Reader {

    String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void read(Book book)
    {
        System.out.println(getName() + " is " + getAge() + " and "+ getName() + "'s gender: " + getGender() + ". " +
                getName() + " reads " + book.getTitle() +
                ". The book wrote by " + book.getAuthor().getName() +
                ", Book is " + book.getType() + ", " + book.getPage() + " pages, Has hard cover:" + book.isHardCover() + "\n" +
                getName() + " at " + book.getCurrentPage() + " page.");
    }
}
