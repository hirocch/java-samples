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
 * 書籍クラス。
 *
 * @author hirocch
 */
public class Book {
    /**
     * ISBNコード
     */
    private String isbn;

    /**
     * コンストラクタ
     *
     * @param isbn ISBNコード
     */
    public Book(String isbn) {
        this.isbn = isbn;
    }

    /**
     * ISBNコードを取得する
     *
     * @return ISBNコード
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * ISBNコードが等しいかチェックする
     *
     * @param obj 書籍
     * @return 等しい場合は true、それ以外の場合は false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            return isbn.equals(((Book) obj).getIsbn());
        } else {
            return false;
        }
        //return super.equals(obj);     ※これだとbook1とbook3は異なる
    }

    /**
     * ISBNを表示する
     *
     * @return 書籍
     */
    @Override
    public String toString() {
        return "ISBN:" + isbn;
    }

    /**
     * クラス名を表示する
     */
    void printClassName() {
        System.out.println("The object's" + " class is " + getClass().getSimpleName());
    }

    /**
     * メイン
     *
     * @param args コマンドラインパラメータ
     */
    public static void main(String[] args) {
        Book book1 = new Book("489471714X");    // Javaチュートリアル
        Book book2 = new Book("0321334205");    // The Java Tutorial
        Book book3 = new Book("489471714X");    // Javaチュートリアル

        System.out.println("book1 " + book1.toString());
        System.out.println("book2 " + book2.toString());
        System.out.println("book3 " + book3.toString());

        if (book1.equals(book2)) {
            System.out.println("book1とbook2は同じ");
        } else {
            System.out.println("book1とbook2は異なる");
        }
        if (book1.equals(book3)) {
            System.out.println("book1とbook3は同じ");
        } else {
            System.out.println("book1とbook3は異なる");
        }

        book1.printClassName();
    }
}
