package com.sourceit.java.basic.pshen.lesson6;

import com.sourceit.java.basic.pshen.lesson6.building.MyHouse;
import com.sourceit.java.basic.pshen.lesson6.transport.*;

public class Main {
	public static void main (String[] args){
		MyHouse mh = new MyHouse();
		Comfort vol = new Volvo();
		Car vaz = new VAZ();
		mh.controlTemperature();
		vol.controlTemperature();
	}

}
