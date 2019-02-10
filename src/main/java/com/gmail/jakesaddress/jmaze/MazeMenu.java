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
