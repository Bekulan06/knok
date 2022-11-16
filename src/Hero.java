public class Hero {
    private String name;
    private int health;
    private String superPower;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Hero(String name, int health, String superPower) {
        this.name = name;
        this.health = health;
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
}
