package com.livingprogram.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by admin on 1/2/2016.
 */
//Found in The Hermit's Cave (the last oasis of light), there is the tree of light and a small pond (infused with light?)
//The Sacred Heart of Light, given to the first champion of light (losing its power due to the fact it has lost the 7 quantium particles)
//It is only the shell that holds the Sacred Heart (like a picture frame, when Heart is put into it, it is displayed)
// You hold the last quantium particle... Untouched by darkness...
public class GreatOakHeartOfLightShell extends Block
{
    public GreatOakHeartOfLightShell()
    {
        super(Material.sponge); //for the yellow color

        setUnlocalizedName("greatOakHeartOfLightShell");
        setCreativeTab(CreativeTabs.tabBlock);
        //setStepSound(soundType) //can custom soundtype be made so it makes a pleasant bell sound?
        //setHardness();
        setBlockUnbreakable();
        //setResistance();
        setResistance(6000000.0F);
        //setHarvestLevel();
        setLightOpacity(1);
        setLightLevel(0.9F);
    }
}
