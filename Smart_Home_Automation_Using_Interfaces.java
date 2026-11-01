
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Light is ON");
    }

    public void turnOff() {
        System.out.println("Smart Light is OFF");
    }
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Fan is ON");
    }

    public void turnOff() {
        System.out.println("Smart Fan is OFF");
    }
}


public class Smart_Home_Automation_Using_Interfaces {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();

        System.out.println("Smart Home Automation System");

        light.turnOn();
        fan.turnOn();

        light.turnOff();
        fan.turnOff();
    }
}