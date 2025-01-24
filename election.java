class InvalidVoterAge extends Exception {
    InvalidVoterAge(String s) {
        super(s);
    }

}

class voter {
    int age;

    voter(int a) {
        age = a;
        voterValidator();
    }

    void voterValidator() {
        if (age < 18 || age > 135) {
            try {
                throw new InvalidVoterAge("Invalid age");
            } catch (InvalidVoterAge e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.println("Valid voter age");
        }
    }
}

public class election {
    public static void main(String[] args) {
        voter v1 = new voter(17);
    }
}
