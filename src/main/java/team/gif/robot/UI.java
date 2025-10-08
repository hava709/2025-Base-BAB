package team.gif.robot;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import team.gif.robot.subsystems.LimitSwitch;

public class UI {


    /**
     *  Widgets (e.g. gyro, text, True/False flags),
     *  buttons (e.g. SmartDashboard.putData("Reset", new ResetHeading()); ),
     *  and Chooser options (e.g. auto mode, auto delay)
     *
     *  Placed in SmartDashboard network table
     *  After dashboard loads for the first time, manually move items from network table onto respective dashboard tab
     *  and save file as "YYYY elastic-layout.json"
     */
    public UI() {
        ShuffleboardTab shuffleboardTab = Shuffleboard.getTab("BAB2025");
    shuffleboardTab.addBoolean("State", Robot.limit::limitSwitchState).withWidget(BuiltInWidgets.kBooleanBox);
    shuffleboardTab.addDouble("Heading", Robot.pigeon::get360Heading).withWidget(BuiltInWidgets.kGyro);
    shuffleboardTab.addDouble("NeoRPM", Robot.spark::getRPM).withWidget(BuiltInWidgets.kEncoder);
    }

    /**
     * Widgets which are updated periodically should be placed here
     *
     * Convenient way to format a number is to use putString w/ format:
     *     SmartDashboard.putString("Elevator", String.format("%11.2f", Elevator.getPosition());
     */
    public void update() {
        //Example
        //SmartDashboard.putNumber("Climber Position", Robot.elevator.getPosition())
    }
}
