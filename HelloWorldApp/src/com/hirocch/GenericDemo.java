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
 * ジェネリックデモクラス。
 *
 * @param <T> タイプパラメータ
 * @author hirocch
 */
public class GenericDemo<T> {
    /**
     * 値
     */
    private T value;

    /**
     * 値をセットする
     *
     * @param value 値
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * 値を取得する
     *
     * @return 値
     */
    public T getValue() {
        return value;
    }

    /**
     * 検査する
     *
     * @param value 値
     * @param <U> タイプパラメータ(数値型のみ)
     */
    public <U extends Number> void inspect(U value){
        System.out.println("U: " + value.getClass().getName());
    }

    /**
     * メイン
     *
     * @param args コマンドラインパラメータ
     */
    public static void main(String[] args) {
        // Integer
        GenericDemo<Integer> i = new GenericDemo<>();
        i.setValue(10);
        System.out.println("GenericDemo<Integer> #" + i.getValue());
        //i.setValue(10.5); //コンパイルエラーになる
        i.inspect(10);

        // Number
        GenericDemo<Number> n = new GenericDemo<>();
        n.setValue(10);
        System.out.println("GenericDemo<Number> #" + n.getValue());
        n.setValue(10.5);
        System.out.println("GenericDemo<Number> #" + n.getValue());
        n.inspect(10);

        // String
        GenericDemo<String> s = new GenericDemo<>();
        s.setValue("abc");
        System.out.println("GenericDemo<String> #" + s.getValue());
        //s.inspect("abc");   //コンパイルエラーになる
    }
}
