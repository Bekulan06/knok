public class Main {
    public static void main(String[] args) {
        Boss dio = new Boss();
        dio.setHealth(500);
        dio.setDamaged(60);
        dio.setDefenceType("The world!!!");
        System.out.println("����: "+ dio.getDamaged()+
                "\n��������: " + dio.getHealth() +
                "\n��� ������: " + dio.getDefenceType());


        System.out.println(createHeroes());
        for (int i = 0; i < createHeroes().length; i++) {
            if (createHeroes()[i].getSuperPower() != null) {
                System.out.println("���: " + createHeroes()[i].getName() +
                        "\n��������: " + createHeroes()[i].getHealth() +
                        "\n��� �����: " + createHeroes()[i].getSuperPower());
                System.out.println("____________________________________________");
            }else {
                System.out.println("���: " + createHeroes()[i].getName() +
                        "\n��������: " + createHeroes()[i].getHealth()
                        );
                System.out.println("____________________________________________");
            }
        }

    }
    public static Hero[]  createHeroes(){
        Hero hero1= new Hero("hero1 ", 100);
        Hero hero2 = new Hero("hero2 ", 110);
        Hero hero3 = new Hero("hero3 ", 120, "speed");
        Hero[] heroes={hero1, hero2, hero3};
        return heroes;
    }
}