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
package item

import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.item.Item
import net.minecraft.item.ItemStack

import de.orod.minecraft.appliedprocessing.creativetab.CreativeTab
import de.orod.minecraft.appliedprocessing.reference._

trait BaseItem extends Item {
  setCreativeTab(CreativeTab.AP_TAB)

  override def getUnlocalizedName() =
    String format ("item.%s%s", Reference.MOD_ID.toLowerCase + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName))

  override def getUnlocalizedName(itemStack: ItemStack) =
    String format ("item.%s%s", Reference.MOD_ID.toLowerCase + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName))

  def getUnwrappedUnlocalizedName(unlocalizedName: String) =
    unlocalizedName substring unlocalizedName.indexOf(".") + 1
}
