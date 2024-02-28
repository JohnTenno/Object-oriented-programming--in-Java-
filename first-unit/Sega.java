class Person {
  private String name;
  private String lastName;
  private int age;

  Person() {
    name = "";
    lastName = "";
    age = 0;
  }

  Person(String name, String lastName, int age) {
    setName(name);
    setLastName(lastName);
    setAge(age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setAge(int age) {
    if (age <= 110 || age > 0) {
      this.age = age;
    } else {
      System.err.println("edad fuera de los parametros 110 a 0");
    }
  }

  void printData() {
    System.out.println("Datos del chavalo");
    System.out.println(this.name + " " + this.lastName + " " + this.age);
  }
}

// class Professor

class Professor extends Person {
  private int employeId;

  Professor() {
  }

  Professor(String name, String lastname, int age, int employeId) {
    super(name, lastname, age);
    setEmployeId(employeId);
  }

  public void setEmployeId(int employeId) {
    this.employeId = employeId;
  }

  public int getEmployeId() {
    return employeId;
  }

  void printData() {
    System.out.println("Datos del chavalo");
    System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + getEmployeId());
  }
}

// Class Professorinterim

class ProfessorInterim extends Professor {
  private String startDate;
  private String endDate;

  ProfessorInterim() {

  }

  ProfessorInterim(String startDate, String enDate) {
    setStartDate(startDate);
    setEndDate(enDate);
  }

  public void setStartDate(String startDate) {
    if (startDate == null) {
      this.startDate = "new date";
    } else {
      this.startDate = startDate;
    }
  }

  public void setEndDate(String endDate) {
    if (endDate == null) {
      this.endDate = "new endDate";
    } else {
      this.endDate = endDate;
    }
  }

  public String getStartDate() {
    return startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  void printData() {
    System.out.println("Datos del chavalo");
    System.out.println("Fecha de inicio y fecha de fin");
    System.out.println(getStartDate() + " " + " " + getEndDate());
  }
}

// class ProfessorHeadline

class ProfessorHeadline extends Professor {
  private int cubicle;

  ProfessorHeadline() {

  }

  ProfessorHeadline(String name, String lastName, int age, int employeId, int cubicle) {
    super(name, lastName, age, employeId);
    setCubicle(cubicle);
  }

  public void setCubicle(int cubicle) {
    this.cubicle = cubicle;
  }

  public int getCubicle() {
    return this.cubicle;
  }

  void printData() {
    System.out.println("Datos del chavalo");
    System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + getEmployeId());
    System.out.println("cubiculo");
    System.out.println(getCubicle());
  }
}

class ProfessorArray {
  java.util.ArrayList<Professor> professors;

  ProfessorArray() {
    professors = new java.util.ArrayList<Professor>();

  }

  void addProfessor(Professor professor) {
    professors.add(professor);
  }

  public java.util.ArrayList<Professor> getProfessors() {
    return professors;
  }

  ProfessorArray(String name, String lastname, int age, int employeId) {
    addProfessor(new Professor(name, lastname, age, employeId));
  }
}

public class Sega {
  public static void main(String[] args) {

    ProfessorHeadline professorHeadline = new ProfessorHeadline("Adrian", "Alarcon", 20, 1178231732, 10);
    ProfessorHeadline professorHeadline2 = new ProfessorHeadline("Juan", "Apellido", 32, 43245443, 12);
    ProfessorInterim professorInterim = new ProfessorInterim("12/12/2020", "12/12/2021");
    ProfessorInterim professorInterim2 = new ProfessorInterim("01/01/2020", "12/12/20214");

    ProfessorArray professorArray = new ProfessorArray();
    professorArray.addProfessor(professorHeadline);
    professorArray.addProfessor(professorHeadline2);
    professorArray.addProfessor(professorInterim);
    professorArray.addProfessor(professorInterim2);
    professorArray.getProfessors();

    for (int i = 0; i < professorArray.getProfessors().size(); i++) {
      System.out.println("-----------");
      professorArray.getProfessors().get(i).printData();
      System.out.println("-----------");
    }
  }
}
