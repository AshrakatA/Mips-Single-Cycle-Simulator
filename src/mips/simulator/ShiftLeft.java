
package mips.simulator;

public class ShiftLeft{
    public String shift(int decimal,int numofbits)
    { int sh=decimal*4;
    ConvertBinary n=new ConvertBinary();
    String SHIFT=n.ConvertToBinary(sh, numofbits);
    
     return SHIFT;
    }}