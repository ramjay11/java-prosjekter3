package com.ramjava.veer.automatische.bedrading.express;

public class Human {
    private Heart heart;

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping() {
        if (heart != null) {
            heart.pump();
        } else {
            System.out.println("Du bist tot!");
        }
    }
}
