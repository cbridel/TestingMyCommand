package org.usfirst.frc771.TestingMyCommand.commands;

 import org.usfirst.frc771.TestingMyCommand.Robot;
 import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ZTestAirbags extends Command {
	
	public ZTestAirbags(){
		
		requires(Robot.elevator);
	}
	
	protected void execute(){
		SmartDashboard.putBoolean("LimitSwitch1", Robot.elevator.getLimit());
	}
	
    protected boolean isFinished(){
    	return false;
    }
}

