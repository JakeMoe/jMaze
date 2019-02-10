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

public class MazeCell {

  private boolean eastWall;
  private boolean northWall;
  private boolean southWall;
  private boolean visited;
  private boolean westWall;
  private int col;
  private int row;

  public MazeCell(int col, int row) {
    this.col = col;
    this.row = row;
    eastWall = true;
    northWall = true;
    southWall = true;
    westWall = true;
    visited = false;
  }

  public int getCol() {
    return col;
  }

  public int getRow() {
    return row;
  }

  public boolean hasEastWall() {
    return eastWall;
  }

  public boolean hasNorthWall() {
    return northWall;
  }

  public boolean hasSouthWall() {
    return southWall;
  }

  public boolean hasWestWall() {
    return westWall;
  }

  public boolean isVisited() {
    return visited;
  }

  public void setEastWall(boolean eastWall) {
    this.eastWall = eastWall;
  }

  public void setNorthWall(boolean northWall) {
    this.northWall = northWall;
  }

  public void setSouthWall(boolean southWall) {
    this.southWall = southWall;
  }

  public void setWestWall(boolean westWall) {
    this.westWall = westWall;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

}
