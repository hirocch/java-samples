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

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

/**
 * 人クラス。
 *
 * @author hirocch
 */
public class Person {
    /**
     * 性別
     */
    public enum Sex {
        MALE,   // 男性
        FEMALE  // 女性
    }

    /**
     * 名前
     */
    String name;

    /**
     * 誕生日
     */
    LocalDate birthday;

    /**
     * 性別
     */
    Sex gender;

    /**
     * メールアドレス
     */
    String emailAddress;

    /**
     * コンストラクタ
     *
     * @param nameArg     名前
     * @param birthdayArg 誕生日
     * @param genderArg   性別
     * @param emailArg メールアドレス
     */
    Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
    }

    /**
     * 年齢を取得する
     *
     * @return 年齢
     */
    public int getAge() {
        return birthday
                .until(IsoChronology.INSTANCE.dateNow())
                .getYears();
    }

    /**
     * 名前と年齢を表示する
     */
    public void printPerson() {
        System.out.println(name + ", " + getAge());
    }

    /**
     * 性別を取得する
     *
     * @return 性別
     */
    public Sex getGender() {
        return gender;
    }

    /**
     * 名前を取得する
     *
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * メールアドレスを取得する
     *
     * @return メールアドレス
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 誕生日を取得する
     *
     * @return 誕生日
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * 年齢を比較する
     *
     * @param a 比較対象a
     * @param b 比較対象b
     * @return aが年下の場合は負、年上の場合は正
     */
    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    /**
     * 名簿を作成する
     *
     * @return 名簿
     */
    public static List<Person> createRoster() {

        List<Person> roster = new ArrayList<>();
        roster.add(
                new Person(
                        "Fred",
                        IsoChronology.INSTANCE.date(1980, 6, 20),
                        Person.Sex.MALE,
                        "fred@example.com"));
        roster.add(
                new Person(
                        "Jane",
                        IsoChronology.INSTANCE.date(1990, 7, 15),
                        Person.Sex.FEMALE, "jane@example.com"));
        roster.add(
                new Person(
                        "George",
                        IsoChronology.INSTANCE.date(1991, 8, 13),
                        Person.Sex.MALE, "george@example.com"));
        roster.add(
                new Person(
                        "Bob",
                        IsoChronology.INSTANCE.date(2000, 9, 12),
                        Person.Sex.MALE, "bob@example.com"));

        return roster;
    }
}
