package com.exam;

public class drawer extends addon_adder{
    int drawer_cost_2 =2000;
    int drawer_cost_3 =2000;
    public drawer(wardobles wardoble){
        super(wardoble);

    }
    /***
     * return the cost of two door drawer addon
     */
    public int get_two_door() {
        return wardoble.get_two_door()+drawer_cost_2;

    }
    /***
     * return the cost of three door drawer addon
     */
    public int get_three_door() {
        return wardoble.get_two_door()+drawer_cost_3;

    }
}
