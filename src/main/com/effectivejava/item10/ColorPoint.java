package main.com.effectivejava.item10;

import java.awt.*;
import java.util.Objects;

public class ColorPoint {
    private final Color color;
    private final Point point;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    /**
     * 이 ColorPoint의 Point 뷰를 반환한다.
     */

    public Point asPoint() {
        return point;
    }

    @Override public boolean equals(Object o) {
        if(!(o instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }


}
