public class TestEvaluation {
    public static void main(String[] args) {
        Evaluation ev1 = new Evaluation("POO", 14, 12, 2012);
        Evaluation ev2 = new Evaluation("POO", 9, 10.5, 2013);
        Evaluation ev3 = new Evaluation("BDD", 10, 11.75, 2012);
        double moyenne1 = ev1.moyenne();
        double moyenne2 = ev2.moyenne();
        double moyenne3 = ev3.moyenne();

        ev1.deliberer();
        ev2.deliberer();
        ev3.deliberer();

        ev1.comparerNote(ev2);
        ev2.comparerNote(ev3);

    }
}
