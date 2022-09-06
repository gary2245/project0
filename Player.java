
public class Player {
    private String name;
    private int experience;
    private Stats stats;
    private Status status;
    private int id;
    private static int count=0;
    //makes the player with a name, an exp from 0-1000 which adjusts if user
    //enters an exp that is out of range,
    //stat instance, and a status instance
    //makes an id which starts as 0 and increments with each player object made
    public Player(String n, int exp, Stats stat, Status statu){
        if(stat==null || statu==null){
            throw new NullPointerException();
        }
        name=n;
        if(exp<0){
            experience=0;
        }
        else if(exp>1000){
            experience=1000;
        }
        else{
            experience=exp;
        }
        stats=stat;
        status=statu;
        id=count;
        count++;
    }
    //copy constructor
    //makes sure Player argument isn't null
    //makes statsCopy and statusCopy so that there is no security hole
    public Player(Player x) throws NullPointerException{
        if(x==null){
            throw new NullPointerException("Cannot pass in a Player that is null");
        }
        name=x.name;
        experience=x.experience;
        Stats statsCopy = new Stats(x.stats);
        stats=statsCopy;
        Status statusCopy = new Status(x.status);
        status=statusCopy;
        id=count;
        count++;
    }
    //getter methods
    //for stats and status, returns the all the fields of stats and status instances
    public String getName(){return name;}
    public int getExperience(){return experience;}
    public Stats getStats(){return stats;}
    public Status getStatus(){return status;}
    //setter methods
    //for Stats and Status, method makes new object with inputted fields
    //then sets it to the Player's status/stats to avoid security hole
    public void setName(String n){name=n;}
    public void setExperience(int exp){experience=exp;}
    public void setStats(int str, int stam, int intel){
        Stats statsCopy = new Stats(str,stam,intel);
        stats=statsCopy;
    }
    public void setStatus(int hp, int hung, int sleep){
        Status statusCopy = new Status(hp,hung,sleep);
        status=statusCopy;
    }
    //adds experience
    public void addExperience(int exp){
        experience+=exp;
    }
    //returns total number of Players created
    public static int numPlayersCreated(){
        return count;
    }
    //prints all the fields of the player, including Stats and Status
    @Override
    public String toString(){
        return "Name:"+ name +" Experience:"+ experience +" ID:"+ id+"\n"+stats+"\n"+status;
    }
    //compares two players
    //first makes sure the argument is a Player and not null
    //if the two players share same name, experience,
    //stats, and status, return true
    //note: doesn't compare id. two players with same stats but different ids
    //note: can return true
    //otherwise, return false
    @Override
    public boolean equals(Object x){
        if(x==null || getClass()!=x.getClass()){
            return false;
        }
        else{
            Player p = (Player) x;
            if(name.equals(p.name)){
                if(experience==p.experience){
                    if(stats.equals(p.stats)){
                        if(status.equals(p.status)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
