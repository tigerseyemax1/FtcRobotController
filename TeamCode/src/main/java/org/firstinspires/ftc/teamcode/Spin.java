package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.mechanisms.TestBenchMotor;

@TeleOp
public class Spin extends OpMode {
    private double countSpins = 0;


    TestBenchMotor spinningMotor = new TestBenchMotor();

    @Override
    public void init() {
        spinningMotor.init(hardwareMap);
    }

    public void loop() {

    }



}
