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
 * 馬クラス。
 *
 * @author hirocch
 */
public class Horse {
    /**
     * 自身
     *
     * @return 自身
     */
    public String identifyMyself() {
        return "I am a horse.";
    }

    // 飛べる
    public interface Flyer {
        default public String identifyMyself() {
            return "I am able to fly.";
        }
    }

    // 神話
    public interface Mythical {
        default public String identifyMyself() {
            return "I am a mythical creature.";
        }
    }

    // ペガサス
    public static class Pegasus extends Horse implements Flyer, Mythical {
        public static void main(String... args) {
            Pegasus myApp = new Pegasus();
            System.out.println(myApp.identifyMyself());
        }
    }
}
