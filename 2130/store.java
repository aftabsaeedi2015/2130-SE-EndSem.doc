package com.exam;

import java.util.ArrayList;
import java.util.Scanner;
/***
 * the client can choose the wordoble and addons through a command line interface in this class
 */
public class store {
    public static void main(String[] args) {
        ArrayList<Integer> addon_list = new ArrayList<>();
        addon_adder addon;
        String wardoble_choice;
        wardobles wardoble;
        System.out.println("what type of wardoble do you prefer 1 for readl wood 2 for metal 3 for compressed wood");
        Scanner wardoble_input = new Scanner(System.in);
        wardoble_choice = wardoble_input.nextLine();
        System.out.println("which addons do you want to add 1 for locker 2 for mirror 3 for drawer 4 for extra shelf 5 for extra hanging rod");
        Scanner choices_input = new Scanner(System.in);
        String choices = String.valueOf(choices_input.nextLine());
        for (int i = 0; i < choices.length(); i++) {
            addon_list.add(Integer.parseInt(String.valueOf(choices.charAt(i))));
        }

        switch (wardoble_choice) {
            case "1":
                wardoble = new real_wood();
                break;
            case "2":
                wardoble = new metal();
                break;
            case "3":
                wardoble = new compressed_wood();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + wardoble_choice);
        }

        for (int i = 0; i <= addon_list.size(); i++) {
            switch (addon_list.get(i)) {
                case 1:
                    addon = new locker(wardoble);
                    break;
                case 2:
                    addon = new mirror(wardoble);
                    break;
                case 3:
                    addon = new drawer(wardoble);
                    break;
                case 4:
                    addon = new extra_shelf(wardoble);
                    break;
                case 5:
                    addon = new extra_hanging_rod(wardoble);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + addon_list.get(i));
            }
            
            System.out.println(addon.get_two_door());
        }
    }}
