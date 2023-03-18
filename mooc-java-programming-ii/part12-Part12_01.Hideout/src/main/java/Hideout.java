// import java.util.ArrayList;

public class Hideout<T> {
    private T hideout;

    public Hideout() {
        
    }

    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }

    public T takeFromHideout() {
        if (this.hideout == null) {
            return null;
        }
        T obj = this.hideout;
        this.hideout = null;
        return obj;
    }

    public boolean isInHideout() {
        if (this.hideout != null) {
            return true;
        }
        return false;
    }
    
}
