package com.livingprogram.main;

import com.livingprogram.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by admin on 1/1/2016.
 */
public class CraftingManager
{
    public static void mainRegistry()
    {
        addCraftingRec();
        addSmeltingRec();
    }
    public static void addCraftingRec()
    {
        //Shaped Recipes
        //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.oStick 1), new Object[]{" X ", " X", 'x', Blocks.obsidian});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.threeByThreeStone), new Object[]{"XXX","XXX","XXX",'X', Blocks.stone});
        //Shapeless Recipes
        //GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1), new Object[]{"SCO", 'S', Blocks.stone, 'C', Blocks.cobblestone, 'O', Blocks.oak_door});
    }
    public static void addSmeltingRec()
    {
        //GameRegistry.addSmelting(Blocks.coal_block, new ItemStack(Blocks.obsidian, 1), 20.0f);
    }
}
