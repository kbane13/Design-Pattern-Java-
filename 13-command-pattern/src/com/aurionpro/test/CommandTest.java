package com.aurionpro.test;

import com.aurionpro.model.RemoteController;
import com.aurionpro.model.TubeLight;
import com.aurionpro.model.TubeLightOff;
import com.aurionpro.model.TubeLightOn;

public class CommandTest {
	public static void main(String[] args) {
		TubeLight tubelight=new TubeLight();
		TubeLightOn on=new TubeLightOn(tubelight);
		RemoteController remotecontrol=new RemoteController(on);
	remotecontrol.pressButton();
	System.out.println("-----------------------------");
	
	TubeLightOff of=new TubeLightOff(tubelight);
remotecontrol.setCommand(of);
	remotecontrol.pressButton();
	}

}
