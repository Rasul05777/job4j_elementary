package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point i = new Point(2, 0);
        double dist = a.distance(i);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when20to20then0() {
        double expected = 1;
        Point a = new Point(2, 2);
        Point i = new Point(1, 2);
        double dist = a.distance(i);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when10to20then1() {
        double expected = 1;
        int x1 = 1;
        Point a = new Point(0, 0);
        Point i = new Point(1, 0);
        double dist = a.distance(i);
        Assert.assertEquals(expected, dist, 0.01);
    }
}