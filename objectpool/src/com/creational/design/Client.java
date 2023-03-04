package com.creational.design;

import java.awt.geom.Point2D;

public class Client {
    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("image.bmp"), 5);

    public static void main(String[] args) {
        Bitmap bitmap1 = bitmapPool.get();
        bitmap1.setLocation(new Point2D.Double(10, 10));
        bitmap1.draw();

        Bitmap bitmap2 = bitmapPool.get();
        bitmap2.setLocation(new Point2D.Double(20, 20));
        bitmap2.draw();

        bitmapPool.release(bitmap1);
        bitmapPool.release(bitmap2);

        Bitmap bitmap3 = bitmapPool.get();
        bitmap3.setLocation(new Point2D.Double(30, 30));
        bitmap3.draw();

        Bitmap bitmap4 = bitmapPool.get();
        bitmap4.setLocation(new Point2D.Double(40, 40));
        bitmap4.draw();

        bitmapPool.release(bitmap3);
        bitmapPool.release(bitmap4);
    }
}

