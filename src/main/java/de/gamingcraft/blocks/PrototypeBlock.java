package de.gamingcraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class PrototypeBlock extends Block {
    public PrototypeBlock() {
        super(FabricBlockSettings.of(Material.GLASS));
    }
}
