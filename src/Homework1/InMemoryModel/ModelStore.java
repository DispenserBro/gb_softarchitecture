package Homework1.InMemoryModel;

import Homework1.ModelElements.Camera;
import Homework1.ModelElements.Flash;
import Homework1.ModelElements.PoligonalModel;
import Homework1.ModelElements.Scene;

public class ModelStore implements IModelChanger {
    public PoligonalModel[] Models;
    public Scene[] Scenes;
    public Flash[] Flashes;
    public Camera[] Cameras;
    private IModelChangedObserver changeObserver;

    public IModelChangedObserver getChangedObservers() {
        return changeObserver;
    }

    public Scene getScene(int id) {
        return new Scene();
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        changeObserver.ApplyUpdateModel();
    }
}
