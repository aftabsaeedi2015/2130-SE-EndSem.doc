package com.exam;

public class mirror extends addon_adder{
    int drawer_cost_2 =4000;
    int drawer_cost_3 =4000;
    public mirror(wardobles wardoble){
        super(wardoble);

    }
    /***
     * return the cost of two door mirror addon
     */
    public int get_two_door() {
        return wardoble.get_two_door()+drawer_cost_2;

    }

    public int get_three_door() {
        return wardoble.get_two_door()+drawer_cost_3;

    }
}
