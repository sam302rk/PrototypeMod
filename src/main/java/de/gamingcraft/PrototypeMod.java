package de.gamingcraft;

import de.gamingcraft.blocks.LightSourceBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.Arrays;

public class PrototypeMod implements ModInitializer {

	public static final ArrayList<PTMBlock> blocks = new ArrayList<>();

	@Override
	public void onInitialize() {
		blocks.addAll(Arrays.asList(new PTMBlock(new LightSourceBlock(), "light_source")));

		blocks.forEach(b -> {
			Registry.register(Registry.BLOCK, new Identifier("prototype", b.id), b.block);
			Registry.register(Registry.ITEM, new Identifier("prototype", b.id), new BlockItem(b.block, new FabricItemSettings().group(ItemGroup.MISC)));
		});
	}
}
