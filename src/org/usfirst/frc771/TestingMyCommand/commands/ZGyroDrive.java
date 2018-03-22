package org.usfirst.frc771.TestingMyCommand.commands;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc771.TestingMyCommand.Robot;

public class ZGyroDrive extends Command{
	
	boolean finished;
	
	public ZGyroDrive(){
		
		requires(Robot.drive);
		
	}
	
	protected void initialize(){
		
		Robot.drive.resetGyro();
		
	}
	
	protected void execute(){
		double Angle_error = Robot.drive.findGyroAngle();
		double Angle_rate = Robot.drive.findGyroRate();
		Robot.drive.gyroDriveWithSpeed(-0.2, -Angle_error, Angle_rate);
	}
	
	protected boolean isFinished(){
		return finished = false;
	}
	
	protected void end(){
		
	}
	
	protected void interrupted(){
		
	}

}
