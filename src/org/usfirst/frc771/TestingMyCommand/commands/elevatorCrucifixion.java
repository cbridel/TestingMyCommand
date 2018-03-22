package org.usfirst.frc771.TestingMyCommand.commands;

import org.usfirst.frc771.TestingMyCommand.Robot;
import edu.wpi.first.wpilibj.command.Command;


public class elevatorCrucifixion extends Command{

	public elevatorCrucifixion(){
		requires(Robot.elevator);
	}
		
	protected void execute (){
		Robot.elevator.elevatorCrucifixion();
	}

	protected boolean isFinished(){
		return true;}

}
