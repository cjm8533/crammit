//        Copyright 2018 Lucas Layman Licensed under the
//        Educational Community License, Version 2.0 (the "License"); you may
//        not use this file except in compliance with the License. You may
//        obtain a copy of the License at
//
//        http://www.osedu.org/licenses/ECL-2.0
//
//        Unless required by applicable law or agreed to in writing,
//        software distributed under the License is distributed on an "AS IS"
//        BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
//        or implied. See the License for the specific language governing
//        permissions and limitations under the License.


package edu.uncw.crammit;

public class Book {

    public static Book[] books = {
            new Book("Elements of Computing Systems", "CSC 242", "Not really a textbook. More of a handbook.", 2012),
            new Book("Introduction to Algorithms", "CSC 380", "The gold standard for algorithms textbooks.", 2009),
            new Book("Head First Android Development", "CSC 315", "A book with step-by-step instructions for creating awesome apps.", 2017)
    };

    String title;
    String courseNumber;
    String description;
    int year;

    Book(String title, String courseNumber, String description, int year) {
        this.title = title;
        this.courseNumber = courseNumber;
        this.description = description;
        this.year = year;
    }
}
