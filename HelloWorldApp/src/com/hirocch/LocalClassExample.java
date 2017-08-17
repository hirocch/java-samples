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
 * ローカルクラスサンプル。
 *
 * @author hirocch
 */
public class LocalClassExample {
    /**
     * 正規表現パターン（0～9以外）
     */
    static String regularExpression = "[^0-9]";

    /**
     * 電話番号をチェックする
     *
     * @param phoneNumber1 電話番号１
     * @param phoneNumber2 電話番号２
     */
    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

        int numberLength = 10;

        /**
         * 電話番号クラス。
         */
        class PhoneNumber {

            /**
             * 変換後の電話番号（数字以外を除いたもの）
             */
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                // numberLength = 7;    //※コンパイルエラーになる
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }

            /**
             * 変換後の電話番号を取得する
             *
             * @return 変換後の電話番号
             */
            String getNumber() {
                return formattedPhoneNumber;
            }

            /**
             * 電話番号を表示する
             */
            void printOriginalNumbers() {
                System.out.println(
                        "Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null) {
            System.out.println("First number is invalid");
        } else {
            System.out.println("First number is " + myNumber1.getNumber());
        }
        if (myNumber2.getNumber() == null) {
            System.out.println("Second number is invalid");
        } else {
            System.out.println("Second number is " + myNumber2.getNumber());
        }
    }

    /**
     * メイン
     * @param args コマンドラインパラメータ
     */
    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
