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
 * 矩形クラス。
 *
 * @author hirocch
 */
public class Rectangle {
    /**
     * 幅
     */
    public int width = 0;

    /**
     * 高さ
     */
    public int height = 0;

    /**
     * 位置
     */
    public Point origin;

    /**
     * コンストラクタ
     */
    public Rectangle() {
        this(new Point(0, 0));
    }

    /**
     * コンストラクタ
     *
     * @param p ポイント
     */
    public Rectangle(Point p) {
        origin = p;
    }

    /**
     * コンストラクタ
     *
     * @param w 幅
     * @param h 高さ
     */
    public Rectangle(int w, int h) {
        this(new Point(0,0), w, h);
    }

    /**
     * コンストラクタ
     *
     * @param p 位置
     * @param w 幅
     * @param h 高さ
     */
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    /**
     * 移動する
     *
     * @param x 新しい位置(X座標)
     * @param y 新しい位置(Y座標)
     */
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    /**
     * 矩形の面積を取得する
     *
     * @return 面積
     */
    public int getArea() {
        return width * height;
    }
}
