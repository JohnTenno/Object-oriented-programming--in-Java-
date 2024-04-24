package secondunit.weight;

import java.util.*;

class Book implements Comparable<Book> {
  int id, year;
  String name, author, publisher;

  public Book(int id, String name, String author, String publisher, int year) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.year = year;
  }

  public int compareTo(Book b) {
    if (id > b.id) {
      return 1;
    } else if (id < b.id) {
      return -1;
    } else {
      return 0;
    }
  }
}

class NameComparator implements Comparator<Book> {
  public int compare(Book b1, Book b2) {
    return b1.name.compareTo(b2.name);
  }
}

class AuthorComparator implements Comparator<Book> {
  public int compare(Book b1, Book b2) {
    return b1.author.compareTo(b2.author);
  }
}

class IdComparator implements Comparator<Book> {
  public int compare(Book b1, Book b2) {
    if (b1.id > b2.id) {
      return 1;
    } else if (b1.id < b2.id) {
      return -1;
    } else {
      return 0;
    }
  }
}

class YearComparator implements Comparator<Book> {
  public int compare(Book b1, Book b2) {
    if (b1.year > b2.year) {
      return 1;
    } else if (b1.year < b2.year) {
      return -1;
    } else {
      return 0;
    }
  }
}

public class ThreeSetExercice {
  public static void main(String[] args) {
    Set<Book> set = new TreeSet<Book>(new AuthorComparator());
    Book b1 = new Book(121, "El libro vaquero", "Jordi Soler", "Novedades Editores", 1978);
    Book b2 = new Book(233, "Kalimán", "Galvin", "Armando Couto", 1963);
    Book b3 = new Book(101, "Fantomas, la amenaza elegante", "Rosa María Phillips", "Editorial Novaro", 1967);
    set.add(b1);
    set.add(b2);
    set.add(b3);
    for (Book b : set) {
      System.out.println(b.id + " " + b.name + " " + b.author + " "
          + b.publisher + " " + b.year);
    }
  }
}
