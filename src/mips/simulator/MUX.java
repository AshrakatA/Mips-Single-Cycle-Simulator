package mips.simulator;

public class MUX {

    private String zero;
    private String one;
    private String two;
    private int z;
    private int o;
    private int t;

    public int getO() {
        return o;
    }

    public MUX(String zero, String one) {
        this.zero = zero;
        this.one = one;
    }

    public MUX(String zero, String one, String two) {
        this.zero = zero;
        this.one = one;
        this.two = two;
    }

    public MUX(int z, int o) {
        this.z = z;
        this.o = o;
    }

    public MUX(int z, int o, int t) {
        this.z = z;
        this.o = o;
        this.t = t;
    }

    public int outputi(int input) {
        if (input == 0) {
            return this.z;
        } else {
            return this.o;
        }

    }

    public int outputiextra(int input) {
        switch (input) {
            case 0:
                return this.z;
            case 1:
                return this.o;
            default:
                return this.t;
        }

    }

    public String output(String input) {

        if (input.equals("0")) {
            return this.zero;//chooses the input from first source
        } else {
            return this.one;//chooses the input from the second source
        }
    }
    
    public String outputextra(String input)
    {
        switch (input) {
            case "0":
                return this.zero;//chooses the input from first source
            case "1":
                return this.one;//chooses the input from the second source
            default:
                return this.two;
        }
    
    }

}
