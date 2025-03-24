# 1213StudentManagementSystem
Lab completed in 1213: A simple Java-based Student Management System that uses object-oriented programming to manage students, professors, courses, and academic records.


This project is a simple Student Management System implemented in Java. It demonstrates key Object-Oriented Programming (OOP) concepts like inheritance, encapsulation, and polymorphism using a hierarchy of classes:

Person: The base class for all people.

Student: A subclass of Person with added academic-related features.

Professor: Another subclass of Person with capabilities to manage advisees (students).
- Person Class
Stores common attributes: firstName, lastName, id
Methods:
getFirstName()
getLastName()
getId()
display()

- Student Class (extends Person)
Additional fields: major, gpa, credits, balance, transfer, enrolledCourses
Methods:
getMajor(), setMajor(String)
getGPA(), setGPA(double)
getCredits(), setCredits(int)
isTransfer(), setTransfer(boolean)
getBalance(), setBalance(double)
addCourse(String)
dropCourse(String)
getEnrolledCourses()

-Professor Class (extends Person)
Additional fields: department, salary, advisees (ArrayList<Student>)
Methods:
getDepartment(), setDepartment(String)
getSalary(), setSalary(double)
getAdvisees()
addAdvisee(Student)
removeAdvisee(int) – removes a student by ID


