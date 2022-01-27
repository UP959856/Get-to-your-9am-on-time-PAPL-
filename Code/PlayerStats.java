public class PlayerStats {

    public float coolness;
    public float time;

    public void playerStats(float coolness, float time){

        this.coolness = coolness;
        this.time = time;

    }

//Getters, setters and adders for points.

////////////////////////////////////////////////////////////////////////////////////////////////////////
    public float getCoolnessPoints(){return coolness;}
    public void setCoolnessPoints(float coolness){this.coolness = coolness;}
    public void addCoolnessPoints(float points){this.coolness = this.coolness + points;}

    public float getTimePoints(){return time;}
    public void setTimePoints(float time){this.time = time;}
    public void addTimePoints(float points){this.time = this.time + time;}
////////////////////////////////////////////////////////////////////////////////////////////////////////

//Method to check if player has required stats to travel to a node with requirements.
    public boolean hasStats(float coolness, float time, float requiredCoolness, float requiredTime){

        boolean hasRequiredStats;

        if(coolness >= requiredCoolness && time == requiredTime){
            hasRequiredStats = true;
        }
        else{hasRequiredStats = false;}

        return hasRequiredStats;
        
    }

    public String toString(){

        return "Coolness: " + coolness + "\n" + "Time: " + time;

    }
    
}
