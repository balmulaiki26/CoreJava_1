package enumPractice;

public class Execution {
    public static void main(String[] args) {
        Week week = new Week(Days.Thursday);
        week.whatToDo();


        Year year = new Year(Months.May);
        year.whatToDo();
    }


}
