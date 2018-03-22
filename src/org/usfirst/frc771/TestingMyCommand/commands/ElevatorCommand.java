package org.usfirst.frc771.TestingMyCommand.commands;

import org.usfirst.frc771.TestingMyCommand.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorCommand extends Command{
	
	public ElevatorCommand (){
		requires (Robot.elevator);
	}
	
	@Override
	protected void execute() {
		if (Robot.elevator.getElevatorFlag() == 0){
			if (Robot.elevator.getDistance()){
				Robot.elevator.setElevator(0);
			}else{
				Robot.elevator.elevatorCommand();
			}
		}
	    if (!Robot.elevator.getLimit()){
	    	Robot.elevator.elevatorCommand();
	    }else{
	    	Robot.elevator.setElevator(0);
	    }
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
