package ro.fasttrackit.curs7;

public class Door {
    //STATE deschis/inchis
    private boolean open;

    public Door() {
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void close() {
        if (!this.open) {
            System.out.println("The door is already closed");
        } else {
            this.open = false;
        }
    }

    public void open() {
        if (this.open) {
            System.out.println("The door is already opened");
        } else {
            this.open = true;
        }
    }
}
