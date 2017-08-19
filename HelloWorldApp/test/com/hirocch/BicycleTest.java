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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Bicycle() {
        Bicycle b = new Bicycle();
        assertEquals(b.cadence, 10);
        assertEquals(b.speed, 0);
        assertEquals(b.gear, 1);
    }

    @Test
    void Bicycle2() {
        Bicycle b = new Bicycle(10,20,30);
        assertEquals(b.cadence, 10);
        assertEquals(b.speed, 20);
        assertEquals(b.gear, 30);
    }

    @Test
    void getCadence() {
        Bicycle b = new Bicycle(10,20,30);
        assertEquals(b.getCadence(), 10);
    }

    @Test
    void setCadence() {
        Bicycle b = new Bicycle(10,20,30);
        b.setCadence(100);
        assertEquals(b.cadence, 100);
    }

    @Test
    void getGear() {
        Bicycle b = new Bicycle(10,20,30);
        assertEquals(b.getGear(), 30);
    }

    @Test
    void setGear() {
        Bicycle b = new Bicycle(10,20,30);
        b.setGear(200);
        assertEquals(b.gear, 200);
    }

    @Test
    void getSpeed() {
        Bicycle b = new Bicycle(10,20,30);
        assertEquals(b.getSpeed(), 20);
    }

    @Test
    void speedUp() {
        Bicycle b = new Bicycle(10,20,30);
        b.speedUp(100);
        assertEquals(b.speed, 120);
        b.speedUp(100);
        assertEquals(b.speed, 220);
    }

    @Test
    void applyBrakes() {
        Bicycle b = new Bicycle(10,20,30);
        b.applyBrakes(5);
        assertEquals(b.speed, 15);
        b.applyBrakes(10);
        assertEquals(b.speed, 5);
    }

    @Test
    void printStates() {
    }

}