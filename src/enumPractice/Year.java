package enumPractice;

public class Year {

    Months months;

    String name;

    public Year(Months months){
        this.months = months;

    }
    public void whatToDo(){


        switch (months){
            case January:
                System.out.println("I will be off this summer");
                break;
            case May:
                System.out.println("I will be wokring on a project");
                break;
            case March:
                System.out.println("I will be stopping by LA");
            case April:
            case June:
            case July:
            case August:
                System.out.println("It is preseason");
                break;
            default:
                System.out.println("I will be at home watching TV");
                break;
        }
    }
}

