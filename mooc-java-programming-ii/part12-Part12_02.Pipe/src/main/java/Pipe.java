import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipeLine;

    public Pipe() {
        this.pipeLine = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipeLine.add(value);
    }

    public T takeFromPipe() {
        if (this.pipeLine.size() == 0) {
            return null;
        }
        return this.pipeLine.remove(0);

    }

    public boolean isInPipe() {
        return this.pipeLine.size() == 0;
    }

}
