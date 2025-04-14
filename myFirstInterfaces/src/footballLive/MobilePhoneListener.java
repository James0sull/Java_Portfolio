package footballLive;

// To access the interface methods we must use the keyword "IMPLEMENTS"
public class MobilePhoneListener implements FootballMatchListener {
    private String phoneNumber;

    public MobilePhoneListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void onGoalScored(String team, int minute) {
        System.out.println("Mobile phone "+ phoneNumber + ": Goal scored by " + team + " at minute " + minute);
    }

    @Override
    public void onFoulCommitted(String team, int minute) {
        System.out.println("Mobile phone " + phoneNumber + ": Foul committed by " + team + " at minute " + minute);
    }

    @Override
    public void onMatchEnd() {
        System.out.println("Mobile phone " + phoneNumber + ": Match has ended.");
    }
}
