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
 * データ型
 *
 * @author hirocch
 */
public class DataType {
    /**
     * boolean型
     * true / false(default)
     */
    boolean result = true;

    /**
     * char型
     * 0/'\u0000'/null(default)
     */
    char moji = '\u0020';   // ' '(空白)

    /**
     * byte型
     * 0(default)
     */
    byte b = 100;

    /**
     * short型
     * 16bit(-32,768～32,767)
     * 0(default)
     */
    short s = 32767;

    /**
     * int型
     * 32bit
     * 0(default)
     */
    int i = 100_000;

    /**
     * int型(16進数)
     */
    int i2 = 0x1a; // 26 decimal

    /**
     * int型(2進数)
     */
    int i3 = 0b001_1010; // 26 decimal

    /**
     * long型
     * 32bit
     * 0L(default)
     */
    long l = 200000L;

    /**
     * float型
     * 0.0f(default)
     */
    float f = 12345.678f;

    /**
     * double型
     * 0.0d(default)
     */
    double d = 12345.678d;

    /**
     * String型
     * null(default)
     */
    String str = "this is a string";
}
