package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.mechanisms.TestBenchServo;

@TeleOp
public class ServoPosition extends OpMode {
    TestBenchServo bench = new TestBenchServo();

    @Override
    public void init() {
        bench.init(hardwareMap);

    }
    @Override
    public void loop() {
        telemetry.addLine("running positional servo at an angle of 0.5");
        bench.setServoPos(1);
    }
}
