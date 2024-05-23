package com.ets;


public class App {
    public static void main( String[] args ) {
        TrappingRain trappingRain = new TrappingRain();
        int[] array = {7, 0, 3, 2, 5, 0, 6, 4, 0, 5};
        int result = trappingRain.trapping(array);
        System.out.println("Toplam biriken su miktarı: " + result);
    }
}
