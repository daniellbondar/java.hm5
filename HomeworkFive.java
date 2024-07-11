package com.telran.org.homeworks;

public class HomeworkFive {

    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);

        System.out.println("I can buy something to eat, it`s " + canBuy);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen && isReweOpen;

    }
}
