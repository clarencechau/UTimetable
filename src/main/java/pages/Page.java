package pages;

import java.util.*;

public abstract class Page {
    protected Router router;

    public Page(Router router) {
        this.router = router;
    }

    protected <T> T promptInput(Map<String, T> options) {

        Scanner in = new Scanner(System.in);

        List<String> optionsIndex = new ArrayList<>(options.keySet());

        for (int i = 0; i < optionsIndex.size(); i ++) {
            System.out.printf("%s. %s\n", i, optionsIndex);
        }
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Invalid input.");
        }
        return options.get(optionsIndex.get(in.nextInt()));
    }

    public abstract Page run();
}
