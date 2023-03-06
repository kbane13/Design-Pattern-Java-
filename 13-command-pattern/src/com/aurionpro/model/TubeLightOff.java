package com.aurionpro.model;

public class TubeLightOff implements ICommand {
TubeLight tubelightof;
	
	public TubeLightOff(TubeLight tubelightof) {
	this.tubelightof=tubelightof;
	}
	@Override
	public void execute() {
tubelightof.switchOf();
	}

}
