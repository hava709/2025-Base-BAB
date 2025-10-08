// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.pathplanner.lib.config.PIDConstants;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

public class SparkMaximus extends SubsystemBase {
    /**
     * Creates a new ExampleSubsystem.
     */
    private SparkMax motor;
    public SparkClosedLoopController neoPID;
    private SparkMaxConfig config;
    public RelativeEncoder encoder;
    public SparkMaximus() {

        motor = new SparkMax(RobotMap.SPARK_MAX_ID, SparkLowLevel.MotorType.kBrushless);
        config = new SparkMaxConfig();
        config.idleMode(SparkBaseConfig.IdleMode.kBrake);
        config.inverted(true);

        config.closedLoop.pid(0.0004, 0.000280, 0.0);



    }

    public void setVoltage(double voltage) {
        motor.setVoltage(voltage); //Our electrical systems run on 12v, so this value can be from -12 to 12
    }

    public double getRPM() {
        return motor.getEncoder().getVelocity();
    }

    public void setRPM(double point) {
        neoPID.setReference(Constants.NEO_RPM, SparkBase.ControlType.kVelocity);
    }
}
