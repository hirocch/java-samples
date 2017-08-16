/*
 * MIT License
 *
 * Copyright (c) 2017 HIROCCH
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.hirocch;

/**
 * ロードバイククラス
 *
 * @author hirocch
 */
public class RoadBike implements Bicycle2 {

    /**
     * ギア定数
     */
    static final int NUM_GEARS = 6;

    /**
     * 回転数
     */
    int cadence = 0;

    /**
     * スピード
     */
    int speed = 0;

    /**
     * ギア
     */
    int gear = 0;

    /**
     * 回転数を変更する
     *
     * @param newValue 回転数
     */
    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    /**
     * ギアを変更する
     *
     * @param newValue ギア
     */
    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    /**
     * 加速する
     *
     * @param increment スピード
     */
    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    /**
     * 減速する
     *
     * @param decrement スピード
     */
    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    /**
     * 回転数、スピード、ギアを表示する
     */
    void printStates() {
        System.out.println(
                "[ロードバイク]" +
                "回転数:" + cadence +
                " スピード:" + speed +
                " ギア:" + gear);
    }
}
