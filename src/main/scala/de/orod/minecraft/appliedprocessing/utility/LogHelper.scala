/*
 * Applied Processing
 * Copyright 2014 yueh
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.orod.minecraft
package appliedprocessing
package utility

import org.apache.logging.log4j.Level
import cpw.mods.fml.common.FMLLog

import reference._

object LogHelper {
  def log(logLevel: Level, o: Object) = FMLLog log (Reference.MOD_NAME, logLevel, String valueOf o)

  def all(o: Object) = log(Level.ALL, o)

  def debug(o: Object) = log(Level.DEBUG, o)

  def error(o: Object) = log(Level.ERROR, o)

  def fatal(o: Object) = log(Level.FATAL, o)

  def info(o: Object) = log(Level.INFO, o)

  def off(o: Object) = log(Level.OFF, o)

  def trace(o: Object) = log(Level.TRACE, o)

  def warn(o: Object) = log(Level.WARN, o)
}
