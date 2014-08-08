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

import net.minecraft.world.World
import net.minecraft.item.{ Item, ItemStack }
import net.minecraft.util.IIcon
import net.minecraft.client.renderer.texture.IIconRegister
import cpw.mods.fml.relauncher.{ SideOnly, Side }

import cpw.mods.fml.relauncher.{ SideOnly, Side }

import block.BaseBlock

trait RotatedBlock extends BaseBlock with TopTexture with SideTexture {

  override val getRenderType = 31

  override def onBlockPlaced(world: World, X: Int, Y: Int, Z: Int, side: Int, hitX: Float, hitY: Float, hitZ: Float, metadata: Int) = {
    val j1 = metadata & 3;
    val b0 = side match {
      case 0 | 1 => 0
      case 2 | 3 => 8
      case 4 | 5 => 4
    }

    j1 | b0;
  }

  @SideOnly(Side.CLIENT)
  override def getIcon(side: Int, meta: Int) = {
    val k = meta & 12;
    val l = meta & 3;
    k match {
      case 0 if side == 0 || side == 1 => getTopIcon(l)
      case 4 if side == 4 || side == 5 => getTopIcon(l)
      case 8 if side == 2 || side == 3 => getTopIcon(l)
      case _ => getSideIcon(l)
    }
  }

  override def damageDropped(data: Int) = data & 3

  override def createStackedBlock(data: Int) = new ItemStack(Item.getItemFromBlock(this), 1, data & 3)
}