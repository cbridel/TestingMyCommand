package org.usfirst.frc771.TestingMyCommand.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc771.TestingMyCommand.Robot;


public class ZGyroKill extends Command{
	
	public ZGyroKill(){
		
		requires(Robot.drive);
		
	}
	
	protected void initialize(){
		Robot.drive.killGyro();
		setTimeout(1);
	}
	
	protected void execute(){
		
	}
	
	protected boolean isFinished(){
		return isTimedOut();
	}
	
	protected void end(){
		
	}
	
	protected void interrupted(){
		
	}

}
