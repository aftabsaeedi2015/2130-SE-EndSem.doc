package com.exam;

public class locker extends  addon_adder{
    int drawer_cost_2 =5000;
    int drawer_cost_3 =5000;
    public locker(wardobles wardoble){
        super(wardoble);

    }
    /***
     * return the cost of two door locker addon
     */
    public int get_two_door() {
        return wardoble.get_two_door()+drawer_cost_2;

    }
    /***
     * return the cost of three door locker addon
     */
    public int get_three_door() {
        return wardoble.get_two_door()+drawer_cost_3;

    }
}
