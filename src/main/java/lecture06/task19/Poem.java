package lecture06.task19;

public class Poem {

    private int stropheNumbers;
    private Author creator;

    public Poem(int stropheNumbers, Author creator) {
        this.stropheNumbers = stropheNumbers;
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }
}
