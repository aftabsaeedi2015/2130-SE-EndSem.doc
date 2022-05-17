package com.exam;

abstract class addon_adder implements wardobles{
    protected wardobles wardoble;

    /***
     * base class for all adons
     * @param wardoble
     */
    public addon_adder(wardobles wardoble) {
        this.wardoble = wardoble;
    }
    /***
     * base class for all adons
     * getting the cost for two doors wardoble
     */
    public int get_two_door() {
        return wardoble.get_two_door();
    }

    /***
     * base class for all adons
     * getting the cost for three door wardoble
     */
    public int get_three_door() {
        return wardoble.get_three_door();
    }
}
