

public class AirConditioner extends Device {
	public static int currentTemp;
	public AirConditioner(){
		this.DeviceName = "Air-Conditioner";
		currentTemp = 16;
		buttons.add(new Button("Power"));
		buttons.add(new Button("TemperatureUp"));
		buttons.add(new Button("TemperatureUp"));
	}
}
