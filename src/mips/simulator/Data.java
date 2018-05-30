
package mips.simulator;

public class Data {
    private int value;
    private int address;

    public Data(int value, int address) {
        this.value = value;
        this.address = address;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
    
}
