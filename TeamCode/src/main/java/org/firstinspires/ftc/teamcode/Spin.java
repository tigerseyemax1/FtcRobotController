package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

// can make this into a class in mechanisms that you can call to move the rotator along
@TeleOp
public class Spin extends LinearOpMode {
    DcMotorEx spin_motor;

    @Override
    public void runOpMode() {
        spin_motor = hardwareMap.get(DcMotorEx.class, "spin_motor");

        spin_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        waitForStart();

        spin_motor.setTargetPosition(187);

        spin_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        spin_motor.setVelocity(1000);

        while (opModeIsActive()) {
            telemetry.addData("velocity", spin_motor.getVelocity());
            telemetry.addData("position", spin_motor.getCurrentPosition());
            telemetry.addData("is at target", !spin_motor.isBusy());
            telemetry.update();
        }
    }



}
