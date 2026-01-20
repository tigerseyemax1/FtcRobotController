package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.mechanisms.TestBenchServo;

@TeleOp
public class FastestServoSpeed extends OpMode {
    TestBenchServo bench = new TestBenchServo();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addLine("running servo at fastest speed possible");
        bench.setServoRot(1);
    }
}
