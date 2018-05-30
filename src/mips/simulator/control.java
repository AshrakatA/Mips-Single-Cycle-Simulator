package mips.simulator;

class control {

    /* private String ALUOp = "00";
    private String RegDst = "0", RegWrite = "0", ALUSrc = "0", MemWrite = "0", MemRead = "0", MemToReg = "0", Jump = "0", Branch = "0";//(0 or 1)
     */
    private String ALUOp;
    private String RegDst;
    private String RegWrite;
    private String ALUSrc;
    private String MemWrite;
    private String MemRead;
    private String MemToReg;
    private String Jump;
    private String Branch;

    public control(String opcode) {//missing data is don't care

        if ("000000".equals(opcode))//r-type
        {
            ALUOp = "10";
            RegDst = "1";
            RegWrite = "1";
            ALUSrc = "0";
            MemWrite = "0";
            MemRead = "0";
            MemToReg = "0";
            Jump = "0";
            Branch = "0";

        }
        if ("001000".equals(opcode))//addi 
        {
            ALUOp = "00";
            RegDst = "0";
            RegWrite = "1";
            ALUSrc = "1";
            MemWrite = "0";
            MemRead = "0";
            MemToReg = "0";
            Jump = "0";
            Branch = "0";
        }
        if ("001111".equals(opcode))//lui 
        {
            ALUOp = "111";
            RegDst = "0";
            RegWrite = "1";
            ALUSrc = "1";
            MemWrite = "0";
            MemRead = "0";
            MemToReg = "0";
            Jump = "0";
            Branch = "0";
        }
        if ("001100".equals(opcode))//andi 
        {
            ALUOp = "11";
            RegDst = "0";
            RegWrite = "1";
            ALUSrc = "1";
            MemWrite = "0";
            MemRead = "0";
            MemToReg = "0";
            Jump = "0";
            Branch = "0";

        }
        if ("001101".equals(opcode))//ori
        {
            ALUOp = "000";
            RegDst = "0";
            RegWrite = "1";
            ALUSrc = "1";
            MemWrite = "0";
            MemRead = "0";
            MemToReg = "0";
            Jump = "0";
            Branch = "0";

        }
        if ("100011".equals(opcode))//lw
        {
            ALUOp = "00";
            MemRead = "1";
            MemToReg = "1";
            RegWrite = "1";
            ALUSrc = "1";
            Jump = "0";
            Branch = "0";
            RegDst = "0";
            MemWrite = "0";
        }
        if ("100001".equals(opcode))//lh
        {
            ALUOp = "00";
            MemRead = "1";
            MemToReg = "1";
            RegWrite = "1";
            ALUSrc = "1";
            Jump = "0";
            Branch = "0";
            RegDst = "0";
            MemWrite = "0";
        }
        if ("100101".equals(opcode))//lhu
        {
            ALUOp = "00";
            MemRead = "1";
            MemToReg = "1";
            RegWrite = "1";
            ALUSrc = "1";
            Jump = "0";
            Branch = "0";
            RegDst = "0";
            MemWrite = "0";
        }
        if ("100000".equals(opcode))//lb
        {
            ALUOp = "00";
            MemRead = "1";
            MemToReg = "1";
            RegWrite = "1";
            ALUSrc = "1";
            Jump = "0";
            Branch = "0";
            RegDst = "0";
            MemWrite = "0";

        }
        if ("100100".equals(opcode))//lbu
        {
            ALUOp = "00";
            MemRead = "1";
            MemToReg = "1";
            RegWrite = "1";
            ALUSrc = "1";
            Jump = "0";
            Branch = "0";
            RegDst = "0";
            MemWrite = "0";

        }
        if ("101011".equals(opcode)||"101001".equals(opcode))//sw,sh
        {
            ALUOp = "00";
            ALUSrc = "1";
            MemWrite = "1";
            MemRead = "0";
            RegWrite = "0";
            Jump = "0";
            Branch = "0";
            RegDst = "0";
            MemToReg = "0";
        }
        if ("101000".equals(opcode))//sb
        {
            ALUOp = "00";
            ALUSrc = "1";
            MemWrite = "1";
            MemRead = "0";
            RegWrite = "0";
            Jump = "0";
            Branch = "0";
            RegDst = "0";
            MemToReg = "0";
        }
        if ("000100".equals(opcode)||"000101".equals(opcode))//beq //bne
        {
            ALUOp = "01";
            Branch = "1";
            ALUSrc = "0";
            MemWrite = "0";
            MemRead = "0";
            RegWrite = "0";
            Jump = "0";
            RegDst = "0";
            MemToReg = "0";

        }
        if ("000010".equals(opcode))//j
        {
            Jump = "1";
            MemWrite = "0";
            MemRead = "0";
            Branch = "0";
            RegWrite = "0";
            RegDst = "0";
            MemToReg = "0";
            ALUOp = "00";
            ALUSrc = "0";
        }
        if ("000011".equals(opcode))//jal
        {
            MemWrite = "0";
            MemRead = "0";
            Jump = "1";
            RegWrite = "1";
            RegDst = "10";
            MemToReg = "10";
            ALUOp = "00";
            ALUSrc = "0";
            Branch = "0";
        }

        if ("001010".equals(opcode) || "001001".equals(opcode))//slti //sltiu
        {
            ALUOp = "10";
            MemRead = "0";
            MemToReg = "0";
            RegWrite = "1";
            ALUSrc = "1";
            Jump = "0";
            Branch = "0";
            RegDst = "0";
            MemWrite = "0";
        }

    }

    public String getALUOp() {
        return ALUOp;
    }

    public void setALUOp(String ALUOp) {
        this.ALUOp = ALUOp;
    }

    public String getRegDst() {
        return RegDst;
    }

    public void setRegDst(String RegDst) {
        this.RegDst = RegDst;
    }

    public String getRegWrite() {
        return RegWrite;
    }

    public void setRegWrite(String RegWrite) {
        this.RegWrite = RegWrite;
    }

    public String getALUSrc() {
        return ALUSrc;
    }

    public void setALUSrc(String ALUSrc) {
        this.ALUSrc = ALUSrc;
    }

    public String getMemWrite() {
        return MemWrite;
    }

    public void setMemWrite(String MemWrite) {
        this.MemWrite = MemWrite;
    }

    public String getMemRead() {
        return MemRead;
    }

    public void setMemRead(String MemRead) {
        this.MemRead = MemRead;
    }

    public String getMemToReg() {
        return MemToReg;
    }

    public void setMemToReg(String MemToReg) {
        this.MemToReg = MemToReg;
    }

    public String getJump() {
        return Jump;
    }

    public void setJump(String Jump) {
        this.Jump = Jump;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }
}
