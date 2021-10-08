package za.ac.nwu.as.logic.config.flow.impl;

public class Modulo {
    public Integer doMod(int divided, int divisor) {
        if (divisor == 0){
            return null;
        }
        return divided % divisor;
    }
}
