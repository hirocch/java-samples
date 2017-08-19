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

import java.util.List;

/**
 * ラムダデモクラス。
 *
 * @author hirocch
 */
public class LambdaDemo {

    /**
     * 指定した年齢以上の人を表示する
     *
     * @param roster 名簿
     * @param age    年齢
     */
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        roster.stream()
                .filter(p -> p.getAge() >= age)
                .forEach(Person::printPerson);
    }

    /**
     * 指定した年齢の範囲(low～high)の人を表示する
     *
     * @param roster 名簿
     * @param low 年齢(low)
     * @param high 年齢(high)
     */
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        roster.stream()
                .filter(p -> low <= p.getAge() && p.getAge() < high)
                .forEach(Person::printPerson);
    }

    /**
     * メイン
     *
     * @param args コマンドラインパラメータ
     */
    public static void main(String[] args) {
        // 名簿を作成
        List<Person> roser = Person.createRoster();
        System.out.println("名簿(All) ---------------");
        roser.forEach(Person::printPerson);

        // 30才以上の人を表示
        System.out.println("27才以上の人--------------");
        printPersonsOlderThan(roser, 27);

        // 30才以上の人を表示
        System.out.println("20代の人------------------");
        printPersonsWithinAgeRange(roser, 20, 30);
    }
}
