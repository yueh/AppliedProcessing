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
package init

import cpw.mods.fml.common.registry.GameRegistry

import de.orod.minecraft.appliedprocessing.block._
import de.orod.minecraft.appliedprocessing.reference._

@GameRegistry.ObjectHolder(Reference.MOD_ID)
object ModBlocks {
  val skywood = new BlockSkyWood
  val skyleaves = new BlockSkyLeaves
  val skyplank = new BlockSkyPlank

  def init() = {
    GameRegistry registerBlock (skywood, "BlockSkyWood")
    GameRegistry registerBlock (skyleaves, "BlockSkyLeaves")
    GameRegistry registerBlock (skyplank, "BlockSkyWoodPlanks")
  }

}