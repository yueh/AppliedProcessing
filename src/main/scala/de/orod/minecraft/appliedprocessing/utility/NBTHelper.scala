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

import net.minecraft.item.ItemStack
import net.minecraft.nbt.NBTTagCompound

object NBTHelper {
  def hasTag(itemStack: ItemStack, keyName: String) =
    itemStack != null && itemStack.stackTagCompound != null && itemStack.stackTagCompound.hasKey(keyName)

  def removeTag(itemStack: ItemStack, keyName: String) = {
    if (itemStack.stackTagCompound != null)
      itemStack.stackTagCompound removeTag keyName
  }

  /**
   * Initializes the NBT Tag Compound for the given ItemStack if it is null
   *
   * @param itemStack
   *         The ItemStack for which its NBT Tag Compound is being checked for initialization
   */
  def initNBTTagCompound(itemStack: ItemStack) = {
    if (itemStack.stackTagCompound == null) {
      itemStack setTagCompound (new NBTTagCompound())
    }
  }

  def setLong(itemStack: ItemStack, keyName: String, keyValue: Long) = {
    initNBTTagCompound(itemStack)
    itemStack.stackTagCompound setLong (keyName, keyValue)
  }

  // String
  def getString(itemStack: ItemStack, keyName: String) = {
    initNBTTagCompound(itemStack)

    if (!itemStack.stackTagCompound.hasKey(keyName)) {
      setString(itemStack, keyName, "")
    }

    itemStack.stackTagCompound getString keyName
  }

  def setString(itemStack: ItemStack, keyName: String, keyValue: String) = {
    initNBTTagCompound(itemStack)

    itemStack.stackTagCompound setString (keyName, keyValue)
  }

  // boolean
  def getBoolean(itemStack: ItemStack, keyName: String) = {
    initNBTTagCompound(itemStack)

    if (!itemStack.stackTagCompound.hasKey(keyName)) {
      setBoolean(itemStack, keyName, false)
    }

    itemStack.stackTagCompound getBoolean keyName
  }

  def setBoolean(itemStack: ItemStack, keyName: String, keyValue: Boolean) = {
    initNBTTagCompound(itemStack)
    itemStack.stackTagCompound setBoolean (keyName, keyValue)
  }

  // byte
  def getByte(itemStack: ItemStack, keyName: String) = {
    initNBTTagCompound(itemStack)

    if (!itemStack.stackTagCompound.hasKey(keyName))
      setByte(itemStack, keyName, 0)

    itemStack.stackTagCompound getByte keyName
  }

  def setByte(itemStack: ItemStack, keyName: String, keyValue: Byte) = {
    initNBTTagCompound(itemStack)

    itemStack.stackTagCompound setByte (keyName, keyValue)
  }

  // short
  def getShort(itemStack: ItemStack, keyName: String) = {
    initNBTTagCompound(itemStack)

    if (!itemStack.stackTagCompound.hasKey(keyName))
      setShort(itemStack, keyName, 0)

    itemStack.stackTagCompound getShort keyName
  }

  def setShort(itemStack: ItemStack, keyName: String, keyValue: Short) = {
    initNBTTagCompound(itemStack)

    itemStack.stackTagCompound setShort (keyName, keyValue)
  }

  // int
  def getInt(itemStack: ItemStack, keyName: String) = {
    initNBTTagCompound(itemStack)

    if (!itemStack.stackTagCompound.hasKey(keyName))
      setInteger(itemStack, keyName, 0)

    itemStack.stackTagCompound getInteger keyName
  }

  def setInteger(itemStack: ItemStack, keyName: String, keyValue: Int) = {
    initNBTTagCompound(itemStack)

    itemStack.stackTagCompound setInteger (keyName, keyValue)
  }

  // long
  def getLong(itemStack: ItemStack, keyName: String) = {
    initNBTTagCompound(itemStack)

    if (!itemStack.stackTagCompound.hasKey(keyName))
      setLong(itemStack, keyName, 0)

    itemStack.stackTagCompound getLong keyName
  }

  // float
  def getFloat(itemStack: ItemStack, keyName: String) = {
    initNBTTagCompound(itemStack)

    if (!itemStack.stackTagCompound.hasKey(keyName))
      setFloat(itemStack, keyName, 0)

    itemStack.stackTagCompound getFloat keyName
  }

  def setFloat(itemStack: ItemStack, keyName: String, keyValue: Float) = {
    initNBTTagCompound(itemStack)
    itemStack.stackTagCompound setFloat (keyName, keyValue)
  }

  // double
  def getDouble(itemStack: ItemStack, keyName: String) = {
    initNBTTagCompound(itemStack)

    if (!itemStack.stackTagCompound.hasKey(keyName))
      setDouble(itemStack, keyName, 0)

    itemStack.stackTagCompound getDouble keyName
  }

  def setDouble(itemStack: ItemStack, keyName: String, keyValue: Double) = {
    initNBTTagCompound(itemStack)
    itemStack.stackTagCompound setDouble (keyName, keyValue)
  }
}