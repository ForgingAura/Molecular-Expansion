package fr.forgingaura.molecular_expansion;

import fr.forgingaura.molecular_expansion.creativetab.AtomsTab;
import fr.forgingaura.molecular_expansion.creativetab.MainTab;
import fr.forgingaura.molecular_expansion.handler.GuiHandler;
import fr.forgingaura.molecular_expansion.handler.TileEntityHandler;
import fr.forgingaura.molecular_expansion.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod( modid = Molecular_Expansion.MOD_ID, name = Molecular_Expansion.MOD_NAME, version = Molecular_Expansion.MOD_VERSION)
public class Molecular_Expansion {

    @Instance
    public static Molecular_Expansion instance;

    public static final String MOD_ID = "molecular_expansion";
    public static final String MOD_NAME = "Molecular Expansion";
    public static final String MOD_VERSION = "alpha-0.0.5";
    public static final String CLIENT_PROXY = "fr.forgingaura.molecular_expansion.proxy.ClientProxy";
    public static final String SERVER_PROXY = "fr.forgingaura.molecular_expansion.proxy.ServerProxy";
    public static final int GUI_MOLECULAR_DECOMPOSER = 0;

    public static final CreativeTabs ATOMS_TAB = new AtomsTab();
    public static final CreativeTabs MAIN_TAB = new MainTab();

    @SidedProxy(clientSide = Molecular_Expansion.CLIENT_PROXY, serverSide = Molecular_Expansion.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
        TileEntityHandler.regiterTileEntities();
        System.out.println("[" + Molecular_Expansion.MOD_NAME + "] Pre Initialization Done");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(Molecular_Expansion.instance, new GuiHandler());
        System.out.println("[" + Molecular_Expansion.MOD_NAME + "] Initialization Done");
    }

}
