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

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.SidedProxy

import reference._
import utility._
import proxy._
import init._

@Mod(
  modid = Reference.MOD_ID,
  name = Reference.MOD_NAME,
  version = Reference.VERSION,
  //dependencies = Reference.DEPENDENCIES,
  modLanguage = "scala")
object AppliedProcessing {

  @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
  var proxy: Proxy = null

  @Mod.EventHandler
  def preInit(event: FMLPreInitializationEvent) = {
    LogHelper info "Pre Initialization Complete!"

    ModItems.init
    ModBlocks.init
    ModRecipes.init
  }

  @Mod.EventHandler
  def init(event: FMLInitializationEvent) = {
    LogHelper info "Initialization Complete!"
  }

  @Mod.EventHandler
  def postInit(event: FMLPostInitializationEvent) = {
    LogHelper info "Post Initialization Complete!"
  }
}
