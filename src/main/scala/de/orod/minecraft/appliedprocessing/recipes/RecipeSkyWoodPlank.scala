package de.orod.minecraft.appliedprocessing.recipes

import net.minecraft.item.ItemStack
import net.minecraft.init.Blocks
import net.minecraft.block.Block
import cpw.mods.fml.common.registry.GameRegistry

import de.orod.minecraft.appliedprocessing.reference.Names
import de.orod.minecraft.appliedprocessing.reference.Reference

class RecipeSkyWoodPlank {
  val inputItem = Block.blockRegistry.getObject(Reference.MOD_ID + ":" + "skywood").asInstanceOf[Block]
  val outputItem = Block.blockRegistry.getObject(Reference.MOD_ID + ":" + "skyplank").asInstanceOf[Block]

  GameRegistry.addRecipe(new ItemStack(outputItem, 4), "x", "x", inputItem)
}