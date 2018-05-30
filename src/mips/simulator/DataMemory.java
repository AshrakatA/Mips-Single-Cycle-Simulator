package mips.simulator;

import java.util.ArrayList;

public class DataMemory {

    ArrayList<Data> DM = new ArrayList();

    public void store(int value, int address) {
        for (int i = 0; i < DM.size(); i++) {
            if (DM.get(i).getAddress() == address) {
                DM.get(i).setValue(value);
                return;
            }

        }

        DM.add(new Data(value, address));
    }

    public int load(int address) {
        for (int i = 0; i < DM.size(); i++) {
            if (DM.get(i).getAddress() == address) {
                return DM.get(i).getValue();
            }
        }
        return 0;
    }

    public void empty() {
        for (int i = 0; i < DM.size(); i++) {
            DM.clear();
        }

    }
}
