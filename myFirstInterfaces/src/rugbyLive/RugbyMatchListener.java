package rugbyLive;

public interface RugbyMatchListener {
    public void onTryScored(String team, int minute);
    public void onFreeKick(String team, int minute, boolean optionCall);
    public void onPenalty(String team, int minute, String optionCall);
    public void onMatchEnd();
}
