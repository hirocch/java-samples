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

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesException;

/**
 * タイムインターフェイス。。
 *
 * @author hirocch
 */
public interface TimeClient {
    /**
     * 時間を設定する
     *
     * @param hour   時
     * @param minute 分
     * @param second 秒
     */
    void setTime(int hour, int minute, int second);

    /**
     * 日付を設定する
     *
     * @param year  年
     * @param month 月
     * @param day   日
     */
    void setDate(int year, int month, int day);

    /**
     * 日時を設定する
     *
     * @param year   年
     * @param month  月
     * @param day    日
     * @param hour   時
     * @param minute 分
     * @param second 秒
     */
    void setDateAndTime(int year, int month, int day, int hour, int minute, int second);

    /**
     * タイムゾーンのない日時を取得する
     *
     * @return タイムゾーンのない日時
     */
    LocalDateTime getLocalDateTime();

    /**
     * タイムゾーン付きの日時を取得する（Default Methods）
     *
     * @param zoneString タイムゾーン文字列
     * @return タイムゾーン付きの日時
     */
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    }

    /**
     * タイムゾーンIDを取得
     *
     * @param zoneString タイムゾーン文字列
     * @return タイムゾーンID
     */
    static ZoneId getZoneId(String zoneString) {
        try {
            return ZoneId.of(zoneString);

        } catch (ZoneRulesException e) {
            // 変換されたゾーン地域IDが見つからない場合
            // システム・デフォルト・タイムゾーンを返す。
            System.err.println(
                    "Invalid time zone ZoneRulesException: " + zoneString +
                    "; using default time zone instead.");
            return ZoneId.systemDefault();

        } catch (DateTimeException e) {
            // ゾーンIDのフォーマットが無効な場合
            // システム・デフォルト・タイムゾーンを返す。
            System.err.println(
                    "Invalid time zone DateTimeException: " + zoneString +
                    "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }
}
