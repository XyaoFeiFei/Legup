package edu.rpi.legup.puzzle.lightup;

public enum LightUpCellType {
    BULB(-4), EMPTY(-3), UNKNOWN(-2), BLACK(-1), NUMBER(0);

    public int value;

    /**
     * LightUpCellType constructor
     *
     * @param value
     * @return none
     */
    LightUpCellType(int value) {
        this.value = value;
    }
    
    /**
     * return this's type value
     *
     * @param none
     * @return int
     */
    public int toValue() {
        return this.value;
    }
}
