
public class Main {
    public static void main(String[] args) {
        //tests that the constructor of status and stats works
        //status constructor automatically fixes inputs
        //stats constructor throws error if wrong input
        //bah blah
       
        System.out.println("STATS AND STATUS CONSTRUCTOR TEST");
        Stats stats1 = new Stats(10,5,5);
        Status status1 = new Status(-5,213,521);
        System.out.println(stats1);
        System.out.println(status1);
        System.out.println();
        //tests constructor of player
        System.out.println("PLAYER CONSTRUCTOR TEST");
        Player player1 = new Player("Joe",80,stats1,status1);
        System.out.println(player1);
        System.out.println();
        //tests moving stat points around
        System.out.println("MOVING STAT POINTS AROUND TEST");
        player1.getStats().moveIntelligenceToStamina(2);
        System.out.println(player1);
        System.out.println();
        player1.getStats().moveStaminaToStrength(2);
        System.out.println(player1);
        System.out.println();
        player1.getStats().moveStrengthToIntelligence(2);
        System.out.println(player1);
        System.out.println();
        //tests stats getter methods
        System.out.println("STAT GETTER METHODS TEST");
        System.out.println("Strength:"+player1.getStats().getStrength());
        System.out.println("Stamina:"+player1.getStats().getStamina());
        System.out.println("Intelligence:"+player1.getStats().getIntelligence());
        System.out.println();
        //tests stats equals method and copy constructor test
        System.out.println("STATS EQUAL METHOD TEST AND COPY CONSTRUCTOR TEST");
        Stats teststat1 = new Stats(5,5,10);
        Stats teststat2 = new Stats(teststat1);
        System.out.println("Is teststat1 equal to teststat2:"+teststat1.equals(teststat2));
        System.out.println();
        //tests status equals method and its copy constructor
        System.out.println("STATUS EQUALS METHOD AND COPY CONSTRUCTOR TEST");
        Status teststatus1 = new Status(10,10,10);
        Status teststatus2 = new Status(teststatus1);
        System.out.println("Is teststatus1 equal to teststatus2:"+teststatus1.equals(teststatus2));
        System.out.println();
        //status getter and setter methods test
        System.out.println("STATUS GETTER AND SETTER TEST");
        Status teststatus3 = new Status(0,0,0);
        System.out.println(teststatus3);
        teststatus3.setHitPoints(10);
        teststatus3.setHunger(10);
        teststatus3.setSleepiness(10);
        System.out.println(teststatus3);
        System.out.println();
        //status adding test
        //they are adjusted to be their corresponding maximum if too much added
        System.out.println("STATUS ADDING TEST");
        teststatus3.addHitPoints(50);
        teststatus3.addHunger(50);
        teststatus3.addSleepiness(50);
        System.out.println(teststatus3);
        System.out.println();
        //player setter test
        System.out.println("PLAYER GETTER AND SETTER TEST");
        Status teststatus4 = new Status(5,5,5);
        Stats teststat3 = new Stats(10,5,5);
        Player player2 = new Player("Mark",20,teststat3,teststatus4);
        System.out.println(player2);
        player2.setExperience(10);
        player2.setName("New Mark");
        player2.setStats(5,5,10);
        player2.setStatus(1,1,1);
        //player getter test
        System.out.println("THE EDITED PLAYER");
        System.out.print("Name:"+player2.getName());
        System.out.println(" Experience:"+player2.getExperience());
        System.out.println(player2.getStats());
        System.out.println(player2.getStatus());
        System.out.println();
        //Player constructor copy and equals method test
        System.out.println("PLAYER CONSTRUCTOR COPY AND EQUALS TEST");
        Player player3 = new Player(player2);
        System.out.println("Is player2 equal to player3:"+player2.equals(player3));
        System.out.println();
        //Player adding experience test
        System.out.println("ADDING PLAYER EXP TEST");
        player2.addExperience(500);
        System.out.println("Experience after adding:"+player2.getExperience());
        System.out.println();
        //returning number of players created test
        System.out.println("TOTAL NUMBER OF PLAYERS MADE TEST");
        System.out.println("Number of players made:"+Player.numPlayersCreated());
        System.out.println();
        //examples of catching errors
        System.out.println("CATCHING ERRORS TEST");
        try{
            Stats statsError1 = new Stats(30,-5,-5);
        } catch(IllegalArgumentException e){
            System.out.println("Error caught.");
            System.out.println("The input is not within the range. It is too high or too low.");
        } catch(NullPointerException e){
            System.out.println("Error caught.");
            System.out.println("Passed in a null object into the argument.");
        }
        System.out.println();
        try{
            Player playerError2=null;
            Player playerError2Copy = new Player(playerError2);
        } catch(IllegalArgumentException e){
            System.out.println("Error caught.");
            System.out.println("The input is not within the range. It is too high or too low.");
        } catch(NullPointerException e){
            System.out.println("Error caught.");
            System.out.println("Passed in a null object into the argument.");
        }
        System.out.println();
        try{
            Stats statError3 = new Stats(10,5,5);
            statError3.moveStrengthToIntelligence(10);
        } catch(IllegalArgumentException e){
            System.out.println("Error caught.");
            System.out.println("The input is not within the range. It is too high or too low.");
        } catch(NullPointerException e){
            System.out.println("Error caught.");
            System.out.println("Passed in a null object into the argument.");
        }
    }
    //keep data private and avoid security holes
    //each class should have constructor, copy constructor, toString, equals (equalwhen fields are same)
    //avoid null references, if a method is passed a null reference, throw a NullPointerException
}
