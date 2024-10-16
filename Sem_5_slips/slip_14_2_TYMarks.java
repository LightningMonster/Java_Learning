// File: TY/TYMarks.java
package Sem_5_slips;

public class slip_14_2_TYMarks {
    private int theory;
    private int practicals;

    // Constructor
    public slip_14_2_TYMarks(int theory, int practicals) {
        this.theory = theory;
        this.practicals = practicals;
    }

    // Getter methods
    public int getTheory() {
        return theory;
    }

    public int getPracticals() {
        return practicals;
    }

    // Method to get the total marks of TY subjects
    public int getTotal() {
        return theory + practicals;
    }
}
