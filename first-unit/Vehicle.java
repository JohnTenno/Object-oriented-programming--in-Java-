class Vehicle {
  public static void main(String[] args) {
    Subway subway = new Subway();
    Train train = new Train();
    Truck truck = new Truck();
    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    Submarine submarine = new Submarine();
    Boat boat = new Boat();
    Raft raft = new Raft();
  }
}

class Subway {
  String name = "tren";
  boolean inRoot = false;
  boolean lightOn = false;
  boolean doorsOpen = false;

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
  boolean hasPassengers = false;
  boolean hasDriver = false;
  boolean isOnFire = false;

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
  boolean driving = false;
  boolean hasGasoline = true;
  int speed = 0;

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