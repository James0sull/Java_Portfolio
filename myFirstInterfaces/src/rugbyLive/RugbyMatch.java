package rugbyLive;


import java.util.ArrayList;

public class RugbyMatch {

    private ArrayList<RugbyMatchListener> listeners;
    private int numberOfMatches;
    private double matchScore;

    public RugbyMatch() {
        this.matchScore = 0;
        this.numberOfMatches = 0;
        this.listeners = new ArrayList<>();
    }
    public void addListener(RugbyMatchListener listener) {
        listeners.add(listener);
    }
    public void addMatch() {
        numberOfMatches ++;
    }


    public void matchStarted(String teamA, String teamB) {
        System.out.println("Match: " + teamA + " vs " + teamB + " has started");
    }

    public void simulateTry(String team, int minute) {
        for (RugbyMatchListener listener : listeners) {
            listener.onTryScored(team, minute);
        }
    }

    public void simulateFreeKick(String team, int minute, boolean optionCall) {
        for (RugbyMatchListener listener : listeners) {
            listener.onFreeKick(team, minute, optionCall);
        }
    }

    public void simulatePenalty(String team, int minute, String optionCall) {
        for (RugbyMatchListener listener : listeners) {
            listener.onPenalty(team, minute, optionCall);
        }
    }

    public void winnerOfMatch(String teamA, String teamB, String finalScore) {

        System.out.println("Winner in the match " + teamA + " vs " + teamB );
    }

    //public void
}
