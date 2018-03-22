package org.usfirst.frc771.TestingMyCommand.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc771.TestingMyCommand.Robot;

public class PlatformCommand extends Command {
	
	public PlatformCommand() {
		requires (Robot.platform);
	}
	
	protected void initialize(){
//		Robot.platform.getServo();
//		Robot.platform.servOpen();
//		Robot.platform.servoClose();
		System.out.println("****** INIT ******");
	}
	
	protected void execute(){
//		if (Robot.platform.getPlatformFlag() == 0){
//			Robot.platform.setServo(0, 1);
//			Robot.platform.setPlatformFlag(1);
//		}else if(Robot.platform.getPlatformFlag() == 1){
//			Robot.platform.setServo(0.5, 0.5);
//			Robot.platform.setPlatformFlag(0);
//        }
		
		Robot.platform.setServos(0.5);
		
	}
	
	protected boolean isFinished(){
		System.out.println("******** FINISHED ********");
		return true;
	}
	
	protected void end(){
		
	}
	
//	protected void isInterrupted(){
		
//	}
	
}
