package com.fhl.example.sort;

import android.support.annotation.NonNull;

/**
 * <br/>
 * <li>Author hailong.fan
 * <li>Email fanhailong@vargo.com.cn
 * <li>Date 2019/1/7 16:25
 */
public class Cards implements Comparable<Cards> {
    public int pokerColors;//花色
    public int cardPoints;//点数

    public Cards(int pokerColors, int cardPoints) {
        this.pokerColors = pokerColors;
        this.cardPoints = cardPoints;
    }

    //提供一个方法，用来比较对象的大小
    @Override
    public int compareTo(@NonNull Cards o) {
        if (this.cardPoints > o.cardPoints) {
            return 1;
        } else if (this.cardPoints < o.cardPoints) {
            return -1;
        }

        if (this.pokerColors > o.pokerColors) {
            return 1;
        } else if (this.pokerColors < o.pokerColors) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "pokerColors=" + pokerColors +
                ", cardPoints=" + cardPoints +
                '}';
    }
}
