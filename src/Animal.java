public class Animal {
    public int happinessIndex;
    public int healthLevel;

    public Animal(int pHappinessIndex, int pHealthLevel){
        happinessIndex=pHappinessIndex;
        healthLevel=pHealthLevel;
    }

    public void printInfo(){
        System.out.println("This animal's happiness index is "+happinessIndex+" and " +
                "its health level is " +healthLevel);
    }

}
