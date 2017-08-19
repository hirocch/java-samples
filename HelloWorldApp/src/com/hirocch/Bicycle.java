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
 * 自転車クラス
 *
 * @author hirocch
 */
public class Bicycle {
    /**
     * 回転数
     */
    int cadence;

    /**
     * スピード
     */
    int speed;

    /**
     * ギア
     */
    int gear;

    /**
     * ID
     */
    private int id;

    /**
     * 採番用番号
     */
    private static int numberOfBicycles = 0;

    /**
     * コンストラクタ
     */
    public Bicycle() {
        this(10, 0, 1);
    }

    /**
     * コンストラクタ
     *
     * @param startCadence 回転数の初期値
     * @param startSpeed   スピードの初期値
     * @param startGear    ギアの初期値
     */
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;

        // IDを採番
        id = ++numberOfBicycles;
    }

    /**
     * 回転数を取得する
     *
     * @return 回転数
     */
    public int getCadence() {
        return cadence;
    }

    /**
     * 回転数を設定する
     *
     * @param newValue 回転数
     */
    void setCadence(int newValue) {
        cadence = newValue;
    }

    /**
     * ギアを取得する
     *
     * @return ギア
     */
    public int getGear() {
        return gear;
    }

    /**
     * ギアを設定する
     *
     * @param newValue ギア
     */
    void setGear(int newValue) {
        gear = newValue;
    }

    /**
     * 速度を取得する
     *
     * @return 速度
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * 加速する
     *
     * @param increment スピード
     */
    void speedUp(int increment) {
        speed += increment;
    }

    /**
     * 減速する
     *
     * @param decrement スピード
     */
    void applyBrakes(int decrement) {
        speed -= decrement;
    }

    /**
     * 回転数、スピード、ギアを表示する
     */
    void printStates() {
        System.out.printf("回転数:%s スピード:%s ギア:%s\n", cadence, speed, gear);
    }

    /**
     * IDを取得する
     *
     * @return ID
     */
    public int getID() {
        return id;
    }

    /**
     * 採番用番号を取得する
     *
     * @return 採番用番号
     */
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }
}
