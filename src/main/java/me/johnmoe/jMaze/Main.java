package me.johnmoe.jMaze;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

public class Main extends JFrame {

  private static Maze maze;
  private static JMenuBar jMenuBar;

  private Main(String title) throws HeadlessException {
    super(title);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        createAndShowGui();
      }
    });
  }

  private static void createAndShowGui() {

    Main mazeGUI = new Main("Maze");

    setDefaultLookAndFeelDecorated(true);

    mazeGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    mazeGUI.setSize(500, 500);

    maze = new Maze(20, 20, 20, 10);

    jMenuBar = new MazeMenu(maze);
    mazeGUI.setJMenuBar(jMenuBar);

    mazeGUI.getContentPane().add(maze);
    mazeGUI.pack();
    mazeGUI.setVisible(true);

  }

}
