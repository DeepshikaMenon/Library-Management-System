package com.jsp.lms.view;

import java.util.Scanner;

import com.jsp.lms.controller.Controller;
import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;

public class View {
	static private Library library = new Library();

	public static Library getLibrary() {
		return library;
	}

	public static void setLibrary(Library library) {
		View.library = library;
	}

	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	static {
		System.out.println("---Welcome to LMS---");
		System.out.print("Enter name of library : ");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		//
		System.out.print("Enter address of library : ");
		library.setLibraryAddress(myInput.nextLine());
		System.out.print("Enter pincode : ");
		library.setPincode(myInput.nextInt());
		myInput.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("Select option to perform");
			System.out.println("1.Add book\n2.Remove book\n3.Update book\n4.Get book\n0.Exit");
			System.out.print("Enter digit respective to desired option : ");
			byte userChoice = myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("-----E X I T E D-----");
				System.exit(0);
				break;
			case 1:
				Book book = new Book();
				System.out.print("Enter the book name : ");
				book.setBookName(myInput.nextLine());
				System.out.print("Enter author name : ");
				book.setBookAuthor(myInput.nextLine());
				System.out.print("Enter the price of the book : ");
				book.setBookPrice(myInput.nextDouble());
				myInput.nextLine();
				controller.addBook(book);
				break;
			case 2:
				System.out.print("Enter book name to be removed : ");
				String bookToRemove = myInput.nextLine();
				if (controller.removeBook(bookToRemove)) {
					System.out.println("Requested book has been removed.");
				} else {
					System.out.println("Book does not exist, book cannot be removed.");
				}
				break;
			case 3:
				System.out.print("Enter book name to be updated : ");
				Book bookExist = controller.getBook(myInput.nextLine());
				if (bookExist != null) { // Book exists
					Book bookToUpdate = bookExist;
					System.out.println("What to update ?");
					System.out.println("1.Book name\n2.Author name\n3.Book Price");
					System.out.print("Enter digit respective to desired option : ");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.println("Enter book name to update : ");
						bookToUpdate.setBookName(myInput.nextLine());
						break;
					case 2:
						System.out.println("Enter author name to update : ");
						bookToUpdate.setBookAuthor(myInput.nextLine());
						break;
					case 3:
						System.out.println("Enter book price to update : ");
						double newBookPrice = myInput.nextDouble();
						myInput.nextLine();
						bookToUpdate.setBookPrice(newBookPrice);
						break;
					default:
						System.out.println("- - - - - INVALID SELECTION - - - - -");
						break;
					}
					if(controller.update(bookExist,bookToUpdate))
					{
						System.out.println("Book updated.");
					}
					else
					{
						System.out.println("Book not updated.");
					}
				} else {
					System.out.println("Book does not exist, updation cannot be performed.");
				}
				break;
			case 4:
				System.out.print("Enter book name you are looking for : ");
				Book fetchedBook = controller.getBook(myInput.nextLine());
				if (fetchedBook != null) {
					System.out.println("Book is available.");
					System.out.println("Details : ");
					System.out.println(fetchedBook);
				} else {
					System.out.println("Book is not available.");
				}
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}
		} while (true);
	}

}
