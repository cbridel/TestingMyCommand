package org.usfirst.frc771.TestingMyCommand.commands;

import org.usfirst.frc771.TestingMyCommand.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class PlatformCG extends CommandGroup {

		public PlatformCG (){
			addSequential(new ElevatorRetract());
			addSequential(new PlatformCommand());
		}
}
