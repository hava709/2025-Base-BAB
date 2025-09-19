// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class TalonOne extends SubsystemBase {
    private TalonSRX talonMotor;

    public TalonOne() {
        talonMotor = new TalonSRX(RobotMap.TALON_SRX_ID);


    }

}
