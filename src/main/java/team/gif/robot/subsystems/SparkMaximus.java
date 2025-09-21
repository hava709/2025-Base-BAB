// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class SparkMaximus extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    private SparkMax motor;
    public SparkMaximus() {

        motor = new SparkMax(RobotMap.SPARK_MAX_ID, SparkLowLevel.MotorType.kBrushless);

        SparkMaxConfig config = new SparkMaxConfig();
        config.idleMode(SparkBaseConfig.IdleMode.kBrake);
        config.inverted(true);

        motor.configure(config, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);


    }
    public void setNeoPercentOutput(double percentOutput) {
        motor.set(percentOutput); //This can be a number from -1 (full reverse) to 1 (full forward)
    }

    public void setVoltage(double voltage) {
        motor.setVoltage(voltage); //Our electrical systems run on 12v, so this value can be from -12 to 12
    }
}
