package jade;

public abstract class Scene {

    protected Camera camera;

    public Scene() {

    }

    public abstract void update(float dt);

    public void init() {

    }


}
