package frc.robot.subsystems;

import edu.wpi.first.networktables.GenericEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import java.util.Map;
import frc.robot.Constants;

public class ShuffleboardSubsystem {
   Constants cons = new Constants();
   public double sp;

   // makes a new tab for all the controls
   private ShuffleboardTab tab = Shuffleboard.getTab("controls");
   public GenericEntry speed =
      tab.add("speed divisor", 1.6).withWidget(BuiltInWidgets.kNumberSlider)
         .withProperties(Map.of("min", 1, "max", 3, "blockIncrement", 0.1))
         .withPosition(0, 0)
         .getEntry();
         
   public GenericEntry deadBandXL =
      tab.add("deadBand Change", Constants.stickDeadbandXL).withWidget(BuiltInWidgets.kNumberSlider)
         .withProperties(Map.of("min", 0, "max", 0.5, "blockIncrement", 0.01))
         .withPosition(1, 0)
         .getEntry();

   public GenericEntry deadBandYL =
      tab.add("deadBand Change", Constants.stickDeadbandYL).withWidget(BuiltInWidgets.kNumberSlider)
         .withProperties(Map.of("min", 0, "max", 0.5, "blockIncrement", 0.01))
         .withPosition(2, 0)
         .getEntry();

   public GenericEntry deadBandXR =
      tab.add("deadBand Change", Constants.stickDeadbandXR).withWidget(BuiltInWidgets.kNumberSlider)
         .withProperties(Map.of("min", 0, "max", 0.5, "blockIncrement", 0.01))
         .withPosition(3, 0)
         .getEntry();

   public GenericEntry deadBandYR =
      tab.add("deadBand Change", Constants.stickDeadbandYR).withWidget(BuiltInWidgets.kNumberSlider)
         .withProperties(Map.of("min", 0, "max", 0.5, "blockIncrement", 0.01))
         .withPosition(4, 0)
         .getEntry();

   // gets the value of any entry you pass to it 
   public double foo(GenericEntry get, double baseValue) {
      return get.getDouble(baseValue);
   }

   // sets the value of any entry you pass to it
   public void bar(GenericEntry set, double value) {
      set.setDouble(value);
   }
 }
