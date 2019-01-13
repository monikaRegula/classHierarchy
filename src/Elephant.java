public class Elephant extends Animal {

    private int eatenFood=0;
    private int drunkWater=0;

    public int getEatenFood() { return eatenFood; }

    public void setEatenFood(int eatenFood) { this.eatenFood = eatenFood; }

    public int getDrunkWater() { return drunkWater; }

    public void setDrunkWater(int drunkWater) { this.drunkWater = drunkWater; }


    public Elephant(String name) {
        super(name);
    }

    @Override
    public void feed(){
        setFood((getFood()-400));
        setEatenFood(eatenFood+400);

        setWater((getWater()-300));
        setDrunkWater(drunkWater+=300);
        System.out.println("Nakarmiłam jedzeniem:-"+400);
        System.out.println("Stan pokarmu: "+getFood());
        System.out.println("Napoiłam wodą:-"+300);
        System.out.println("Stan wody: "+getWater());
    }

  @Override
    public void showAnimalState(){
      System.out.println("SŁOŃ Zostało pokarmu: "+getFood() + " Zostało wody: "+getWater()+ " Zjadłam: "+eatenFood+ " Wypiłam: "+drunkWater);
      System.out.println();
  }

}
