package Online_Election;

public class System implements Election {
    private boolean isStarted;
    private boolean isSubmitted;
    private float electionResult;

    public void startElection() {
        if (!isStarted) {
            System.out.println("Election started.");
            isStarted = true;
        } else {
            System.out.println("Election has already started.");
        }
    }

    public void submitElection() {
        if (isStarted && !isSubmitted) {
            electionResult = calculateElectionResult();
            System.out.println("Election submitted.");
            isSubmitted = true;
        } else if (!isStarted) {
            System.out.println("Election cannot be submitted before starting.");
        } else {
            System.out.println("Election has already been submitted.");
        }
    }

    public float getElectionResult() {
        if (isSubmitted) {
            System.out.println("Election result: " + electionResult);
            return electionResult;
        } else {
            System.out.println("Election result is not available as the election has not been submitted.");
            return -1;
        }
    }

    private float calculateElectionResult() {
        // Replace this with the actual logic to calculate the election result
        return 70.0f;
    }
}
