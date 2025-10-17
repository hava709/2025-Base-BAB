package team.gif.robot.commands.autos;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Constants;
import team.gif.robot.Robot;
import team.gif.robot.commands.GetFPGATimeStamp;

import java.sql.Time;

public class ForwardAuto extends Command {

    double startingTime;

    public ForwardAuto() {
        super();
        addRequirements(Robot.drive);
        double time = Timer.getMatchTime();




    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        startingTime = Timer.getFPGATimestamp();
    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
}
