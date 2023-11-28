package Online_Election;

public class OnlineElectionApp {
    public static void main(String[] args) {
        Election localElection = new ElectionSystem();
        localElection.startElection();
        localElection.submitElection();
        localElection.getElectionResult();
    }
}
