package org.usfirst.frc771.TestingMyCommand.subsystems;

import java.util.Set;

import edu.wpi.first.networktables.*;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Vision extends Subsystem {
	public	static	final	double	xRes	=	320;
	public	static	final	double	yRes	=	240;
	NetworkTableInstance x;
	NetworkTable  table;
	NetworkTable GRIP;
	
	public	Vision()	{
		
		x = NetworkTableInstance.getDefault();
		System.out.println(x + " blah");
		//String subtables = x.getSubTables();
		GRIP = x.getTable("GRIP");
		System.out.println(x);
		System.out.println(GRIP + " blah");
		table = GRIP.getSubTable("contourReport");
		System.out.println(table+ "blah2");
		
		System.out.println(GRIP.getSubTables());	
		System.out.println(table.getSubTables());
		//Set<String> keys = theSauceTable.getKeys();
		//System.out.println(keys);
	}

	public	double	getRawTargetXpos()	{
		double	xPos;
		double[]	defaultValue	=	new	double[0];
			while(true){
		double[]	targetX	=	table.getEntry("centerX").getDoubleArray(defaultValue);
		double[]	areas	=	table.getEntry("area").getDoubleArray(defaultValue);
		//System.out.println(targetX.length + " blahblah3");
		//System.out.println(targetX[0] + " blahblah3");
		Timer.delay(0.25);
			if (targetX.length != areas.length){
				System.out.println("NetworkTable	udpated	in	the	middle	of	getRawTargetXpos;	returning	first	valid	entry");
			}
			if (targetX.length == 0){
				xPos = xRes/2;
			}else{
				xPos = targetX[0];
				return xPos;
			}
			int largestIdx = 0;
			if	(targetX.length	>	1)	{
				double	largest	=	0;
				for	(int	c	=	0;	c	<	areas.length;	c++)	{
					if	(areas[c]	>	largest){
						largest	=	areas[c];
						largestIdx	=	c;
						}
					}
				}
			if (targetX.length == 0){
				xPos = xRes/2;
				return xPos;
			}else{
				xPos = targetX[largestIdx];
				return xPos;
			}	
		}
	}
	
	public	double	getScaledTargetXpos()	{
		double raw = getRawTargetXpos();
		double	scaled	=	(raw-xRes/2)/(xRes/2);
		//System.out.println("HEY CHECK IT OUT " + scaled);
		 return	scaled;
	} 
	
	public double getRawTargetYpos(){
		double yPos;
		double [] defaultValue   =  new double[0];
			while (true){
		double[]	targetY = table.getEntry("centerY").getDoubleArray(defaultValue);
		double[]	areas = table.getEntry("area").getDoubleArray(defaultValue);
		Timer.delay(0.25);
		if (targetY.length != areas.length){
			System.out.println ("Network Table updated in the middle of getRawTargetYpos; returning first valid entry");
		}
		if (targetY.length == 0){
			yPos = yRes/2;
		}else{
			yPos = targetY[0];
			return yPos;
		} int largestIdx = 0;
		if (targetY.length >1 ){
			double largest = 0;
			for (int c = 0; c < areas.length; c++){
				if (areas[c] > largest){
					largest = areas[c];
					largestIdx = c;
				}
			}
		}
		if (targetY.length == 0){
			yPos = yRes/2;
			return yPos;
		}else{
			yPos = targetY[largestIdx];
			return yPos;
		}
	}
}
	
	public double getDistance(){
		double y = getRawTargetYpos();
		return 0.265*y + 6.435;
	} 
	
	public double above20(){
		double distance = getDistance();
		System.out.println(distance);
		if(distance >= 20){
			//System.out.println("not there yet!!!");
		}else{
			//System.out.println("we've made it!");
		}
		return distance;
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}

