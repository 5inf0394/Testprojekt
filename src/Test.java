import org.newdawn.slick.*;

import javax.imageio.ImageIO;

public class Test extends BasicGame {
    double x, y, r, mx, my;
    double phi;
    Image image = null;

    public Test(){
        super("Test");
    }
    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        mx=gameContainer.getWidth()/2;
        my=gameContainer.getHeight()/2;
        r=200f;
        phi=0;
        image = new Image("Bild1.jpeg");
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        x = mx+r*Math.cos(phi);
        y= my+r*Math.sin(phi);
        phi+=Math.PI/500;
        if (phi>Math.PI*2) {
            phi-=Math.PI*2;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        image.drawCentered((float) x,(float) y);

    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer agc = new AppGameContainer(new Test());
        agc.setShowFPS(true);
        agc.setDisplayMode(1600,1600,false);
        agc.start();
    }
}
