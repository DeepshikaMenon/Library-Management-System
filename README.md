# Library-Management-System
# Overview :

Library Management System is a software, which is used to record the details of books available in the library. You can perform different functions on those books. It is dynamic in nature. Here, you can take input from user regarding the functions to be performed on the books as well as regarding the library and it's details. To build this software we have used java programming language, as for the structure of code MVC Architecture has been followed. Let me give a short brief idea about MVC Architecture.

> Model View Controller (MVC) Architecture -

MVC stands for Model View Controller.
It is a software architecture pattern commonly used in designing and development of application. Particularly, in context with desktop application and web application.
It is a way to organise and structure code to enhance maintainability, modularity and scalability.
 1. Model : In Model, we will be storing Entities and Data Logic will be provided through getters and setters.
 2. View : It acts as User Interface, which can take input from User and provide output.
 3. Controller : Controller consists of Business Logic.

# Key Features :

> A. Menu Driven -

The software is menu driven. A menu driven program makes it easy for the user to use the software. Here, we have provided a particular menu to perform functions on the books and the menu is as follows

   Select option to perform
   1. Add book
   2. Remove book
   3. Update book
   4. Get book
   5. Exit

> B. User Friendly -

The software is user friendly. It takes input from the user, whether it be regarding the library details or about the functions to be performed on the books as follows

Enter name of library : National Library

# Entities

# A. Library

> Attributes -
1. libraryName : Name of the library.
2. libraryAddress : Address of the library.
3. pincode : Pincode of the library location.
4. books : List of books in the library.

> Methods -
1. getBooks() : Returns the list of books in the library.
2. setBooks(List books) : Sets the list of books in the library.
3. getLibraryName() : Returns the name of the library.
4. getLibraryName(String libraryName) : Sets the name of the library.
5. getLibraryAddress() :Returns the address of the library.
6. setLibraryAddress(String libraryAddress) : Sets the address of the library.
7. getPincode() : Returns the pincode of the library's location.
8. setPincode(int pincode) : Sets the pincode of the library's location.

# B. Book

> Attributes -
1. bookName : Name of the book.
2. bookPrice : Price of the book.
3. authorName : Name of the author.

> Methods -
1. getBookName() : Returns the name of the book.
2. setBookName(String nookName) : Sets the name of the book.
3. getBookPrice() : Returns the price of the book.
4. setBookPrice(double bookPrice) : Sets the price of the book.
5. getAuthorName() : Returns the name of the author.
6. setAuthorName(String authorName) : Sets the name of the author.
7. toString() : Returns a string representation of the book.

# Installation Steps :

> Steps to install JDK -

1. Go to the browser.
2. Search for Oracle.
3. Click on Resources tab.
4. In Resources tab there is Downloads section.
5. In Downloads section there is Java Downloads.
6. Click on Java Downloads, there you will get different Java Development Kit (JDK) versions.
7. Select the latest JDK version, also select the device which you are using.
8. Click on the appropriate download link, which will download a zip file.
9. After installation of zip file, extract it and install JDK to your device.
   
# Use Case :

You can execute the software either using command prompt or IDE. For executing the software via command prompt you might need any editor like Notepad, EditPlus, etc. For executing via IDE you may need any IDE like Eclipse IDE, VS Code, etc. I have used Eclipse IDE to create the software. Let us take a real world scenario, to understand better the functioning of the software as follows

![Screenshot (47)](https://github.com/deepshika-1234/Library-Management-System/assets/71027452/627124a7-d26a-4055-95c9-208d802e89ae)

![Screenshot (50)](https://github.com/DeepshikaMenon/Library-Management-System/assets/71027452/0b82027d-83b5-4a1a-bc86-382acf6b3a8e)

![Screenshot (51)](https://github.com/deepshika-1234/Library-Management-System/assets/71027452/937a2396-3963-42a7-82c9-bdb7750fe647)

