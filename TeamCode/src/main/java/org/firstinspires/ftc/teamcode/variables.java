package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class variables extends OpMode {
    @Override
    public void init() {
        int teamnumber= 1234;
        double motorspeed = 0.75;
        boolean clawclosed=true;
        String TeamName= "Pyrox";
        int motorAngle = 90;
        telemetry.addData("team Number",teamnumber);
        telemetry.addData("motor speed", motorspeed);
        telemetry.addData("claw closed", clawclosed);
        telemetry.addData("Team Name",TeamName);
        telemetry.addData("motor angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
