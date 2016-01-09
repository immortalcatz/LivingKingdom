package com.livingprogram.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by admin on 1/2/2016.
 */

//Found in The Hermit's Cave
//Heartwood of the last GreatOak tree infused with light
public class LightInfusedGreatOakHeartwood extends Block
{
    public LightInfusedGreatOakHeartwood()
    {
        super(Material.wood);

        setUnlocalizedName("lightInfusedGreatOakHeartwood");
        setCreativeTab(CreativeTabs.tabBlock);
        //setStepSound(soundType) //can custom soundtype be made so it makes a pleasant bell sound?
        //setHardness();
        setBlockUnbreakable();
        //setResistance();
        setResistance(6000000.0F);
        //setHarvestLevel();
        setLightOpacity(1);
        setLightLevel(0.8F);
    }
}
