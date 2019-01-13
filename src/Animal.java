public class Animal {

    private int food =1000;
    private int water=1000;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getFood() { return food; }

    public void setFood(int food) { this.food = food; }

    public int getWater() { return water; }

    public void setWater(int water) { this.water = water; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


    public void feed(){
        setFood(getFood()-500);
        setWater(water-100);
        System.out.println("Nakarmiłam jedzeniem:-"+500);

        System.out.println("Napoiłam wodą:-"+100);

    }


public void addFood(){
        int add=500;
        setFood((getFood()+add));
        setWater((getWater()+add));
    System.out.println("Dodałam wodę:+"+add);
    System.out.println("Dodałam jedzenie:+"+add);

}


public void showAnimalState(){
    System.out.println("Zostało pokarmu:"+getFood() + " Zostało wody:"+getWater());
}

}
