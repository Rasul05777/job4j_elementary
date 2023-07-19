package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when501to211then3dot16() {
        double expected = 3.16;
        Point a = new Point(5, 0, 1);
        Point i = new Point(2, 1, 1);
        double dist = a.distance3d(i);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when141to515then6dot40() {
        double expected = 6.40;
        Point a = new Point(1, 4, 1);
        Point i = new Point(5, 1, 5);
        double dist = a.distance3d(i);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when151to207then7dot87() {
        double expected = 7.87;
        Point a = new Point(1, 5, 1);
        Point i = new Point(2, 0, 7);
        double dist = a.distance3d(i);
        Assert.assertEquals(expected, dist, 0.01);
    }
}