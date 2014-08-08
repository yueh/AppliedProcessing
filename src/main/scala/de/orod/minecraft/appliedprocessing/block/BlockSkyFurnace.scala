package de.orod.minecraft
package appliedprocessing
package block

import traits.MultiTexture
import reference._

class BlockSkyFurnace extends APBaseBlock with MultiTexture {
  this setBlockName Names.BLOCK_SKY_FURNACE
  this setHardness 1
}