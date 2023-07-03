import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements ActionListener, KeyListener {
    private Maze maze;
    private Pacman pacman;
    private GreenGhost green_ghost;
    private RedGhost red_ghost;
    private BlueGhost blue_ghost;
    private OrangeGhost orange_ghost;
    private PowerDot power_dot;
    private ScoreBoard scoreBoard;

    public Game()
    {
        pacman = new Pacman();
        green_ghost = new GreenGhost();
        red_ghost = new RedGhost();
        blue_ghost = new BlueGhost();
        orange_ghost = new OrangeGhost();
        power_dot = new PowerDot((short)60,(short)60);
        scoreBoard = new ScoreBoard();
        maze = new Maze(pacman, green_ghost, red_ghost, blue_ghost, orange_ghost, power_dot, scoreBoard);
        this.getContentPane().add(maze);
        this.addKeyListener(this);
    }

    public void startTimer()
    {
        Timer timer = new Timer(100, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e)
    {
        maze.repaint();
    }

    public static void main(String[] args) 
    {
        Game win = new Game();
        win.setSize(500,500);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.startTimer();
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        switch (keyCode)
        {
            case KeyEvent.VK_UP: pacman.up(); break;
            case KeyEvent.VK_DOWN: pacman.down(); break;
            case KeyEvent.VK_LEFT: pacman.left(); break;
            case KeyEvent.VK_RIGHT: pacman.right(); break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) { }

    

}