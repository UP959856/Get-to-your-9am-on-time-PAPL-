public class PlayerStats {

    public int coolness;
    public int time;

    public void playerStats(int coolness, int time){

        this.coolness = coolness;
        this.time = time;

    }

    //Getters, setters and adders for points.

    public int getCoolnessPoints(){return coolness;}
    public void setCoolnessPoints(int coolness){this.coolness = coolness;}
    public void addCoolnessPoints(int points){this.coolness = this.coolness + points;}

    public int getTimePoints(){return time;}
    public void setTimePoints(int time){this.time = time;}
    public void addTimePoints(int points){this.time = this.time + time;}

    public boolean hasStats(int coolness, int time, int requiredCoolness, int requiredTime){

        boolean hasRequiredStats;

        if(coolness >= requiredCoolness && time == requiredTime){
            hasRequiredStats = true;
        }
        else{hasRequiredStats = false;}

        return hasRequiredStats;
        
    }
    
}
