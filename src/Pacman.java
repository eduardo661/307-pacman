import java.awt.*;

public class Pacman implements Entity
{
    private short posX;
    private short posY;
    public static final Color BACKGROUND_GRAY = new Color(230,230,230);

    public void draw(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillOval(posX, posY, 20, 20);
        g.setColor(Color.WHITE);
        g.fillOval(posX+4, posY+2, 8, 8);
        g.setColor(Color.BLACK);
        g.fillOval(posX+7, posY+5, 4, 4);
        g.setColor(BACKGROUND_GRAY);
        int [] pointsX = {posX+20, posX+10, posX+20};
        int [] poitnsY = {posY+5, posY+10, posY+15};
        g.fillPolygon(pointsX, poitnsY, 3);

        if (posX > 400) posX = 400;
        if (posY > 400) posY = 400;
        if (posX < 0) posX = 0;
        if (posY < 0) posY = 0;
    }
    public short getX(){return posX;}

    public short getY(){return posY;}

    public void setX(){ posX = 0;}

    public void setY(){posY = 0;}


    public void up() 
    {
        posY -= 20;
    }

    public void down() 
    {
        posY += 20;
    }

    public void left() 
    {
        posX -= 20;
    }

    public void right() 
    {
        posX += 20;
    }

}
