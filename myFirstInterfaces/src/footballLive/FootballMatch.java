package footballLive;

import java.util.ArrayList;

class FootballMatch {
    // Has 1 member variable which is an arraylist of type FootballMatchListener
    // "ArrayList" = keyword
    // "FootballMatchListener" = type (in this case is our interface)
    // "listeners" = name of the ArrayList
    // Syntax ArrayList<Type> nameArrayList
    private ArrayList<FootballMatchListener> listeners;

    // Constructor to initialize listeners list
    public FootballMatch() {
        this.listeners = new ArrayList<>();
    }

    // Method to add listener to the list
    public void addListener(FootballMatchListener listener) {
        listeners.add(listener);
    }

    // Method to start the match
    public void startMatch() {
        System.out.println("Match has just started.");
    }

    // Method to simulate goal scored event
    public void simulateGoal(String team, int minute) {
        for (FootballMatchListener listener : listeners) {
            listener.onGoalScored(team, minute);
        }
    }

    // Method to simulate foul committed event
    public void simulateFoul(String team, int minute) {
        for (FootballMatchListener listener : listeners) {
            listener.onFoulCommitted(team, minute);
        }
    }

    // Method to end the match
    public void endMatch() {
        for (FootballMatchListener listener : listeners) {
            listener.onMatchEnd();
        }
    }
}