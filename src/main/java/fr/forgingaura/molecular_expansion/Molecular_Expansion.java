package fr.forgingaura.molecular_expansion;

import fr.forgingaura.molecular_expansion.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = Molecular_Expansion.MOD_ID, name = Molecular_Expansion.MOD_NAME, version = Molecular_Expansion.MOD_VERSION)
public class Molecular_Expansion {

    public static final String MOD_ID = "molecular_expansion";
    public static final String MOD_NAME = "Molecular Expansion";
    public static final String MOD_VERSION = "alpha-0.0.1";
    public static final String CLIENT_PROXY = "fr.forgingaura.molecular_expansion.proxy.ClientProxy";
    public static final String SERVER_PROXY = "fr.forgingaura.molecular_expansion.proxy.ServerProxy";

    @SidedProxy(clientSide = Molecular_Expansion.CLIENT_PROXY, serverSide = Molecular_Expansion.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("[" + Molecular_Expansion.MOD_NAME + "] Pre Initialization Done");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("[" + Molecular_Expansion.MOD_NAME + "] Initialization Done");
    }

}