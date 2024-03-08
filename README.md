# Library-Management-System
OVERVIEW :

Library Management System is a software, which is used to record the details of books available in the library. We can perform different functions on those books. It is dynamic in nature. Here, we can take input from user regarding the functions to be performed on the books as well as regarding the library and it's details. To build this software we have used java programming language, as for the structure of code we have followed the MVC Architecture. Let me give a short brief idea about MVC Architecture.

> Model View Controller (MVC) Architecture -

MVC stands for Model View Controller.
It is a software architecture pattern commonly used in designing and development of application. Particularly, in context with desktop application and web application.
It is a way to organise and structure code to enhance maintainability, modularity and scalability.
 1. Model : In Model, we will be storing Entities and Data Logic will be provided through getters and setters.
 2. View : It acts as User Interface, which can take input from User and provide output.
 3. Controller : Controller consists of Business Logic.

> Key Features :

A. Menu Driven - The software is menu driven. A menu driven program makes it easy for the user to use the software. Here, we have provided a particular menu to perform functions on the books and the menu is as follows

   Select option to perform
   1. Add book
   2. Remove book
   3. Update book
   4. Get book
   5. Exit

B. User Friendly - The software is user friendly. It takes input from the user, whether it be regarding the library details or about the functions to be performed on the books as follows

Enter name of library : National Library

> Use Case:

Let us take a real world scenario, to understand better the functioning of the software as follows

---Welcome to LMS---

Enter name of library : National Library

Enter address of library : abc Road, Sector 4

Enter pincode : 123 456

Select option to perform

1. Add book
2. Remove book
3. Update book
4. Get book
5. Exit
   
Enter digit respective to desired option : 1

Enter the book name : Famous Five

Enter author name : Enid Blyton

Enter the price of the book : 303

Select option to perform

1. Add book
2. Remove book
3. Update book
4. Get book
5. Exit
   
Enter digit respective to desired option : 4

Enter book name you are looking for : Harry Potter

Book is not available.

Select option to perform

1. Add book
2. Remove book
3. Update book
4. Get book
5. Exit
   
Enter digit respective to desired option : 4

Enter book name you are looking for : Famous Five

Book is available.

Details : 

Book name = Famous Five,

Book author = Enid Blyton,

Book price = 303.0

Select option to perform

1. Add book
2. Remove book
3. Update book
4. Get book
5. Exit
   
Enter digit respective to desired option : 3

Enter book name to be updated : Famous Five

What to update ?

1. Book name
2. Author name
3. Book Price
   
Enter digit respective to desired option : 3

Enter book price to update : 330

Book updated.

Select option to perform

1. Add book
2. Remove book
3. Update book
4. Get book
5. Exit
   
Enter digit respective to desired option : 2

Enter book name to be removed : Famous Five

Requested book has been removed.

Select option to perform

1. Add book
2. Remove book
3. Update book
4. Get book
5. Exit
   
Enter digit respective to desired option : 4

Enter book name you are looking for : Famous Five

Book is not available.

Select option to perform

1. Add book
2. Remove book
3. Update book
4. Get book
5. Exit
   
Enter digit respective to desired option : 5

-----E X I T E D-----
