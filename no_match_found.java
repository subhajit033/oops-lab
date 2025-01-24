import java.util.*;

class NoMatchFound extends Exception {
    NoMatchFound(String message) {
        super(message);
    }
}

public class no_match_found {
    public static void main(String[] args) throws NoMatchFound {
        String city[] = { "Delhi", "Mumbai", "Noida", "Kolkata" };
        boolean isMatchFound = false;
        for (int i = 0; i < city.length; i++) {
            if (city[i] == "Kolkata") {
                isMatchFound = true;
                break;
            }
        }
        if (!isMatchFound) {
            throw new NoMatchFound("Kolkata not found");
        } else {
            System.out.println("Found");
        }

    }
}
