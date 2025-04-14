package rugbyLive;

import java.util.Scanner;

public class Listener implements RugbyMatchListener {
    Scanner input;
    private String listenerName;

    public Listener(String listenerName) {
        this.listenerName = listenerName;
    }

    @Override
    public void onTryScored(String team, int minute) {
        System.out.println("Listener: " + listenerName + " Try was scored by " + team + " in the " +  minute + " minute");
    }

    @Override
    public void onFreeKick(String team, int minute, boolean optionCall) {
        String actionCalled;
        if (optionCall) {
            actionCalled = "Kick to the corner was called";
        } else {
            actionCalled = "Scrum was called";
        }

        System.out.println("Listener: " + listenerName + " Free has been given to " + team + " in the " +  minute + " minute. \nThe option called was " + actionCalled);
    }

    @Override
    public void onPenalty(String team, int minute, String optionCall) {
        String actionCalled;
        if (optionCall.equals("post") ) {
            actionCalled = "Kick at goal was called";
        } else if (optionCall.equals("touch")) {
            actionCalled = "Kick to touch was called";
        } else {
            actionCalled = "Scrum was called";
        }

        System.out.println("Listener: " + listenerName + " Free has been given to " + team + " in the " +  minute + " minute. \nThe option called was " + actionCalled);
    }

    @Override
    public void onMatchEnd() {
        System.out.println("Listener: " + listenerName + " This match has ended");
    }
}
