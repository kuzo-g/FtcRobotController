package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class gamepad extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y/2.0;
        double s = -gamepad1.left_stick_x/2.0;

        telemetry.addData("lx", s);
        telemetry.addData("ly", speedForward);
        telemetry.addData("a", gamepad1.a);
        telemetry.addData("b",gamepad1.b);
        telemetry.addData("rx",gamepad1.right_stick_x);
        telemetry.addData("ry",gamepad1.right_stick_y);

        telemetry.addData("difference lx and rx", s-gamepad1.right_stick_x);
        telemetry.addData("sum of triggers", gamepad1.left_trigger+ gamepad1.right_trigger);
    }
}
