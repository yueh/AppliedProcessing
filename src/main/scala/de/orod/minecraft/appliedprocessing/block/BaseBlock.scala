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

import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import de.orod.minecraft.appliedprocessing.reference._
import de.orod.minecraft.appliedprocessing.creativetab.CreativeTab
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.block.BlockLeavesBase

trait BaseBlock extends Block {
  this setCreativeTab CreativeTab.AP_TAB

  def getUnwrappedUnlocalizedName(unlocalizedName: String) =
    unlocalizedName substring unlocalizedName.indexOf(".") + 1

  override def getUnlocalizedName() =
    String format ("tile.%s%s", Reference.MOD_ID.toLowerCase + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName))

}

class APBaseBlock(val material: Material = Material.rock) extends Block(material) with BaseBlock {
  this setBlockTextureName getUnwrappedUnlocalizedName(getUnlocalizedName)

  @SideOnly(Side.CLIENT)
  override def registerBlockIcons(register: IIconRegister) = {
    blockIcon = register registerIcon String.format("%s", getUnwrappedUnlocalizedName(getUnlocalizedName))
  }
}