package Nba;

public class Average {
    Players players;

    String name;

    public Average(Players players){
        this.players = players;

    }

    public void avgPoints() {

        switch (players){
            case James:
                System.out.println("27PPG");
                break;
            case  Davis:
                    System.out.println("28PPG");
                    break;
            case Curry:
                        System.out.println("27PPG");
                        break;
            case Geroge:
                            System.out.println("29PPG");
                            break;
            case Harden:
                                System.out.println("36PPG");
                                break;
            default:
                System.out.println("27PPG, 26PPG, 36PPG, 29PPG, 30PPG, 29PPG, 31PPG");

        }

    }

}
