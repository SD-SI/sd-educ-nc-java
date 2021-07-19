package educ.app;

public interface Issue {

    default boolean isEnable() {
        return false;
    }

    void run() throws IssueException;
}
