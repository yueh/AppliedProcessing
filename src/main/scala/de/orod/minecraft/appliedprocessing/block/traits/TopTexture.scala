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
import cpw.mods.fml.relauncher.SideOnly
import cpw.mods.fml.relauncher.Side

trait TopTexture extends BaseBlock {
  var iconTop: IIcon = null

  @SideOnly(Side.CLIENT)
  def getTopIcon(side: Int) = iconTop

  @SideOnly(Side.CLIENT)
  abstract override def registerBlockIcons(register: IIconRegister) = {
    super.registerBlockIcons(register)
    iconTop = register registerIcon String.format("%sTop", getUnwrappedUnlocalizedName(getUnlocalizedName))
  }
}