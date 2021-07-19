package educ.app;

public class IssueException extends Exception {
    public IssueException(String app, Throwable throwable) {
        super(app + " " + throwable.getMessage(), throwable);
    }
}
