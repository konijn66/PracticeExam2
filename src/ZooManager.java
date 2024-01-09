public class ZooManager {
    public Animal[] ZooAnimals=new Animal[6];
    public Animal placeholder=new Animal(0,0);


    public ZooManager(){
        System.out.println("Welcome to the Zoo! Good luck with your duties as a Zookeeper!");

        for(int a=0;a<ZooAnimals.length; a++){
            ZooAnimals[a]=new Animal((int)(100*Math.random()), (int)(50*Math.random()));
        }

        DisplayAnimals();
        SortAnimals();
        DisplayAnimals();
    }

    public static void main(String[] args) {
        ZooManager myZooManager=new ZooManager();
    }

    public void DisplayAnimals(){
        for(int a=0;a<ZooAnimals.length; a++){
            ZooAnimals[a].printInfo();
        }
    }

    public void SortAnimals(){  //sorting by healthLevel lowest to highest
        System.out.println();
        System.out.println("sorting...");
        System.out.println();
        for(int a=0;a<ZooAnimals.length; a++){
            for(int x=0;x<ZooAnimals.length-1-a; x++){
                if (ZooAnimals[x].healthLevel > ZooAnimals[x+1].healthLevel) {
                    placeholder=ZooAnimals[x+1];
                    ZooAnimals[x+1]=ZooAnimals[x];
                    ZooAnimals[x]=placeholder;
                }
            }
        }
    }

}
