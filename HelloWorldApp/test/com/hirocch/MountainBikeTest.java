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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainBikeTest {
    @Test
    void MountainBike() {
        MountainBike b = new MountainBike();
        assertEquals(b.cadence, 10);
        assertEquals(b.speed, 0);
        assertEquals(b.gear, 1);
        assertEquals(b.seatHeight, 0);
    }

    @Test
    void MountainBike2() {
        MountainBike b = new MountainBike(10,20,30);
        assertEquals(b.cadence, 10);
        assertEquals(b.speed, 20);
        assertEquals(b.gear, 30);
        assertEquals(b.seatHeight, 0);
    }

    @Test
    void MountainBike3() {
        MountainBike b = new MountainBike(10,20,30,40);
        assertEquals(b.cadence, 10);
        assertEquals(b.speed, 20);
        assertEquals(b.gear, 30);
        assertEquals(b.seatHeight, 40);
    }

    @Test
    void setHeight() {
        MountainBike b = new MountainBike(10,20,30,40);
        b.setHeight(100);
        assertEquals(b.seatHeight, 100);
    }
}