public class A2 {
    
    public static void main(String[] args) {
    book b1 = new book("the Odyssey","Homer", 1000, 24);
    book b2 = new book("Atlas Shrugged", "Ayn Rand", 1168, 24);
    book b3 = new book("The tale of the Elephant and the Giraff", "Aesop",24, 1);

    System.out.println(b1.toString());
    System.out.println(b2.toString());
    System.out.println(b3.toString());

    b1.setTitle("rich dad poor dad");
    b2.setAuthor("dipta");
    b3.setNumOfPages(240);
    b3.setNumOfChapters(10);

    System.out.println("after doing the modification \n");
    System.out.println(b1.toString());
    System.out.println(b2.toString());
    System.out.println(b3.toString());

    }
}
