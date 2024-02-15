public class TeacherCompleteTime {
  String name;
  String fatherLastName;
  String motherLastName;
  int age;
  String title;
  Subject[] subjects = { new Subject("Mates"),
                         new Subject("Programacion orientada a meme"),
                         new Subject("Arquitectura de pc"),
                         new Subject("Fisica")};
  String speciality;
  String born;

  TeacherCompleteTime() {

  }

  TeacherCompleteTime(String name) {
    this.name = "deafult";
  }

  void startClasse() {

  }

  void impartClass() {

  }

  void preparateExams() {

  }

  void gradeExamen() {

  }

  void provideAvince() {

  }

  void giveTutorials() {

  }
}

class Subject {
  private String subjectName;

  Subject () {

  }

  Subject (String name) {
    getName(name);
  }

  public String getName(String name) {
    return subjectName;
  }
  
  public void setName(String name) {
    subjectName = name;
  }
}
