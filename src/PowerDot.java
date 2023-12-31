import java.awt.*;

public class PowerDot implements Entity
{
    private short posX;
    private short posY;

    public PowerDot(short x, short y)
    {
        posX = x;
        posY = y;
    }

    public short getX(){return posX;}

    public short getY(){return posY;}

    public void setX(short newX){
        this.posX = newX;
    }

    public void setY(short newY){
        this.posY = newY;
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(posX, posY, 20, 20);
    }

    
}
