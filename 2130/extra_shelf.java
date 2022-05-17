package com.exam;

public class extra_shelf extends addon_adder{
    int drawer_cost_2 =500;
    int drawer_cost_3 =500;
    public extra_shelf(wardobles wardoble){
        super(wardoble);

    }
    /***
     * return the cost of two door extra shelf addon
     */
    public int get_two_door() {
        return wardoble.get_two_door()+drawer_cost_2;

    }
    /***
     * return the cost of three door extra shelf addon
     */
    public int get_three_door() {
        return wardoble.get_two_door()+drawer_cost_3;

    }

}
