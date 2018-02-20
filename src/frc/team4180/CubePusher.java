package frc.team4180;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class CubePusher {

    //what else needs to be added to this class?
    private final DoubleSolenoid upperPiston;

    public CubePusher(final int port1, final int port2) {
        upperPiston = new DoubleSolenoid(port1, port2);
    }

    public void extend() {
        upperPiston.set(DoubleSolenoid.Value.kForward);
    }

    public void reset() {
        upperPiston.set(DoubleSolenoid.Value.kReverse);
    }
}