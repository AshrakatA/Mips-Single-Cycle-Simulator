
package mips.simulator;

public class Adder {
    private int first;
    private int second;
    private int output;
    
    public Adder(int first, int second, int output)
    {this.first=first;
    this.second=second;
    this.output=output;}
    
    public void add(int first, int second)
    {this.first=first; this.second=second;
     this.output=first+second;}
    
    public int getoutput(){return this.output;}
}
