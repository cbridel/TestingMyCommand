package org.usfirst.frc771.TestingMyCommand.subsystems;

import java.util.Set;

import edu.wpi.first.networktables.*;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Vision extends Subsystem {
	public	static	final	double	xRes	=	320;
	NetworkTableInstance x;
	NetworkTable  theSauceTable;
	public	Vision()	{
		x = NetworkTableInstance.getDefault();
		System.out.println(x + " blah");
		theSauceTable = x.getTable("sauceTheContours");
		System.out.println(theSauceTable + " blah");
	}
	
	public	double	getRawTargetXpos()	{
		double	xPos;
		double[]	defaultValue	=	new	double[0];
		double[]	targetX	=	theSauceTable.getEntry("centerX").getDoubleArray(defaultValue);
		double[]	areas	=	theSauceTable.getEntry("area").getDoubleArray(defaultValue);
		
		if	(targetX.length== 0){
			xPos	=	xRes/2;
		 }else{ 
			 xPos = targetX[0];
			// return xPos;
		}
		System.out.print("centerx:");
		System.out.print(targetX.length);
		 for	(double	xval	:	targetX)	{	
		 System.out.print(xval	+	"	");
		 }
		 System.out.println();
		 
		 	int	largestIdx	=	0;
		 if	(targetX.length	>	1)	{
			 double	largest	=	0;
			 for	(int	i	=	0;	i	<	areas.length;	i++)	{
				 if	(areas[i]	>	largest){
					 largest	=	areas[i];
					 largestIdx	=	i;
				 }
			 }
			
		 }
		 
		 if (targetX.length == 0){
			 xPos = xRes/2;
		 }else{
			 xPos	=	targetX[largestIdx];
			 return xPos;
		 }
		 return 0;
	}
	
	public	double	getScaledTargetXpos()	{
		double raw = getRawTargetXpos();
		double	scaled	=	(raw-xRes/2)/(xRes/2);
		 return	scaled;
	} 
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
