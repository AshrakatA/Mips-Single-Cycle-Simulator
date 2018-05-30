
package mips.simulator;

public class ConvertBinary {
   public String ConvertToBinary(int decimal, int numofbits)
   {
   String binary= Integer.toBinaryString(decimal);
   
   if(decimal>=0)
   {while(binary.length()<numofbits)
     { binary="0"+binary;}
   }
   else
   {String temp=Integer.toBinaryString(-decimal);//the size of binary number when it's positive
       binary= binary.substring(binary.length()-temp.length());//tobinary string method outputs 32 bits when the deciaml is negative, so used to minimize the bits to the desired number
       while(binary.length()<numofbits)
   { binary="1"+binary;}
   }
   return binary;
   }
}
