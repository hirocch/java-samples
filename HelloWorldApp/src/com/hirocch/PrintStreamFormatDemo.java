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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

/**
 * PrintStream.formatデモクラス。
 *
 * @author hirocch
 */
public class PrintStreamFormatDemo {
    /**
     * メイン
     *
     * @param args コマンドラインパラメータ
     */
    public static void main(String[] args) {
        long n = 461012;
        System.out.format("[%d]%n", n);       // --> "461012"
        System.out.format("[%08d]%n", n);     // --> "00461012"
        System.out.format("[%+8d]%n", n);     // --> " +461012"
        System.out.format("[%,8d]%n", n);     // --> " 461,012"
        System.out.format("[%+,8d]%n%n", n);  // --> "+461,012"

        double pi = Math.PI;
        System.out.format("[%f]%n", pi);      // --> "3.141593"
        System.out.format("[%.3f]%n", pi);    // --> "3.142"
        System.out.format("[%10.3f]%n", pi);  // --> "     3.142"
        System.out.format("[%-10.3f]%n", pi); // --> "3.142"
        System.out.format(Locale.FRANCE, "[%-10.4f]%n%n", pi); // --> "3,1416"

//        Calendar c = Calendar.getInstance();
        LocalDateTime c = LocalDateTime.of(2017, 8, 19, 2, 34);
        System.out.format("[%tB %te, %tY]%n", c, c, c); // --> "8月 19, 2017"
        System.out.format("[%tl:%tM %tp]%n", c, c, c);  // --> "2:34 午前"
        System.out.format("[%tD]%n", c);                 // --> "08/19/17"

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("[" + c.format(f) + "]");
    }
}
