package com.ayane.ui;

import org.bytedeco.opencv.opencv_videoio.VideoCapture;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        VideoCapture camera = new VideoCapture(0);

        if (camera.isOpened())
            System.out.println("JavaCv is working!");

        else
            System.out.println("failure to access webcam!");

        camera.release();
    }
}