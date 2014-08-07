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
package reference

object Reference {
  final val MOD_ID = "appliedprocessing"
  final val MOD_NAME = "Applied Processing"
  final val VERSION = "1.7.10-1.0"
  final val DEPENDENCIES = "required-after:Forge@[7.0,)required-after:FML@[5.0.5,)after:appliedenergistics2"

  final val CLIENT_PROXY_CLASS = "de.orod.minecraft.appliedprocessing.proxy.ClientProxy"
  final val SERVER_PROXY_CLASS = "de.orod.minecraft.appliedprocessing.proxy.ServerProxy"
}