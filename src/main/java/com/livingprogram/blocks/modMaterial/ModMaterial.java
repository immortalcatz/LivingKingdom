package com.livingprogram.blocks.modMaterial;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by admin on 1/3/2016.
 */
//Used to make unique materials for blocks in the mod
public class ModMaterial
{
    public static final ModMaterial heartOfLightShell;
    private final Mapcolor matterialMapColor;
    @Override
    public ModMaterial(ModMaterial p_i46399_1_, MapColor p_i46399_2_) {
        super(p_i46399_1_, p_i46399_2_);
    }
    public ModMaterial()
    {

    }

    public ModMaterial(MapColor x) {this.materialMapColor = x;}

    static
    {
        heartOfLightShell = new ModMaterial(MapColor.yellowColor);
    }

}
