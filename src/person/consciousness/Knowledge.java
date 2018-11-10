package person.consciousness;

public class Knowledge {
    private double level;
    
    //in my program a student can acquire knowledge levels from 1 to 10
    public Knowledge(double level) {
        if (0 < level && level <= 10){ //check the conditions of the level
            this.level = level;
        } else {
            //throw an error if the level of knowledge does not meet the conditions
            throw new IllegalArgumentException("The level should be double"
                    + " and get into range [1,10]: " + level);
        }
    }

    public double getLevel(){
        return level;
    }
}   

