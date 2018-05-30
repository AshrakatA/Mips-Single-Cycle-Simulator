package mips.simulator;

public class ALU {

    private final String AC;
    private final int firstdata;
    private final int seconddata;
    private int shamt;
    private int zeroflag;

    public ALU(int firstdata, int seconddata, String AC) {
        this.firstdata = firstdata;
        this.seconddata = seconddata;
        this.AC = AC;
        shamt = 0;
    }

    public void setShamt(int shamt) {
        this.shamt = shamt;
    }

    public String getAC() {
        return AC;
    }

    public int operations() {

        switch (AC) {
            //lw, sw and addi
            case "0010":
                return (firstdata + seconddata);

            // sub // beq //bne
            case "0110":
                return (firstdata - seconddata);
            
            //mul
            case "1010":
                return (firstdata * seconddata);

            // and
            case "0000":
                return (firstdata & seconddata);

            // or
            case "0001":
                return (firstdata | seconddata);

            //slt //slti //sltu
            case "0111":
                if (firstdata < seconddata) {
                    return 1;
                } else {
                    return 0;
                }

            //nor
            case "1100":
                return ~(firstdata | seconddata);

            //sll
            case "0100":
                return (seconddata << shamt);
            //lui
            case "1111":
                return (seconddata << 16);
            //srl
            case "0101":
                return (seconddata >> shamt);

            default:
                return -1; //error
            }

    }

    public void setZeroflag(int zeroflag) {
        this.zeroflag = zeroflag;
    }

    public int getZeroflag() {
        return zeroflag;
    }

}
