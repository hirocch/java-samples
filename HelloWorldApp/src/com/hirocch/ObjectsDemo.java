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

import java.util.Objects;

/**
 * java.util.Objectsデモクラス。
 */
public class ObjectsDemo {

    /**
     * メイン
     *
     * @param args コマンドラインパラメータ
     */
    public static void main(String[] args) {

        Integer null1 = null;
        Integer null2 = null;

        Integer a = 5;
        Integer b = 10;
        Integer c = 10;

        // DEMO01
        try {
            if (null1.equals(null2)) {
                System.out.println("[DEMO01]ここには来ない");
            }
        } catch (NullPointerException e) {
            System.out.println("[DEMO01]NullPointerException");
        }
        // DEMO02
        try {
            if (null1.equals(b)) {
                System.out.println("[DEMO02]ここには来ない");
            }
        } catch (NullPointerException e) {
            System.out.println("[DEMO02]NullPointerException");
        }

        // DEMO03
        try {
            if (a.equals(null2)) {
                System.out.println("[DEMO03]ここには来ない");
            } else {
                System.out.println("[DEMO03]aとnullは異なる");
            }
        } catch (NullPointerException e) {
            System.out.println("[DEMO03]NullPointerException(ここには来ない)");
        }

        // DEMO04
        if (a.equals(b)) {
            System.out.println("[DEMO04]ここには来ない");
        } else {
            System.out.println("[DEMO04]aとbは異なる");
        }

        // DEMO05
        if (b.equals(c)) {
            System.out.println("[DEMO05]bとcは同じ");
        } else {
            System.out.println("[DEMO05]ここには来ない");
        }

        // DEM11
        try {
            if (Objects.equals(null1, null2)) {
                System.out.println("[DEMO11]null1とnull2は同じ");
            } else {
                System.out.println("[DEMO11]ここには来ない");
            }
        } catch (NullPointerException e) {
            System.out.println("[DEMO11]NullPointerException(ここには来ない)");
        }

        // DEM12
        try {
            if (Objects.equals(null1, b)) {
                System.out.println("[DEMO12]ここには来ない");
            } else {
                System.out.println("[DEMO12]null1とbは異なる");
            }
        } catch (NullPointerException e) {
            System.out.println("[DEMO12]NullPointerException(ここには来ない)");
        }

        // DEM13
        try {
            if (Objects.equals(a, null2)) {
                System.out.println("[DEMO13]ここには来ない");
            } else {
                System.out.println("[DEMO13]aとnull2は異なる");
            }
        } catch (NullPointerException e) {
            System.out.println("[DEMO13]NullPointerException(ここには来ない)");
        }

        // DEM14
        try {
            if (Objects.equals(a, b)) {
                System.out.println("[DEMO14]ここには来ない");
            } else {
                System.out.println("[DEMO14]aとbは異なる");
            }
        } catch (NullPointerException e) {
            System.out.println("[DEMO14]NullPointerException(ここには来ない)");
        }

        // DEM15
        try {
            if (Objects.equals(b, c)) {
                System.out.println("[DEMO15]bとcは同じ");
            } else {
                System.out.println("[DEMO15]ここには来ない");
            }
        } catch (NullPointerException e) {
            System.out.println("[DEMO15]NullPointerException(ここには来ない)");
        }
    }
}
