package org.usfirst.frc771.TestingMyCommand.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc771.TestingMyCommand.Robot;

public class ElevatorExtend extends Command {
	
	public ElevatorExtend(){
		requires(Robot.elevator);
	}

	protected void initialize(){
		if (!Robot.elevator.getLimit()){
//			THIS VALUE MUST BE CHANGED %
			Robot.elevator.setElevator(0.5);
		}else{
			if(Robot.elevator.getBoo()){
				Robot.elevator.elevatorExtend();
			}else{
				Robot.elevator.elevatorRetract();
			}
		}
	}
	
	protected void execute(){
	}
		
	
	protected boolean isFinished(){
		Robot.elevator.setBoo(Robot.elevator.getBoo());
		return true;
	}
	protected void isInterrupted(){
		
	}

}
