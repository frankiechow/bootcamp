package week5;

public class Book {
    String name;
    String author;
    Double price;
    //getter, setter -> check, setting
    public String getBookName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public Double getPrice(){
        return this.price;
    }
    //return type / method signature . input parameter
    public void setBookName(String BookName){
        this.name = BookName;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String toString(){
        return "name : " + this.name + //
        " , author : " + this.author +//
        " , price : " + this.price;
    }
}
