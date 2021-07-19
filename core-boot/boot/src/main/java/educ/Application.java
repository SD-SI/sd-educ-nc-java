package educ;

import educ.app.Issue;
import educ.app.IssueException;
import polygon.Polygon;

public class Application {

    public Application() throws IssueException {
        run();
    }

    private void run() throws IssueException {
        System.out.println("Application is running");
        Issue polygon = new Polygon();
        if (polygon.isEnable()) {
            polygon.run();
        }
        Issue e = new Equation();
        if (polygon.isEnable()) {
            polygon.run();
        }
    }
}
