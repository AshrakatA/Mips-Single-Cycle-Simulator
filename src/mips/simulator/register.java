package mips.simulator;

public class register {

    private String name;
    private int data;
    private int index;
    public register(String name, int data, int index) {
        this.name = name;
        this.data = data;
        this.index=index;
    }

    public String getname() {return this.name;}
    
    public void setdata(int newdata) {if(this.index!=0)this.data=newdata;}

    public int getdata() {return this.data;}
  
    public int getindex() {return this.index;}
}
