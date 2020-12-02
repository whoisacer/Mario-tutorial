package jade;


import components.Sprite;
import components.SpriteRenderer;
import components.Spritesheet;
import org.joml.Vector2f;
import org.joml.Vector4f;
import util.AssetPool;

public class LevelEditorScene extends Scene {

    public LevelEditorScene() {
    }

    @Override
    public void init() {
        loadResources();

        this.camera = new Camera(new Vector2f(-250, 0));

        Spritesheet sprites = AssetPool.getSpritesheet("assets/images/MainCharacters/2_GraveRobber/GraveRobber_walk.png");

        GameObject obj1 = new GameObject("Object 1", new Transform(new Vector2f(100, 100), new Vector2f(245, 256)));
        obj1.addComponent(new SpriteRenderer(sprites.getSprite(0)));
        this.addGameObjectToScene(obj1);


    }

    private void loadResources() {
        AssetPool.getShader("assets/shaders/default.glsl");

        AssetPool.addSpritesheet("assets/images/MainCharacters/2_GraveRobber/GraveRobber_walk.png",
                new Spritesheet(AssetPool.getTexture("assets/images/MainCharacters/2_GraveRobber/GraveRobber_walk.png"),
                        48, 48 , 6, 0));
    }

    @Override
    public void update(float dt) {


        for (GameObject go : this.gameObjects) {
            go.update(dt);
        }

        this.renderer.render();
    }
}
