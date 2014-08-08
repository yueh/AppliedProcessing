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
package block

import net.minecraft.block.Block
import net.minecraft.block.BlockRotatedPillar
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.util.IIcon
import net.minecraft.world.IBlockAccess
import cpw.mods.fml.relauncher.SideOnly
import cpw.mods.fml.relauncher.Side
import de.orod.minecraft.appliedprocessing.reference._
import net.minecraft.init.Blocks
import de.orod.minecraft.appliedprocessing.block.traits.RotatedBlock

class BlockSkyWood extends APBaseBlock with RotatedBlock {
  this setBlockName Names.BLOCK_SKY_WOOD
  this setStepSound Block.soundTypeWood
  this setHardness 4

  override def canSustainLeaves(world: IBlockAccess, x: Int, y: Int, z: Int) = true
  override def isWood(world: IBlockAccess, x: Int, y: Int, z: Int) = true

}
