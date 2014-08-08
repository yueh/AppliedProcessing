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
package recipes

import net.minecraft.item.ItemStack
import net.minecraft.init.Blocks
import net.minecraft.block.Block
import cpw.mods.fml.common.registry.GameRegistry

import reference._

class RecipeSkyWoodPlank {
  val inputItem = Block.blockRegistry.getObject(Reference.MOD_ID + ":" + "skywood").asInstanceOf[Block]
  val outputItem = Block.blockRegistry.getObject(Reference.MOD_ID + ":" + "skyplank").asInstanceOf[Block]

  GameRegistry.addRecipe(new ItemStack(outputItem, 4), "x", "x", inputItem)
}