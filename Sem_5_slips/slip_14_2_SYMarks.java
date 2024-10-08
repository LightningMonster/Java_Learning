// File: SY/SYMarks.java
package Sem_5_slips;

public class slip_14_2_SYMarks {
    private int computerTotal;
    private int mathsTotal;
    private int electronicsTotal;

    // Constructor
    public slip_14_2_SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
        this.computerTotal = computerTotal;
        this.mathsTotal = mathsTotal;
        this.electronicsTotal = electronicsTotal;
    }

    // Getter methods
    public int getComputerTotal() {
        return computerTotal;
    }

    public int getMathsTotal() {
        return mathsTotal;
    }

    public int getElectronicsTotal() {
        return electronicsTotal;
    }

    // Method to get the total marks of SY subjects
    public int getTotal() {
        return computerTotal + mathsTotal + electronicsTotal;
    }
}
