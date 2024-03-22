All object-oriented programming (Java) projects will be uploaded here.

All object-oriented programming (Java) projects will be uploaded here.

A constructor is a special function responsible for constructing objects or instances of a class. For example: Vehicle vehicle = new Vehicle();.

Stack memory is where methods are stored; heap memory is where instances are linked.

A method belonging to the class that doesn't return anything is called using the class name.

Example:
Person p = new Person(); // Person() is an empty constructor
Person p2 = new Person("Pedro", 15);

Access modifiers:

public: makes it visible to everyone.
protected: visible to the entire package unless in another package.
private: visible only to the class it's in.
default: visible to the entire package.
static modifier:

The attribute or method belongs to the class, not the instance.
Variables and methods can be static.
If we have static int number, the number is stored in the class, not in the instance. So, if we have three different instances, they all have the same value.
final modifier:

The class cannot be inherited, variables can only be initialized once, and methods cannot be overridden.
You can create the class, but only one instance can be instantiated, and its state can change.
Instance variables:

Variables that are not in a method of the class.
Static variables:

A variable with the static modifier.
Local variables:

Variables inside a method.
Shadowing:

Refers to having two classes with the same name in different contexts.
Can have local variables or not.
this.: refers to the instance.

If you instantiate a static block, it is executed only once when an instance of the class is created.

Java Bean and POJO are the same: a plain old Java object is a simple class that only contains private attributes and provides methods to access the data. All variables are private and have methods get and set for each property. They are encapsulated objects.

Inheritance allows us to inherit properties from one class to another.

class Vehicle {
    public String color;
}

class Car extends Vehicle {

}

class Truck extends Vehicle {

}

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
    }
}


Relationship:

has a

public class Vehicle {}
class Speed {}
class Seat {}

public class Van extends Vehicle {
    private Speed speed;
    private Seat seat;
}


Overloading allows having multiple methods with the same name but different parameters, e.g., in constructors.
public class MyClass {
    public int sum() {

    }
    public int sum(int x, int y) {

    }
    public int sum(double x, double y) {

    }
}

Inheritance, polymorphism, encapsulation, interfaces:

Encapsulation:

Hides the state of an object so that it can only be modified through the methods defined for that object.
Interfaces:

Like classes, but their methods are abstract; they have no defined methods.

public interface Animal {
    public abstract void eat();
    public abstract void sleep();
}

public class Cat implements Animal {
    public void eat() {
        System.out.println("eat");
    }
}
