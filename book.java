public class book{
    String title;
    String author;
    int numOfPages;
    int numOfChapter;

    public book(String title, String author, int numOfPages, int numOfChapter){
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
        this.numOfChapter = numOfChapter;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }
    public int getNumOfPages(){return this.numOfPages;}
    public void setNumOfChapters(int numOfChapter){
        this.numOfChapter = numOfChapter;
    }
    public int getNumOfChapters(){return this.numOfChapter;}

    public String toString(){
        String toString = "";
        toString = "Name: " + this.title + " \n";
        toString += "Author: " + this.author + "\n";
        toString += "Number of pages: " + this.numOfPages + "\n";
        toString += "Number of Chapters: " + this.numOfChapter + "\n";

        return toString;
    }

    }