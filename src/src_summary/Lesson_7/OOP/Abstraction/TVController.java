package src_summary.Lesson_7.OOP.Abstraction;

class TVController extends RemoteController {

    @Override
    void turnOn() {
        System.out.println("TV is turned on");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned off");
    }
}
