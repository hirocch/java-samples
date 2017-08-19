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

import java.util.NoSuchElementException;

/**
 * 偶数イテレータ。
 *
 * @author hirocch
 */
class EvenIterator implements DataStructureIterator {
    /**
     * 配列インデックス
     */
    private int nextIndex = 0;

    /**
     * データ構造クラス
     */
    private DataStructure data;

    /**
     * コンストラクタ
     * @param data データ構造クラス
     */
    EvenIterator(DataStructure data) {
        this.data = data;
    }

    /**
     * 反復処理でさらに要素がある場合にtrueを返します。
     * つまり、next()が例外をスローするのではなく要素を返す場合は、trueを返します。
     *
     * @return 反復処理でさらに要素がある場合はtrue
     */
    @Override
    public boolean hasNext() {
        return (nextIndex <= data.arrayOfInts.length - 1);
    }

    /**
     * 反復処理で次の偶数の要素を返します。
     *
     * @return 反復処理での次の偶数の要素
     * @throws NoSuchElementException 反復処理で要素がない場合
     */
    @Override
    public Integer next() throws NoSuchElementException {
        Integer retValue = data.arrayOfInts[nextIndex];
        nextIndex += 2;
        return retValue;
    }
}
