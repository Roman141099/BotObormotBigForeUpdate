package Main.UBot.com;

public abstract class Session {

    protected boolean sessionOpened = true;

    public Session(boolean sessionOpened) {
        this.sessionOpened = sessionOpened;
    }

    public Session() {
    }

    public boolean isSessionOpened() {
        return sessionOpened;
    }

    public void setSessionOpened(boolean sessionOpened) {
        this.sessionOpened = sessionOpened;
    }

    //The next step in all sessions
    public abstract String nextStep(String inputTxt);

}