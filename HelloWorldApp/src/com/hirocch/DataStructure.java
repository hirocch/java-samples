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

import java.util.stream.IntStream;

/**
 * データ構造クラス。配列のデモクラス。
 *
 * @author hirocch
 */
public class DataStructure {
    /**
     * 配列サイズ=15
     */
    private final static int SIZE = 15;

    /**
     * int型の配列
     */
    int[] arrayOfInts = new int[SIZE];

    /**
     * コンストラクタ
     */
    public DataStructure() {
        // 配列を初期化
        IntStream.range(0, SIZE)
                .forEach(i -> arrayOfInts[i] = i);
    }

    /**
     * 配列の偶数要素を表示する
     */
    public void printEven() {

        DataStructureIterator iterator = new EvenIterator(this);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    /**
     * メイン
     * @param s コマンドラインパラメータ
     */
    public static void main(String s[]) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}

