package org.usfirst.frc771.TestingMyCommand.subsystems;

import org.usfirst.frc771.TestingMyCommand.Robot;
import org.usfirst.frc771.TestingMyCommand.RobotMap;
import org.usfirst.frc771.TestingMyCommand.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Servo;

public class Platform extends Subsystem {

	//Variable initialization
//	private final PWM PWM1 = RobotMap.PWM1;
	//	private final Servo servo1 = RobotMap.servo1;
//	private final Servo servo2 = RobotMap.servo2;
//	private final Servo servo3 = RobotMap.servo3;
//	private final Servo servo4 = RobotMap.servo4;
	
	int flag = 0;
	boolean boo = true;
	
	//Default command
	public void initDefaultCommand(){
//		public void PWM1(){
			
//		}
	}
	
	//Functions
	public double getServo(){
		return RobotMap.servo1.get();
	}
	
	public void setServos(double value){
		RobotMap.servo1.set(value);
		RobotMap.servo2.set(value);
		RobotMap.servo3.set(value);
		RobotMap.servo4.set(value);
	}
	
	public void setServoAngle(double angle){
		RobotMap.servo1.setAngle(angle);
	}
	
	public void setServo(double leftValue, double rightValue){
		System.out.println("######## servOpen #########");
		//System.out.println("Servo1 Position = " + RobotMap.servo1.get());
		//System.out.println("Servo1 Position = " + servo2.get());
		
		//RobotMap.servo1.set(-1);
		//RobotMap.servo2.set(127);
		
//		RobotMap.servo1.set(leftValue);
//		RobotMap.servo2.set(rightValue);
		
		if(RobotMap.servo1.get() == 0.0){
			RobotMap.servo1.setAngle(90);
		}else{
			RobotMap.servo1.setAngle(0); 
		}
		if(RobotMap.servo2.get()== 0.0){
			RobotMap.servo2.setAngle(90);
		}else{
			RobotMap.servo2.setAngle(0);
		}
//		if(RobotMap.servo3.get()== 0.0){
//			RobotMap.servo3.set(1);
//		}else{
//			RobotMap.servo3.set(0.0);
//		}
//		servo3.set(1);
//		servo4.set(0.5);
	}
	
	public void setPlatformFlag(int value){
		flag = value;
	}
	
	public int getPlatformFlag(){
		return flag;
	}
	
	public void setBoo(boolean tf){
		boo = tf;
	}
	
	public boolean getBoo(){
		return boo;
	}
	
//	public void servoClose(){
//		servo1.set(0);
//		servo2.set(0);
//		servo3.set(0);
//		servo4.set(0);
	}
	

