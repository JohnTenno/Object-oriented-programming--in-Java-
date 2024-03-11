public class GameOfThrones {
    public static void main(String[] args) {
        Character joffrey = new King(new Sword(), "Joffrey Baratheon");

        Character robert = new King(new Sword(), "Kig Robert");
        robert.fight();
        robert.changeWeapon(new Axe());
        robert.fight();

        Character daenerys = new Queen(new Axe(), "Daenerys Targaryen");
        daenerys.fight();
        Character cersey = new Queen(new Knife(), "Cersey Lannister");
        cersey.fight();
        Character viserion = new Dragon(new Fire(), "Viserion");
        daenerys.changeWeapon(new BowAndArrow());
        viserion.fight();
        ;
    }
}

abstract class Character {
    private Weapon weapon;
    private String name;

    Character() {
    }

    Character(Weapon weapon, String name) {
        this.setWeapon(weapon);
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    abstract void fight();
}

interface Human {
}

interface Giant {
}

class Queen extends Character implements Human {
    Queen() {
    }

    Queen(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("La Reyna " + this.getName() + " se acaba de unir.");
    }

    public void fight() {
        System.out.print("La  Reyna " + this.getName() + " da un guamaso");
        this.getWeapon().useWeapon();
    }
}

class King extends Character implements Human {
    King() {
    }

    King(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("EL rey " + this.getName() + " se acaba de unir.");
    }

    public void fight() {
        System.out.print("EL rey " + this.getName() + " da un guamaso:");
        this.getWeapon().useWeapon();
    }
}

class Knight extends Character implements Human {
    Knight() {
    }

    Knight(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El caballero " + this.getName() + " se acaba de unir.");
    }

    public void fight() {
        System.out.print("El caballero " + this.getName() + " da un guamaso:");
        this.getWeapon().useWeapon();
    }
}

class Troll extends Character implements Giant {
    Troll() {
    }

    Troll(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El trol " + this.getName() + " se acaba de unir.");
    }

    void fight() {
        System.out.print("El trol " + this.getName() + " da un guamaso:");
        this.getWeapon().useWeapon();
    }
}

class Dragon extends Character implements Giant {
    Dragon() {
    }

    Dragon(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El dragon " + this.getName() + " se acaba de unir.");
    }

    public void fight() {
        System.out.print("El dragon " + this.getName() + " da un guamaso:");
        this.getWeapon().useWeapon();
    }
}

interface Weapon {
    abstract void useWeapon();
}

class Sword implements Weapon {
    Sword() {
        System.out.println("se a equipado la espada UWU!!!");
    }

    public void useWeapon() {
        System.out.println("se usa la espadini!");
    }
}

class Axe implements Weapon {
    Axe() {
        System.out.println("se a equipado el hacha UWU!!!");
    }

    public void useWeapon() {
        System.out.println("RAW!");
    }
}

class Knife implements Weapon {
    Knife() {
        System.out.println("mata cholos was equiped RAW!!!");
    }

    public void useWeapon() {
        System.out.println("celular y cartera carnal");
    }
}

class Fire implements Weapon {
    Fire() {
        System.out.println("Fuego was equipado!!!");
    }

    public void useWeapon() {
        System.out.println("raw");
    }
}

class BowAndArrow implements Weapon {
    BowAndArrow() {
        System.out.println("Se equipo el uwu arco RAW!!!");
    }

    public void useWeapon() {
        System.out.println("piu");
    }
}