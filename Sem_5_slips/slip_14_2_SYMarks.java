package Sem_5_slips;

public class slip_14_2_SYMarks {
    private int computerMarks;
    private int mathsMarks;
    private int electronicsMarks;

    public slip_14_2_SYMarks(int computerMarks, int mathsMarks, int electronicsMarks) {
        this.computerMarks = computerMarks;
        this.mathsMarks = mathsMarks;
        this.electronicsMarks = electronicsMarks;
    }

    public int getComputerTotal() {
        return computerMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getElectronicsMarks() {
        return electronicsMarks;
    }

    public int getTotal() {
        return computerMarks + mathsMarks + electronicsMarks; // Total of all SY marks
    }
}
