/**
 * Created by fuexle on 27.04.2016.
 */
public class Act {

    private Work work;
    private int number;

    public Act(Work work, int number) {
        this.work = work;
        this.number = number;
    }



    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}