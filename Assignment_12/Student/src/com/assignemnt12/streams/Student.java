package com.assignemnt12.streams;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String  name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    double perTillDate;

    public Student(int id, String name, int age,String gender, String engDepartment, int yearOfEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getEngDepartment(){
        return engDepartment;
    }

    public int getYearOfEnrollment(){
        return yearOfEnrollment;
    }

    public double getPerTillDate(){
        return perTillDate;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Engineering Department : "+engDepartment
                +", Year Of Enrollment : "+yearOfEnrollment
                +", Percentage till date : "+perTillDate;
    }



}

//    Assignment on Stream Api
//
//    Make a com.assignemnt12.streams.Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate
//
//        Add following student in list ;
//
//        1.new com.assignemnt12.streams.Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
//        2.new com.assignemnt12.streams.Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2)
//        3 new com.assignemnt12.streams.Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)
//        4.new com.assignemnt12.streams.Student(144, "Murali Gowda", 18, "Male", “Electrical”, 2018, 80)
//        5.new com.assignemnt12.streams.Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
//        6.new com.assignemnt12.streams.Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70)
//        7.new com.assignemnt12.streams.Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70)
//        8.new com.assignemnt12.streams.Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
//        9.new com.assignemnt12.streams.Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
//        10.new com.assignemnt12.streams.Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
//        11.new com.assignemnt12.streams.Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
//        12.new com.assignemnt12.streams.Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
//        13.new com.assignemnt12.streams.Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
//        14.new com.assignemnt12.streams.Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
//        15.new com.assignemnt12.streams.Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
//        16.new com.assignemnt12.streams.Student(266, "Sanvi Pandey", 17, "Female", “Electric”, 2019, 72.4);
//        17.new com.assignemnt12.streams.Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
//
//        Use stream api on above list of employees find
//
//        1. Print the name of all departments in the college?
//        2.Get the names of all students who have enrolled after 2018?
//        3. Get the details of all male student in the computer sci department?
//        4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
//        5.What is the average age of male and female students?
//        6.Get the details of highest student having highest percentage ?
//        7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
//        8. What is the average percentage achieved in each department?
//        9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
//        10.How many male and female students are there in the computer science department?
//
//        Structure your code so as to comply to clean code(SOLID Principles)
//
//Submit your assignment as a github link