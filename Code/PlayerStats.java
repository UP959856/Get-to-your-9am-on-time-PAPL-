package Code;

public class PlayerStats {

    public int coolnessPoints;
    public int timePoints;

    public void playerStats(int coolnessPoints, int timePoints){

        this.coolnessPoints = coolnessPoints;
        this.timePoints = timePoints;

    }

    public int getCoolnessPoints(){return coolnessPoints;}
    public void addCoolnessPoints(int points){this.coolnessPoints = this.coolnessPoints + points;}

    public int getTimePoints(){return timePoints;}
    public void addTimePoints(int points){this.timePoints = this.timePoints + points;}

    public boolean hasStats(int coolnessPoints, int timePoints){

        boolean hasRequiredStats;

        if(this.coolnessPoints == coolnessPoints && this.timePoints == timePoints){
            hasRequiredStats = true;
        }
        else{hasRequiredStats = false;}

        return hasRequiredStats;
    }
    
}
