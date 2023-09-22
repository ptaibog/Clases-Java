package com.campusdual.excepcionsTryCatch;

import java.util.Random;

public class RandomNumber {

    private Random r = new Random();
    public int randomNumber() {

        int number = this.r.nextInt(10) + 1;

        return number;
    }
}
