package com.rizvi.passby;

import java.util.StringJoiner;

public class TestPassByReference {


    public static class Point{
        int x;
        int y;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Point.class.getSimpleName() + "[", "]")
                    .add("x=" + x)
                    .add("y=" + y)
                    .toString();
        }
    }

    public static void main(String[] args) {
      Point first = new Point(4,8);
        System.out.println("first: "+first);
        move(first);
        System.out.println("first: "+first);
    }
    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }

}
