public class Person {
  String name;
  int age;

  Person() {
    name = "anonymus";
    age = 0;
  }
  Person(String nameParam, int ageParam) {
    name = nameParam;
    age = ageParam;
  }
}

class MainClass {
  public static void main(String[] args) {
    Person p = new Person();
    Person p1 = new Person("pancho", 15);
  }
}
