package com.livingprogram.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by admin on 1/1/2016.
 */
public class ThreeByThreeStone extends Block
{
    public ThreeByThreeStone()
    {
        super(Material.rock);

        setUnlocalizedName("threeByThreeStone");
        setCreativeTab(CreativeTabs.tabBlock);
        setStepSound(soundTypeStone);
        setHardness(1.5F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 0);
    }
}
