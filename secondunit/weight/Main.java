package secondunit.weight;

import java.util.Random;

class Person {
  public final char MALE = 'H';
  public final char FEMALE = 'M';

  private static final int IDEAL_WEIGHT = -1;
  private static final int BELOW_IDEAL_WEIGHT = 0;
  private static final int OVERWEIGHT = 1;

  private String name;
  private int age;
  private int id;
  private char gender = MALE;
  private double weight;
  private double height;

  Person() {
    this.name = "John";
    this.age = 24;
    this.gender = 'H';
    this.weight = 90;
    this.height = 1.78;
    getIMC();
  }

  Person(String name, int age, char gender) {
    setName(name);
    setAge(age);
    setGender(gender);
  }

  Person(String name, int age, char gender, double weight, double height) {
    setName(name);
    setAge(age);
    setGender(gender);
    generateId();
    setWeight(weight);
    setheight(height);
  }

  public void showData() {
    System.out.println(
        "nombre" + this.name +
            "edad" + this.age +
            "genero" + this.gender +
            "id" + this.id +
            "peso" + weight +
            "altura" + height);
    System.out.println(isAdult(this.age));
  }

  public void getAllData() {
    getName();
    getAge();
    getGender();
    getWeight();
    getheight();
  }

  public void getData() {
    getName();
    getAge();
    getGender();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public char getGender() {
    return this.gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getheight() {
    return this.height;
  }

  public void setheight(double height) {
    this.height = height;
  }

  public int getIMC() {
    double imc = weight / (height * height);
    if (imc < 20) {
      return IDEAL_WEIGHT;
    } else if (imc >= 20 && imc <= 25) {
      return BELOW_IDEAL_WEIGHT;
    } else {
      return OVERWEIGHT;
    }
  }

  public String isAdult(int age) {
    String isAdult = (age >= 18) ? "more that 18 years olds" : "less that 18 years old";
    return isAdult;
  }

  public void compareGender(char gender) {
    this.gender = (gender == 'M') ? FEMALE : MALE;
  }

  public String toString() {
    return "Name: " + name + "Age:" + age + "Gender" + gender + "Id" + id;
  }

  public void generateId() {
    Random randomNumbers = new Random();
    id = (randomNumbers.nextInt(8) + 1);
  }

}

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("juan", 25, 'H', 60.0, 1.2);
    Person person2 = new Person("other juan", 17, 'H');
    Person person3 = new Person();

    int imcPerson1 = person1.getIMC();
    int imcPerson2 = person2.getIMC();
    int imcPerson3 = person3.getIMC();

    System.out.println("Person 1:");
    System.out.println("Weight status: " + imcPerson1);
    System.out.println("Is adult: " + person1.isAdult(person1.getAge()));
    System.out.println("Name: " + person1.getName());
    System.out.println("Age: " + person1.getAge());
    System.out.println("Gender: " + person1.getGender());
    System.out.println("Weight: " + person1.getWeight());
    System.out.println("Height: " + person1.getheight());

    System.out.println("Person 2:");
    System.out.println("Weight status: " + imcPerson2);
    System.out.println("Is adult: " + person2.isAdult(person2.getAge()));
    System.out.println("Name: " + person2.getName());
    System.out.println("Age: " + person2.getAge());
    System.out.println("Gender: " + person2.getGender());
    System.out.println("Weight: " + person2.getWeight());
    System.out.println("Height: " + person2.getheight());

    System.out.println("Person 3:");
    System.out.println("Weight status: " + imcPerson3);
    System.out.println("Is adult: " + person3.isAdult(person3.getAge()));
    System.out.println("Name: " + person3.getName());
    System.out.println("Age: " + person3.getAge());
    System.out.println("Gender: " + person3.getGender());
    System.out.println("Weight: " + person3.getWeight());
    System.out.println("Height: " + person3.getheight());

  }
}
