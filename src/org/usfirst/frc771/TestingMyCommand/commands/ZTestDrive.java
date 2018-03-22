package org.usfirst.frc771.TestingMyCommand.commands;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc771.TestingMyCommand.Robot;

public class ZTestDrive extends Command{
public ZTestDrive(){
		
		requires(Robot.drive);
		
	}
	
	protected void initialize(){
		
		setTimeout(5);
	}
	
	protected void execute(){
		Robot.drive.testDrive();
		
	}
	
	protected boolean isFinished(){
		return isTimedOut();
	}
	
	protected void end(){
		
	}
	
	protected void interrupted(){
		
	}
}
