package fr.forgingaura.molecular_expansion.init;

import fr.forgingaura.molecular_expansion.Molecular_Expansion;
import fr.forgingaura.molecular_expansion.Utils;
import fr.forgingaura.molecular_expansion.blocks.decomposer.MolecularDecomposer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MainsBlocks {

    public static Block molecular_decomposer;

    public static void init() {
        molecular_decomposer = new MolecularDecomposer("molecular_decomposer");

    }

    public static void register() {
        registerBlock(molecular_decomposer);

    }

    public static void registerRenders() {
        registerRender(molecular_decomposer);

    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(Molecular_Expansion.MAIN_TAB);
        GameRegistry.findRegistry(Block.class).register(block);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        Utils.getLogger().info("[" + Molecular_Expansion.MOD_NAME + "] Registered blocks: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                new ResourceLocation(Molecular_Expansion.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("[" + Molecular_Expansion.MOD_NAME + "] Registered render for " + block.getUnlocalizedName().substring(5));
    }
}
