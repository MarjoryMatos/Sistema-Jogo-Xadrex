package boardgame;

public class Position {
    private int now;
    private int column;

    public Position(int now, int column) {
        this.now = now;
        this.column = column;
    }

    public int getNow() {
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Position{" +
                "now=" + now +
                ", column=" + column +
                '}';
    }
}
