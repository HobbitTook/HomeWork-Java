package qa.guru.service;

import qa.guru.domain.Car;
import qa.guru.repo.CarStore;
import qa.guru.repo.TrackStore;
import qa.guru.domain.Track;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class GuiInterface {
    private final CarStore carStore;
    private final TrackStore trackStore;

    public GuiInterface(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car chooseCarInGui() {
        Object[] carChoice = carStore.carInStore();
        ImageIcon icon = new ImageIcon("src/main/resources/26086.png");
        String desiredCar = (String) JOptionPane.showInputDialog(
                null,
                "Выберите болид:",
                "Выбор болида",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                carChoice,
                "");
        return carStore.lookup(desiredCar);
    }

    public Track chooseTrackInGui() {
        Object[] trackChoice = trackStore.trackInStore();
        ImageIcon icon2 = new ImageIcon("src/main/resources/62512.png");
        String desiredTrack = (String) JOptionPane.showInputDialog(
                null,
                "Выберите трассу:",
                "Выбор трассы",
                JOptionPane.PLAIN_MESSAGE,
                icon2,
                trackChoice,
                "");
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(Car car, Track track) {
        if (car.isPitstopNeeded(track)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop needed in " + car.maxLapsForTrack(),
                    "Результат:",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop not needed ",
                    "Результат:",
                    1
            );
        }
    }
}
