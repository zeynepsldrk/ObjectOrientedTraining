package ReaderSimulation;

public class ReaderTest {
    public static void main(String[] args) {

        Reader reader1 = new Reader();
        reader1.setName("Zeynep");
        reader1.setAge(22);
        reader1.setGender('f');

        Reader reader2 = new Reader();
        reader2.setName("Sila");
        reader2.setAge(23);
        reader2.setGender('f');

        Reader reader3 = new Reader();
        reader3.setName("Aydin");
        reader3.setAge(12);
        reader3.setGender('m');

        Author author = new Author();
        author.setName("Victor Hugo");

        Author author1 = new Author();
        author1.setName("Ahmet Hamdi Tanpinar");

        Book book1 = new Book();
        book1.setAuthor(author);
        book1.setTitle("The Hunchback of Notre-Dame");
        book1.setPage(656);
        book1.setCurrentPage(0);
        book1.setHardCover(false);
        book1.setType("novel");


        Book book2 = new Book();
        book2.setAuthor(author1);
        book2.setTitle("The Time Regulation Institute");
        book2.setPage(366);
        book2.setCurrentPage(159);
        book2.setHardCover(false);
        book2.setType("novel");


        Book book3 = new Book();
        book3.setAuthor(author);
        book3.setTitle("The Hunchback of Notre-Dame");
        book3.setPage(656);
        book3.setCurrentPage(327);
        book3.setHardCover(true);
        book3.setType("novel");

        reader1.read(book1);
        System.out.println("******************************");
        reader2.read(book2);
        System.out.println("******************************");
        reader3.read(book3);
        System.out.println("******************************");
    }
}
