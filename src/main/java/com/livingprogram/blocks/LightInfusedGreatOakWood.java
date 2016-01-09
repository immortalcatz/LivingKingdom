package com.livingprogram.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


/**
 * Created by admin on 1/2/2016.
 */
public class LightInfusedGreatOakWood extends Block
{
    public LightInfusedGreatOakWood()
    {
        super(Material.wood);

        setUnlocalizedName("lightInfusedGreatOakWood");
        setCreativeTab(CreativeTabs.tabBlock);
        //setStepSound(soundType) //can custom soundtype be made so it makes a pleasant bell sound?
        //setHardness();
        setBlockUnbreakable();
        //setResistance();
        setResistance(6000000.0F);
        //setHarvestLevel();
        setLightOpacity(1);
        setLightLevel(0.7F);

        //.setTickRandomly //could be used to show the Heart of Light is slowly losing power or influence
        //.setTickRandomly	//could also be used related to light and dark properties
    }
}
