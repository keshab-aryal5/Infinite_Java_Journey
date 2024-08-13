package com.keshab;
import java.util.Scanner;
class Library
{
    private int availableCounter=0,issuedCounter=0;
    private String[] availableBooks = new String[100];
    private String[] issuedBooks = new String[100];

    void addBook(String name)
    {
        this.availableBooks[availableCounter++] = name.toUpperCase();
        System.out.println("Book "+name+" is added to library successfully.");
    }
    void ShowAvailableBooks()
    {
        System.out.println("Available Books in library: ");
        for(String books:availableBooks)
        {
            System.out.println(books);
        }
    }
    void issueBook()
    {
        System.out.print("Enter the name of the book you want: ");
        Scanner sc = new Scanner(System.in);
        String book_name = sc.next().toUpperCase();
        for(String book:availableBooks)
        {
            if(book == book_name)
            {
                System.out.println(book_name + " is issued successfully");
                return;
            }
        }
        System.out.println("Book named "+book_name+" is not in the library");
    }
    void returnBook()
    {
        System.out.println("Book returned successfully");
    }
}
public class Assignment {
    public static void main(String[] args)
    {
        Library lb = new Library();
        lb.addBook("The rich dad and poor dad");
        lb.addBook("Love");
        lb.addBook("Cure");
        lb.ShowAvailableBooks();
        lb.issueBook();
        lb.returnBook();

    }
}
