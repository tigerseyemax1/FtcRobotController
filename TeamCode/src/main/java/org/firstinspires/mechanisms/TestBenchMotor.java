package org.firstinspires.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBenchMotor {

    private DcMotorEx spin_motor;
    public void init(HardwareMap hwMap) {
        spin_motor = hwMap.get(DcMotorEx.class, "spin_motor");
        spin_motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        spin_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        spin_motor.setTargetPosition(1);
        spin_motor.setVelocity(10000);
    }

    public void spin() {
       spin_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);


    }


}
