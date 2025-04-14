package footballLive;

public interface FootballMatchListener {
    public void onGoalScored(String team, int minute);
    public void onFoulCommitted(String team, int minute);
    public void onMatchEnd();
}
