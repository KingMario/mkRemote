/*
 * Copyright (c) 2009-2013 devBury LLC
 * This file is part of mkRemote.
 *
 *     mkRemote is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License Version 3
 *     as published by the Free Software Foundation.
 *
 *     mkRemote is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with mkRemote.  If not, see <http://www.gnu.org/licenses/gpl.txt/>.
 */

package com.devbury.mkremote.server.boxee;

public interface IBoxeeService {
    int getVolume();

    void setVolume(int percent);

    void mute();

    void pause();

    void stop();

    void playNext();

    void playPrev();

    void seekPercentage(int percent);

    void seekPercentageRealtive(int percent);

    int getPercentage();

    void up();

    void down();

    void left();

    void right();

    void back();

    void select();
}