import java.awt.*;

public class ScoreBoard implements Entity
{
    private short posX = 400;
    private short posY = 0;
    private Integer points = 0;

    public int getPoints(){
        return this.points;
    }
    public short getX(){return posX;}
    public short getY(){return posY;}
    public void setPoints(int x){
        this.points = x;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(posX, posY, 100, 50);
        g.setColor(Color.WHITE);
        g.drawString("Points:", 400, 15);
        String dub = points.toString();
        g.drawString( dub, 450, 15);

}}
