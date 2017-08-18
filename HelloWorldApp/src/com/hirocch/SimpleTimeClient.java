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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * タイムクラス。
 *
 * @author hirocch
 */
public class SimpleTimeClient implements TimeClient {
    /**
     * 日時
     */
    private LocalDateTime dateAndTime;

    /**
     * コンストラクタ
     */
    public SimpleTimeClient() {
        // 現在日時をセット
        dateAndTime = LocalDateTime.now();
    }

    /**
     * 時間を設定する
     *
     * @param hour   時
     * @param minute 分
     * @param second 秒
     */
    @Override
    public void setTime(int hour, int minute, int second) {
        // 時間のみ変更
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    /**
     * 日付を設定する
     *
     * @param year  年
     * @param month 月
     * @param day   日
     */
    @Override
    public void setDate(int year, int month, int day) {
        // 日付のみ変更
        LocalDate dateToSet = LocalDate.of(year, month, day);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    /**
     * 日時を設定する
     *
     * @param year  年
     * @param month 月
     * @param day   日
     * @param hour   時
     * @param minute 分
     * @param second 秒
     */
    @Override
    public void setDateAndTime(int year, int month, int day, int hour, int minute, int second) {
        // 日付と時間を変更
        LocalDate dateToSet = LocalDate.of(year, month, day);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    /**
     * タイムゾーンのない日時を取得する
     *
     * @return タイムゾーンのない日時
     */
    @Override
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    /**
     * 日時を文字列に変換する
     *
     * @return 日時文字列
     */
    @Override
    public String toString() {
        return dateAndTime.toString();
    }

    /**
     * メイン
     *
     * @param args コマンドラインパラメータ
     */
    public static void main(String... args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());

        // タイムゾーン
        System.out.println(myTimeClient.getZonedDateTime("Asia/Tokyo").toString());
        System.out.println(myTimeClient.getZonedDateTime("America/Los_Angeles").toString());

        // 0000/01/01
        myTimeClient.setDate(0,1,1);
        System.out.println(myTimeClient.toString());

        // 23:59:59
        myTimeClient.setTime(23,59,59);
        System.out.println(myTimeClient.toString());

        // 9999/12/31 00:00:00
        myTimeClient.setDateAndTime(9999,12,31, 0,0,0);
        System.out.println(myTimeClient.toString());
    }
}
