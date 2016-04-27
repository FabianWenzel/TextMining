public class Scene {

    private int number;
    private Act act;

    public Scene(Act act, int number) {
        this.number = number;
        this.act = act;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Act getAct() {
        return act;
    }

    public void setAct(Act act) {
        this.act = act;
    }


}
