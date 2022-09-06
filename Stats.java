
public class Stats {
    private int strength;
    private int stamina;
    private int intelligence;
    //makes stat object
    //each stat must be in between 1 and 12, if not, throws an error
    //all 3 stats must add up to 20, if not, throws an error
    public Stats(int str, int sta, int intel) throws IllegalArgumentException{
        if(str<1 || str>12){
            throw new IllegalArgumentException("Strength stat must be between 1 and 12");
        }
        if(sta<1 || sta>12){
            throw new IllegalArgumentException("Stamina stat must be between 1 and 12");
        }
        if(intel<1 || intel>12){
            throw new IllegalArgumentException("Intelligence stat must be between 1 and 12");
        }
        if(str+sta+intel!=20){
            throw new IllegalArgumentException("All the stats together must add up to 20");
        }
        strength=str;
        stamina=sta;
        intelligence=intel;
    }
    //a copy constructor
    public Stats(Stats x) throws NullPointerException{
        if(x==null){
            throw new NullPointerException();
        }
        intelligence=x.getIntelligence();
        strength=x.getStrength();
        stamina=x.getStamina();
    }
    //transfers strength points to intelligence or vice versa
    //if amount is negative number, +strength but -intelligence
    //if amount is positive number, -strength but +intelligence
    //each time point is moved, check if intelligence or strength is in between 1-12 range
    //if points out of range, throw an error which says that the amount
    //of points the user wants to move is too high
    public void moveStrengthToIntelligence(int amount) throws
            IllegalArgumentException{
        if(amount<0){
            for(int i=0; i>amount; i--){
                if(intelligence<1 || intelligence>12){
                    throw new IllegalArgumentException("Input too high");
                }
                else if(strength<1 || strength>12){
                    throw new IllegalArgumentException("Input too high");
                }
                strength++;
                intelligence--;
            }
            System.out.println("Moved "+ Math.abs(amount) +" points from intelligence to strength");
        }
        else if(amount>0){
            for(int i=0; i<amount; i++){
                if(intelligence<1 || intelligence>12){
                    throw new IllegalArgumentException("Input too high");
                }
                else if(strength<1 || strength>12){
                    throw new IllegalArgumentException("Input too high");
                }
                strength--;
                intelligence++;
            }
            System.out.println("Moved "+ Math.abs(amount) +" points from strength to intelligence");
        }
    }
    //transfers intelligence points to stamina or vice versa
    //if amount is negative number, +intelligence but -stamina
    //if amount is positive number, -intelligence but +stamina
    //each time point is moved, check if intelligence or stamina is in between 1-12 range
    //if points out of range, throw an error which says that the amount
    //of points the user wants to move is too high
    public void moveIntelligenceToStamina(int amount) throws
            IllegalArgumentException{
        if(amount<0){
            for(int i=0; i>amount; i--){
                intelligence++;
                stamina--;
                if(intelligence<1 || intelligence>12){
                    throw new IllegalArgumentException("Input too high");
                }
                else if(stamina<1 || stamina>12){
                    throw new IllegalArgumentException("Input too high");
                }
            }
            System.out.println("Moved "+ Math.abs(amount) +" points from stamina to intelligence");
        }
        else if(amount>0){
            for(int i=0; i<amount; i++){
                intelligence--;
                stamina++;
                if(intelligence<1 || intelligence>12){
                    throw new IllegalArgumentException("Input too high");
                }
                else if(stamina<1 || stamina>12){
                    throw new IllegalArgumentException("Input too high");
                }
            }
            System.out.println("Moved "+ Math.abs(amount) +" points from intelligence to stamina");
        }
    }
    //transfers stamina points to strength or vice versa
    //if amount is negative number, +stamina but -strength
    //if amount is positive number, -stamina but +strength
    //each time point is moved, check if strength or stamina is in between 1-12 range
    //if points out of range, throw an error which says that the amount
    //of points the user wants to move is too high
    public void moveStaminaToStrength(int amount) throws IllegalArgumentException{
        if(amount<0){
            for(int i=0; i>amount; i--){
                stamina++;
                strength--;
                if(stamina<1 || stamina>12){
                    throw new IllegalArgumentException("Input too high");
                }
                else if(strength<1 || strength>12){
                    throw new IllegalArgumentException("Input too high");
                }
            }
            System.out.println("Moved "+ Math.abs(amount) +" points from strength to stamina");
        }
        else if(amount>0){
            for(int i=0; i<amount; i++){
                stamina--;
                strength++;
                if(stamina<1 || stamina>12){
                    throw new IllegalArgumentException("Input too high");
                }
                else if(strength<1 || strength>12){
                    throw new IllegalArgumentException("Input too high");
                }
            }
            System.out.println("Moved "+ Math.abs(amount) +" points from stamina to strength");
        }
    }
    //getter methods
    public int getStrength(){ return strength; }
    public int getStamina(){ return stamina; }
    public int getIntelligence(){
        return intelligence;
    }
    //toString that prints stats
    @Override
    public String toString(){
        return "Strength:"+ strength +" Stamina:"+ stamina +" Intelligence:"+ intelligence;
    }
    //compares the two Stats objects
    //first makes sure the argument is of the Stats class and not null
    //if all the corresponding intelligence, stamina and strength stats are equalreturn true
    //otherwise return false
    @Override
    public boolean equals(Object x){
        if(x==null || getClass()!=x.getClass()){
            return false;
        }
        else{
            Stats s = (Stats) x;
            if(s.getIntelligence()==intelligence){
                if(s.getStamina()==stamina){
                    if(s.getStrength()==strength){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}