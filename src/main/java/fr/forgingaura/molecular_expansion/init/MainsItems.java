package fr.forgingaura.molecular_expansion.init;

import fr.forgingaura.molecular_expansion.Molecular_Expansion;
import fr.forgingaura.molecular_expansion.Utils;
import fr.forgingaura.molecular_expansion.items.MainItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MainsItems {

    public static Item testtube;

    public static void init() {
        testtube = new MainItem("test_tube");

    }

    public static void register() {
        registerItem(testtube);

    }

    public static void registerRenders() {
        registerRender(testtube);
    }

    public static void registerItem(Item item) {
        item.setCreativeTab(Molecular_Expansion.MAIN_TAB); //Sets the creative tab
        GameRegistry.findRegistry(Item.class).register(item);
        Utils.getLogger().info("[" + Molecular_Expansion.MOD_NAME + "] Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Molecular_Expansion.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("[" + Molecular_Expansion.MOD_NAME + "] Registered render for " + item.getUnlocalizedName().substring(5));
    }
}
