package de.gamingcraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;

public class LightSourceBlock extends Block {
    public LightSourceBlock() {
        super(FabricBlockSettings.of(Material.GLASS).nonOpaque().luminance(15));
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return BlockRenderType.INVISIBLE;
    }
}
