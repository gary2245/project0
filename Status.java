
public class Status {
    private int hitPoints;
    private int hunger;
    private int sleepiness;
    //makes Status object with certain stats
    //if the arguments are not in range, automatically readjusts them
    //health is range of 0-25, hunger and sleep is range of 0-15
    public Status(int hp, int hung, int sleep){
        hitPoints = hp;
        hunger = hung;
        sleepiness = sleep;
        if(hp>25){
            hitPoints=25;
        }
        if(hp<0){
            hitPoints=0;
        }
        if(hung>15){
            hunger=15;
        }
        if(hung<0){
            hunger=0;
        }
        if(sleep>15){
            sleepiness=15;
        }
        if(sleep<0){
            sleepiness=0;
        }
    }
    //a copy constructor
    public Status(Status x) throws NullPointerException{
        if(x==null){
            throw new NullPointerException();
        }
        hunger=x.hunger;
        sleepiness=x.sleepiness;
        hitPoints=x.hitPoints;
    }
    //getter methods
    public int getHitPoints(){ return hitPoints; }
    public int getHunger(){ return hunger; }
    public int getSleepiness(){ return sleepiness; }
    //setter methods
    public void setHitPoints(int x){ hitPoints=x; }
    public void setHunger(int x){ hunger=x; }
    public void setSleepiness(int x){ sleepiness=x; }
    //adds to hitPoints and fixes it if hitPoints goes out of range
    public void addHitPoints(int x){
        hitPoints+=x;
        if(hitPoints>25){
            hitPoints=25;
        }
        if(hitPoints<0){
            hitPoints=0;
        }
    }
    //adds to hunger and fixes it if hunger goes out of range
    public void addHunger(int x){
        hunger+=x;
        if(hunger>15){
            hunger=15;
        }
        if(hunger<0){
            hunger=0;
        }
    }
    //adds to sleepiness and fixes it if sleepiness goes out of range
    public void addSleepiness(int x){
        sleepiness+=x;
        if(sleepiness>15){
            sleepiness=15;
        }
        if(sleepiness<0){
            sleepiness=0;
        }
    }
    //toString which prints all the fields of the Status
    @Override
    public String toString() {
        return "HP:"+ hitPoints + " Hunger:"+ hunger + " Sleepiness:"+ sleepiness;
    }
    //compares the two Status objects
    //first makes sure the argument is of the Status class and not null
    //if all the corresponding hitPoints, hunger and sleepiness are equal returntrue
    //otherwise return false
    @Override
    public boolean equals(Object x){
        if(x==null || getClass()!=x.getClass()){
            return false;
        }
        else{
            Status s = (Status) x;
            if(s.getHitPoints()==hitPoints){
                if(s.getHunger()==hunger){
                    if(s.getSleepiness()==sleepiness){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
