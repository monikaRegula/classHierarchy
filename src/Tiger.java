public class Tiger extends Elephant {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void feed(){
        setFood(getFood()-200);
        System.out.println("Stan pokarmu: "+getFood());
       setEatenFood(getEatenFood()+200);
       setWater(getWater()-80);
        System.out.println("Stan wody: "+getWater());
       setDrunkWater(getWater()+80);
    }


    @Override
    public void showAnimalState(){
        System.out.println("TYGRYS Zostało pokarmu: "+getFood() + " Zostało wody: "+getWater()+ " Zjadłam: "+getEatenFood()+ " Wypiłam: "+getDrunkWater());
        System.out.println();
    }

}
