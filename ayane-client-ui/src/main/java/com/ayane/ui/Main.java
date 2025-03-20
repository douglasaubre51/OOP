package com.ayane.ui;

import org.bytedeco.javacv.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		try{

			OpenCVFrameGrabber grabber=new OpenCVFrameGrabber(0);
			grabber.setFrameRate(60);


			grabber.start();

			System.out.println("video stream live!");

			CanvasFrame frame=new CanvasFrame("web cam stream");

			while(frame.isVisible()){
				Frame capturedImage=grabber.grab();
				frame.showImage(capturedImage);
				System.out.println("displaying!");
			}
		}
		catch(Exception e){ e.printStackTrace(); }

	}
}
