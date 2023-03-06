package com.aurionpro.model;

public class TubeLightOn implements ICommand {
TubeLight tubelight;
	
	public TubeLightOn(TubeLight tubelight) {
	super();
	this.tubelight = tubelight;
}

	@Override
	public void execute() {
		tubelight.switchOn();
		
	}

}
