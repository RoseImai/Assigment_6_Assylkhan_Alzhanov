package builder;

public class FinalHouse {
    String walls = "walls";
    String roof = "roof";
    String door = "door";
    String window = "window";
    public FinalHouse(boolean garage, boolean pool, boolean statues, boolean garden)
    {
        if(garage == true) System.out.println("Your house has: " + walls + " " + roof + " " + door + " " + window + " and Garage");
        else if(pool == true) System.out.println("Your house has: " + walls + " " + roof + " " + door + " " + window + " and Swimming Pool");
        else if(statues == true) System.out.println("Your house has: " + walls + " " + roof + " " + door + " " + window + " and Statues");
        else if(garden == true) System.out.println("Your house has: " + walls + " " + roof + " " + door + " " + window + " and Garden");
        else System.out.println("Your house has: " + walls + " " + roof + " " + door + " " + window);
    }
}
