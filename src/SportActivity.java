public class SportActivity {
    private String activityName;
    private int durationInMinutes;
    private boolean isCompleted;
    public SportActivity(String activityName, int durationInMinutes) {
        this.activityName = activityName;
        this.durationInMinutes = durationInMinutes;
        this.isCompleted = false;
    }
    public String getActivityName() {
        return activityName;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    public String toString() {
        return " SportActivity{" + "activityName='" + activityName + '\'' + ", durationInMinutes=" + durationInMinutes + ", isCompleted=" + isCompleted + '}';
    }
}