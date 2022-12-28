package observer;

public class ConcreteMember implements Member{
    UndoableStringBuilder new_usb;
    @Override
    public void update(UndoableStringBuilder usb) {
        new_usb=usb;
    }

    @Override
    public String toString() {
        return new_usb.toString();
    }
}
