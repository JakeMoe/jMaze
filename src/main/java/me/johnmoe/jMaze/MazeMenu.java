package me.johnmoe.jMaze;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MazeMenu extends JMenuBar {

  public MazeMenu(Maze maze) {

    JMenu jMenuEdit;
    JMenu jMenuFile;
    JMenu jMenuHelp;
    JMenuItem jMenuItemEditSettings;
    JMenuItem jMenuItemFileNew;
    JMenuItem jMenuItemFileExit;
    JMenuItem jMenuItemHelpAbout;

    jMenuFile = new JMenu("File");

    jMenuItemFileNew = new JMenuItem("New");
    jMenuItemFileNew.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        maze.generate();
        maze.repaint();
      }
    });

    jMenuItemFileExit = new JMenuItem("Exit");
    jMenuItemFileExit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

    jMenuFile.add(jMenuItemFileNew);
    jMenuFile.addSeparator();
    jMenuFile.add(jMenuItemFileExit);

    jMenuEdit = new JMenu("Edit");

    jMenuItemEditSettings = new JMenuItem("Settings");
    jMenuItemEditSettings.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });

    jMenuEdit.add(jMenuItemEditSettings);

    jMenuHelp = new JMenu("Help");

    jMenuItemHelpAbout = new JMenuItem("About");
    jMenuItemHelpAbout.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });

    jMenuHelp.add(jMenuItemHelpAbout);

    this.add(jMenuFile);
    this.add(jMenuEdit);
    this.add(jMenuHelp);

  }

}
