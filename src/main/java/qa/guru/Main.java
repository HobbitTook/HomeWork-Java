package qa.guru;


import qa.guru.repo.CarStore;
import qa.guru.repo.TrackStore;
import qa.guru.service.ConsoleInterface;
import qa.guru.service.GuiInterface;

public class Main {
    public static void main(String[] args) {
        new Application(new GuiInterface(
                new CarStore(),
                new TrackStore()
        )).runGuiInterface();

       /* new Application(new ConsoleInterface(
                new CarStore(),
                new TrackStore()
        )).runConsoleInterface();*/
    }
}