package qa.guru;


import qa.guru.domain.Car;
import qa.guru.service.ConsoleInterface;
import qa.guru.domain.Track;
import qa.guru.service.GuiInterface;

public class Application {
    private final GuiInterface userInterface;
    public Application(GuiInterface userInterface) {
        this.userInterface = userInterface;
    }
    void runGuiInterface() {
        Car car = userInterface.chooseCarInGui();
        Track track = userInterface.chooseTrackInGui();
        userInterface.showResult(car, track);
    }

    /*private final ConsoleInterface consoleInterface;

    public Application(ConsoleInterface consoleInterface) {
        this.consoleInterface = consoleInterface;
    }

    void runConsoleInterface() {
        Car car = consoleInterface.choiseCarConsole();
        Track track = consoleInterface.choiseTrackConsole();
        consoleInterface.showResult(car, track);
    }*/
}