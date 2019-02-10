/*
 *     This file is part of jMaze.
 *
 *     jMaze is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     jMaze is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with jMaze.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.gmail.jakesaddress.jmaze;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

public class Main extends JFrame {

  private Main(String title) throws HeadlessException {
    super(title);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(Main::createAndShowGui);
  }

  private static void createAndShowGui() {

    Main mazeGUI = new Main("Maze");

    setDefaultLookAndFeelDecorated(true);

    mazeGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    mazeGUI.setSize(500, 500);

    Maze maze = new Maze(20, 20, 20, 10);

    JMenuBar jMenuBar = new MazeMenu(maze);
    mazeGUI.setJMenuBar(jMenuBar);

    mazeGUI.getContentPane().add(maze);
    mazeGUI.pack();
    mazeGUI.setVisible(true);

  }

}
