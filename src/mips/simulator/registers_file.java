package mips.simulator;

public class registers_file {

    public register[] r = new register[32];

    public registers_file() {
        r[0] = new register("$0", 0, 0);//$zero =0
        r[1] = new register("$at", 0, 1);//$at=1
        r[2] = new register("$v0", 0, 2);//$v0=2
        r[3] = new register("$v1", 0, 3);//$v1
        //$a0-$a3 
        for (int i = 4; i <= 7; i++) {

            r[i] = new register("$a" + (i - 4), 0, i);

        }
        //$t0-$t7
        for (int i = 8; i <= 15; i++) {

            r[i] = new register("$t" + (i - 8), 0, i);

        }
        //$s0-$s7
        for (int i = 16; i <= 23; i++) {

            r[i] = new register("$s" + (i - 16), 0, i);

        }
        //$t8, $t9 
        for (int i = 24; i <= 25; i++) {

            r[i] = new register("$t" + (i - 16), 0, i);

        }
        //$k0, $k1 
        for (int i = 26; i <= 27; i++) {
            for (int j = 0; j <= 1; j++) {
                r[i] = new register("k" + (i - 26), 0, i);
            }
        }
        r[28] = new register("$gp", 268468224, 28);
        r[29] = new register("$sp", 2147479548, 29);
        r[30] = new register("$fp", 0, 30);
        r[31] = new register("$ra", 0, 31);

    }

    public int regnum(String name) {
        for (int i = 0; i < r.length; i++) {
            if (r[i].getname().equals(name)) {
                return i;
            }
        }
        return 0;

    }

    public int readdata(int index)//reads data in the register
    {
        return r[index].getdata();
    }

    public void writedata(int index, int value)//sets data in the register
    {
        if (index != 0) {
            r[index].setdata(value);
        }
    }

    public void empty() {
        for (int i = 0; i < 32; i++) {
            r[i].setdata(0);
        }
    }

}
