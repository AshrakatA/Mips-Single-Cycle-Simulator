package mips.simulator;

public class generatecode {

    private String instruction;
    private int r1;
    private int r2;
    private int r3;
    private int consta;
    private int pc = 0;

    private ConvertBinary b = new ConvertBinary();
    private ShiftLeft s = new ShiftLeft();

    private registers_file r = new registers_file();

    public generatecode(String instruction, int r1/*rd*/, int r2/*rs*/, int r3/*rt*/, int consta/*constants for jumps and i*/) {
        this.instruction = instruction;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.consta = consta;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getConsta() {
        return consta;
    }

    public String[] instructioncode() {

        switch (instruction) {
            case "sub": {
                String opcode = "000000";
                String rd = b.ConvertToBinary(r1, 5);
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String shamt = "00000";
                String functcode = "100010";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;
            }
            case "sltu": {
                String opcode = "000000";
                String rd = b.ConvertToBinary(r1, 5);
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String shamt = "00000";
                String functcode = "101001";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;
            }

            case "add": {
                String opcode = "000000";
                String rd = b.ConvertToBinary(r1, 5);
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String shamt = "00000";
                String functcode = "100000";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;

            }
            case "mul": {
                String opcode = "000000";
                String rd = b.ConvertToBinary(r1, 5);
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String shamt = "00000";
                String functcode = "011000";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;

            }
            case "and": {
                String opcode = "000000";
                String rd = b.ConvertToBinary(r1, 5);
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String shamt = "00000";
                String functcode = "100100";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;

            }
            case "or": {
                String opcode = "000000";
                String rd = b.ConvertToBinary(r1, 5);
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String shamt = "00000";
                String functcode = "100101";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;

            }
            case "addi": {
                String opcode = "001000";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;

            }
            case "andi": {
                String opcode = "001100";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;

            }
            case "ori": {
                String opcode = "001101";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;

            }
            case "lw": {
                String opcode = "100011";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;

            }
            case "lh": {
                String opcode = "100001";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;

            }
            case "lhu": {
                String opcode = "100101";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;

            }
            case "sw": {
                String opcode = "101011";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;

            }
            case "sh": {
                String opcode = "101001";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;

            }
            case "lb": {
                String opcode = "100000";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;
            }
            case "lui": {
                String opcode = "001111";
                String rs = b.ConvertToBinary(0, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;
            }
            case "lbu": {
                String opcode = "100100";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;
            }
            case "sb": {
                String opcode = "101000";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;
            }
            case "slt": {
                String opcode = "000000";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String rd = b.ConvertToBinary(r1, 5);
                String shamt = "00000";
                String functcode = "101010";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;

            }
            case "nor": {
                String opcode = "000000";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String rd = b.ConvertToBinary(r1, 5);
                String shamt = "00000";
                String functcode = "100111";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;

            }
            case "beq": {
                String opcode = "000100";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rt, rs, offset};//swapped rs and rt for machine code correctness
                return instructioncode;
            }
            case "bne": {
                String opcode = "000101";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rt, rs, offset};//swapped rs and rt for machine code correctness
                return instructioncode;
            }
            case "sll": {
                String opcode = "000000";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String rd = b.ConvertToBinary(r1, 5);
                String shamt = b.ConvertToBinary(consta, 5);
                String functcode = "000000";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;

            }
            case "srl": {
                String opcode = "000000";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String rd = b.ConvertToBinary(r1, 5);
                String shamt = b.ConvertToBinary(consta, 5);
                String functcode = "000010";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;

            }
            case "slti": {
                String opcode = "001010";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;
            }
            case "sltiu": {
                String opcode = "001001";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(r3, 5);
                String offset = b.ConvertToBinary(consta, 16);
                String[] instructioncode = {opcode, rs, rt, offset};
                return instructioncode;
            }

            case "j": {
                String opcode = "000010";
                //String address = (b.ConvertToBinary(pc, 32)).substring(0, 4)+s.shift(consta, 26);
                String address = b.ConvertToBinary(consta, 26);
                String[] instructioncode = {opcode, address};
                return instructioncode;
            }
            case "jal": {
                String opcode = "000011";
                //String address = (b.ConvertToBinary(pc, 32)).substring(0, 4)+s.shift(consta, 26);
                String address = b.ConvertToBinary(consta, 26);
                String[] instructioncode = {opcode, address};
                return instructioncode;
            }
            case "jr": {
                String opcode = "000000";
                String rs = b.ConvertToBinary(r2, 5);
                String rt = b.ConvertToBinary(0, 5);
                String rd = b.ConvertToBinary(0, 5);
                String shamt = "00000";
                String functcode = "001000";
                String[] instructioncode = {opcode, rs, rt, rd, shamt, functcode};
                return instructioncode;
            }
            default:
                return null;
        }

    }

    public String getInstruction() {
        return instruction;
    }

    public int getR1() {
        return r1;
    }

    public int getR2() {
        return r2;
    }

    public int getR3() {
        return r3;
    }

}
