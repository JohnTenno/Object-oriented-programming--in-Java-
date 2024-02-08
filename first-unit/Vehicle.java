class Vehicle {
  public static void main(String[] args) {
    Subway subway = new Subway("ja");
    Train train = new Train("tren");
    Truck truck = new Truck("troca");
    Car car = new Car("rojo");
    Bicycle bicycle = new Bicycle("si");
    Submarine submarine = new Submarine("no");
    Boat boat = new Boat("vuela");
    Raft raft = new Raft("aveces");
  }
}

class Subway {
  String name = "tren";
  boolean inRoot = false;
  boolean lightOn = false;
  boolean doorsOpen = false;

  Subway() {

  }
  Subway(String nameParam) {
    name = "nice";
  }

  void IsInRoot() {
    inRoot = true;
  }

  void turnOnLights() {
    lightOn = true;
  }

  void openDoors() {
    doorsOpen = true;
  }
}

class Train {
  String name;
  boolean hasPassengers = false;
  boolean hasDriver = false;
  boolean isOnFire = false;

  Train() {

  }
  Train(String nameParam) {
    name = "tren";
  }

  void newPassagers() {
    hasPassengers = true;
  }

  void driverCameIn() {
    hasDriver = true;
  }

  void explode() {
    isOnFire = true;
  }
}


class Truck {
  String type = "truck";
  boolean lightsOn = false;
  boolean doorsOpen = false;
  boolean engineOn = false;

  Truck() {

  }
  Truck(String typeParam) {
    type = "troca";
  }

  void turnOnLights() {
    lightsOn = true;
  }

  void openDoors() {
    doorsOpen = true;
  }

  void turnOnEngine() {
    engineOn = true;
  }
}

class Car {
  String model;
  boolean driving = false;
  boolean hasGasoline = true;
  int speed = 0;

  Car() {

  }
  Car(String modelParam) {
    model = "puesi";

  }

  void refillGasoline() {
    hasGasoline = true;
  }

  void drive() {
    driving = true;
  }

  void accelerate() {
    speed = 1;
  }
}

class Bicycle {
  String type = "bicycle";
  int wheels = 2;
  boolean bellRinging = false;
  boolean flatTire = false;
  boolean isOnRoad = false;

  Bicycle() {

  }

  Bicycle(String TypeParam) {
    type = "roja";
  }

  void ringBell() {
    bellRinging = true;
  }

  void onWay() {
    isOnRoad = true;
  }

  void tireExplode() {
    flatTire = true;
  }
}

class Submarine {
  String type = "submarine";
  boolean underWater = false;
  boolean lightsOn = false;
  boolean fire = false;

  Submarine() {

  }

  Submarine(String typeParam) {
    type = "no es un submarino real";

  }

  void dive() {
    underWater = true;
  }

  void turnOnLights() {
    lightsOn = true;
  }

  void shoot() {
    fire = true;
  }
}

class Boat {
  String type = "boat";
  boolean sailsUp = false;
  boolean floating = false;
  boolean anchorUp = true;

  Boat (){

  }
  Boat (String typeParam) {
    type = "volador";

  }


  void dropAnchor() {
    anchorUp = false;
  }

  void floatOnWater() {
    floating = true;
  }

  void raiseSails() {
    sailsUp = true;
  }
}

class Raft {
  String type = "raft";
  boolean floating = false;
  boolean row = false;
  int holes = 0;

  Raft() {

  }

  Raft(String typeParam) {
    type = "hihitl";

  }

  void floatOnWater() {
    floating = true;
  }

  void move() {
    row = true;
  }

  void newHole() {
    holes = 1;
  }
} 