package fr.forgingaura.molecular_expansion.init;

import fr.forgingaura.molecular_expansion.Molecular_Expansion;
import fr.forgingaura.molecular_expansion.Utils;
import fr.forgingaura.molecular_expansion.items.AtomItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AtomsItems { //Name of all atoms is in french in this code

    public static Item hydrogene;
    public static Item helium;
    public static Item lithium;
    public static Item beryllium;
    public static Item bore;
    public static Item carbone;
    public static Item azote;
    public static Item oxygene;
    public static Item fluor;
    public static Item neon;

    public static Item sodium;
    public static Item magnesium;
    public static Item aluminium;
    public static Item silicium;
    public static Item phosphore;
    public static Item soufre;
    public static Item chlore;
    public static Item argon;



    public static void init() {
        hydrogene = new AtomItem("hydrogene");
        helium = new AtomItem("helium");
        lithium = new AtomItem("lithium");
        beryllium = new AtomItem("beryllium");
        bore = new AtomItem("bore");
        carbone = new AtomItem("carbone");
        azote = new AtomItem("azote");
        oxygene = new AtomItem("oxygene");
        fluor = new AtomItem("fluor");
        neon = new AtomItem("neon");

        sodium = new AtomItem("sodium");
        magnesium = new AtomItem("magnesium");
        aluminium = new AtomItem("aluminium");
        silicium = new AtomItem("silicium");
        phosphore = new AtomItem("phosphore");
        soufre = new AtomItem("soufre");
        chlore = new AtomItem("chlore");
        argon = new AtomItem("argon");
    }

    public static void register() {
        registerItem(hydrogene);
        registerItem(helium);
        registerItem(lithium);
        registerItem(beryllium);
        registerItem(bore);
        registerItem(carbone);
        registerItem(azote);
        registerItem(oxygene);
        registerItem(fluor);
        registerItem(neon);

        registerItem(sodium);
        registerItem(magnesium);
        registerItem(aluminium);
        registerItem(silicium);
        registerItem(phosphore);
        registerItem(soufre);
        registerItem(chlore);
        registerItem(argon);

    }

    public static void registerRenders() {
        registerRender(hydrogene);
        registerRender(helium);
        registerRender(lithium);
        registerRender(beryllium);
        registerRender(bore);
        registerRender(carbone);
        registerRender(azote);
        registerRender(oxygene);
        registerRender(fluor);
        registerRender(neon);

        registerRender(sodium);
        registerRender(magnesium);
        registerRender(aluminium);
        registerRender(silicium);
        registerRender(phosphore);
        registerRender(soufre);
        registerRender(chlore);
        registerRender(argon);
    }

    public static void registerItem(Item item) {
        item.setCreativeTab(Molecular_Expansion.ATOMS_TAB); //Sets the creative tab
        GameRegistry.findRegistry(Item.class).register(item);
        Utils.getLogger().info("[" + Molecular_Expansion.MOD_NAME + "] Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Molecular_Expansion.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("[" + Molecular_Expansion.MOD_NAME + "] Registered render for " + item.getUnlocalizedName().substring(5));
    }
}
