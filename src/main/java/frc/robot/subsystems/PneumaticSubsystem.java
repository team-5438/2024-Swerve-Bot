import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsHub;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Valuye;
import Constants;


public class PneumaticSubsystem {
    public PneumaticHub SolenoidThing = new PneumaticHub(Constants.solenoidID);
    public static DoubleSolenoid = new DoubleSolenoid(Constants.solenoidID, PneumaticsModuleType.REVPH, 1, 2);

    public PneumaticSubsystem(){
        Solenoid.set(Value.kOff);
        Solenoid.set(Value.kReverse);

        SolenoidThing.enableCompressorAnalog(80, 110);
    }
}
