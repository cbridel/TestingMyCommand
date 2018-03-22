package org.usfirst.frc771.TestingMyCommand.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc771.TestingMyCommand.Robot;

public class ElevatorRetract extends Command {

	public ElevatorRetract(){
		requires(Robot.elevator);
	}

	protected void initialize(){
		if (!Robot.elevator.getLimit()){
//			THIS VALUE MUST BE CHANGED %
			Robot.elevator.setElevator(0.5);
		}else{

			Robot.elevator.elevatorRetract();
		}
	}
	
	protected void execute(){
	}
		
	
	protected boolean isFinished(){
		return true;
	}
	protected void isInterrupted(){
		
	}
}
