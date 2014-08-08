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
package traits

import net.minecraft.util.IIcon
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.world.IBlockAccess
import cpw.mods.fml.relauncher.{ SideOnly, Side }

trait TranslucentBlock extends BaseBlock {
  val field_150121_P = true

  /**
   * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
   * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
   */
  override def isOpaqueCube = false

  /**
   * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
   * coordinates.  Args: blockAccess, x, y, z, side
   */
  @SideOnly(Side.CLIENT)
  override def shouldSideBeRendered(p_149646_1_ : IBlockAccess, p_149646_2_ : Int, p_149646_3_ : Int, p_149646_4_ : Int, p_149646_5_ : Int) = {
    val block = p_149646_1_.getBlock(p_149646_2_, p_149646_3_, p_149646_4_);
    if (!this.field_150121_P && block == this) false else super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
  }
}