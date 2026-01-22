package org.firstinspires.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestBenchColor {

    NormalizedColorSensor colorSensor;

    public enum DetectedColor {
        PURPLE,
        GREEN,
        UNKNOWN,

    }
    public void init(HardwareMap hwMap) {
        colorSensor = hwMap.get(NormalizedColorSensor.class, "sensor_color_distance");
        colorSensor.setGain(8);
    }

    public DetectedColor getDetectedColor(Telemetry telemetry) {
        NormalizedRGBA colors = colorSensor.getNormalizedColors(); // return 4 values

        float normRed, normGreen, normBlue;
        normRed = colors.red/colors.alpha;
        normGreen = colors.green/colors.alpha;
        normBlue = colors.blue/colors.alpha;

        // RED , GREEN, BLUE

        telemetry.addData("red", normRed);
        telemetry.addData("green", normGreen);
        telemetry.addData("blue", normBlue);

        return DetectedColor.UNKNOWN;
    }
}
