package secondunit.weight;

class HomeAppliances {
  protected double basePrice;
  protected String color;
  protected char energyConsumption;
  protected double weight;

  public HomeAppliances() {
    this.basePrice = 100;
    this.color = "white";
    this.energyConsumption = 'F';
    this.weight = 5;
  }

  public HomeAppliances(double basePrice, double weight) {
    this.basePrice = basePrice;
    this.color = "white";
    this.energyConsumption = 'F';
    this.weight = weight;
  }

  public HomeAppliances(double basePrice, String color, char energyConsumption, double weight) {
    this.basePrice = basePrice;
    this.color = color;
    checkColor(this.color);
    this.energyConsumption = energyConsumption;
    checkEnergyConsumption(this.energyConsumption);
    this.weight = weight;
  }

  public double getBasePrice() {
    return basePrice;
  }

  public String getColor() {
    return color;
  }

  public char getEnergyConsumption() {
    return energyConsumption;
  }

  public double getWeight() {
    return weight;
  }

  private void checkEnergyConsumption(char letter) {
    if (letter < 'A' || letter > 'F') {
      this.energyConsumption = 'F';
    }
  }

  private void checkColor(String color) {
    String[] colors = { "white", "black", "red", "blue", "gray" };
    for (String c : colors) {
      if (color.equalsIgnoreCase(c)) {
        this.color = c;
        break;
      }
    }
  }

  public double finalPrice() {
    switch (energyConsumption) {
      case 'A':
        basePrice += 100;
        break;
      case 'B':
        basePrice += 80;
        break;
      case 'C':
        basePrice += 60;
        break;
      case 'D':
        basePrice += 50;
        break;
      case 'E':
        basePrice += 30;
        break;
      case 'F':
        basePrice += 10;
        break;
    }

    if (weight >= 0 && weight <= 19) {
      basePrice += 10;
    } else if (weight >= 20 && weight <= 49) {
      basePrice += 50;
    } else if (weight >= 50 && weight <= 70) {
      basePrice += 80;
    } else if (weight >= 80) {
      basePrice += 100;
    }
    return basePrice;
  }
}

class WashingMachine extends HomeAppliances {
  private static final double DEFAULT_CAPACITY = 5;
  private double capacity;

  public WashingMachine() {
    super();
    this.capacity = DEFAULT_CAPACITY;
  }

  public WashingMachine(double basePrice, double weight) {
    super(basePrice, weight);
    this.capacity = DEFAULT_CAPACITY;
  }

  public WashingMachine(double basePrice, String color, char energyConsumption, double weight, double capacity) {
    super(basePrice, color, energyConsumption, weight);
    this.capacity = capacity;
  }

  public double getCapacity() {
    return capacity;
  }

  public double finalPrice() {
    double finalPrice = super.finalPrice();
    if (capacity > 30) {
      finalPrice += 50;
    }
    return finalPrice;
  }
}

class Television extends HomeAppliances {
  private double resolution;
  private boolean hasTdtTuner;

  public Television() {
    super();
    this.resolution = 20;
    this.hasTdtTuner = false;
  }

  public Television(double basePrice, double weight) {
    super(basePrice, weight);
    this.resolution = 20;
    this.hasTdtTuner = false;
  }

  public Television(double basePrice, String color, char energyConsumption, double weight, double resolution,
      boolean hasTdtTuner) {
    super(basePrice, color, energyConsumption, weight);
    this.resolution = resolution;
    this.hasTdtTuner = hasTdtTuner;
  }

  public double getResolution() {
    return resolution;
  }

  public boolean hasTdtTuner() {
    return hasTdtTuner;
  }

  public double finalPrice() {
    double finalPrice = super.finalPrice();
    if (resolution > 40) {
      finalPrice *= 1.3;
    }
    if (hasTdtTuner) {
      finalPrice += 50;
    }
    return finalPrice;
  }
}

public class HomeElectrodomestics {
  public static void main(String[] args) {
    HomeAppliances[] appliances = new HomeAppliances[10];
    appliances[0] = new WashingMachine(200, "white", 'A', 10, 40);
    appliances[1] = new WashingMachine(150, 15);
    appliances[2] = new WashingMachine(300, "black", 'D', 25, 20);
    appliances[3] = new Television(500, "red", 'C', 7, 32, true);
    appliances[4] = new Television(400, 12);
    appliances[5] = new Television(700, "blue", 'E', 20, 50, true);
    appliances[6] = new WashingMachine(200, "red", 'A', 10, 40);
    appliances[7] = new WashingMachine(150, 15);
    appliances[8] = new WashingMachine(300, "gray", 'D', 25, 20);
    appliances[9] = new Television(500, "white", 'C', 7, 32, true);

    double totalAppliancesPrice = 0;
    double totalWashingMachinePrice = 0;
    double totalTelevisionPrice = 0;

    for (HomeAppliances appliance : appliances) {
      double finalPrice = appliance.finalPrice();
      totalAppliancesPrice += finalPrice;
      if (appliance instanceof WashingMachine) {
        totalWashingMachinePrice += finalPrice;
      } else if (appliance instanceof Television) {
        totalTelevisionPrice += finalPrice;
      }
    }

    System.out.println("precio por todo: " + totalAppliancesPrice);
    System.out.println("precio por las lavadoras: " + totalWashingMachinePrice);
    System.out.println("precio por las teles: " + totalTelevisionPrice);
  }
}
