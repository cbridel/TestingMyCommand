package org.usfirst.frc771.TestingMyCommand.commands;

import org.usfirst.frc771.TestingMyCommand.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ZTestUltra extends Command {

	public ZTestUltra(){
		requires (Robot.drive);
	}
	
	protected void initialize(){
		Robot.drive.turnOnUltra();
		setTimeout(5);
	}
	
	protected void execute(){
		Robot.drive.getUltra();
	}
	
	protected boolean isFinished(){
		return isTimedOut();
	}
	
}
