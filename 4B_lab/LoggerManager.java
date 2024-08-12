package FourB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoggerManager {
    private List<Action> actionList = new ArrayList<>();

    public void addAction(Action action) {
        actionList.add(action);
    }

    public void executeActions() {
        Iterator<Action> iterator = actionList.iterator();
        while (iterator.hasNext()) {
            Action action = iterator.next();
            action.perform("This is a log message");
        }
    }
}

