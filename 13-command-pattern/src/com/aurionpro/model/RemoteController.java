package com.aurionpro.model;

public class RemoteController {
	public ICommand command;

	public RemoteController(ICommand command) {
		super();
		this.command = command;
	}
	public void setCommand(ICommand command) {
		this.command=command;
	}
	public void pressButton() {
		command.execute();
	}
	
	

}
