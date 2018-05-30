package mips.simulator;

public class ALUController {

    String AC = "0000";//default

    public String ALUController(String ALUOp, String func) {

        if ("00".equals(ALUOp))//SW,LW,LB,LBU,SB,LH
        {
            AC = "0010";
        }
        if ("01".equals(ALUOp))//beq //bne
        {
            AC = "0110";
        }
        if ("11".equals(ALUOp))//andi
        {
            AC = "0000";
        }
        if ("000".equals(ALUOp))//ori
        {
            AC = "0001";
        }
        if ("111".equals(ALUOp))//lui
        {
            AC = "1111";
        }

        if ("10".equals(ALUOp))//R-Type
        {
            if ("100000".equals(func)) {
                AC = "0010";
            }//add
            else if ("100010".equals(func)) {
                AC = "0110";
            }//subtract
            else if ("100100".equals(func) || "001100".equals(func)) {
                AC = "0000";
            }//and
            else if ("100101".equals(func)) {
                AC = "0001";
            }//or
            else if ("101010".equals(func) || "101001".equals(func)) {
                AC = "0111";
            }//slt //sltu
            else if ("000000".equals(func)) {
                AC = "0100";
            }//sll
            else if ("000010".equals(func)) {
                AC = "0101";
            }//srl
            else if ("100111".equals(func)) {
                AC = "1100";
            }//nor
            else if("011000".equals(func))
            {AC="1010";}
            else {
                AC = "0111"; //slti //sltiu
            }

        }
        return AC;
    }

}
