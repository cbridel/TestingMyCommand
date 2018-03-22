package org.usfirst.frc771.TestingMyCommand.subsystems;

import org.usfirst.frc771.TestingMyCommand.commands.ElevatorCommand;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc771.TestingMyCommand.Robot;
import org.usfirst.frc771.TestingMyCommand.RobotMap;

public class Intake extends Subsystem {
	
//	private static DoubleSolenoid intakeSolenoid1 = RobotMap.intakeSolenoid1;
//	private static DoubleSolenoid intakeSolenoid2 = RobotMap.intakeSolenoid2;
//	private static WPI_TalonSRX intakeMotor1 = RobotMap.intakeMotor1;
//	private static WPI_TalonSRX intakeMotor2 = RobotMap.intakeMotor2;
	private static WPI_TalonSRX pawsMotor = RobotMap.intakePositionMotor;
	
	protected void initDefaultCommand() {
	}
//	These values need changing%
	public void PacmanEats (){
//		intakeMotor1.set(0.5);
//		intakeMotor2.set(-0.5);
	}
//	These values need changing%
	public void PacmanPukesSlow (){
//		intakeMotor1.set(-0.5);
//		intakeMotor2.set(0.5);
	}

	public void PacmanPukesFast(){
//		intakeMotor1.set(-1);
//		intakeMotor2.set(1);
	}
	
	public void killIntake(){
//		intakeMotor1.set(0);
//		intakeMotor2.set(0);
	}
	
	public void intakePos(){
		Joystick intakeJoystick = Robot.oi.joystickOperator;
		double y = (double)intakeJoystick.getRawAxis(5);
		pawsMotor.set(deadBand(y,0.08));
	}

	public double deadBand(double value, double limit){
		if (value > limit){
			return 1;
		}else if (value < -limit){
			return -1;
		}else{
			return 0;
		}
	}
	
}