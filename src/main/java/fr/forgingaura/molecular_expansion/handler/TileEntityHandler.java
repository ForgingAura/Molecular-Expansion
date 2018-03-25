package fr.forgingaura.molecular_expansion.handler;

import fr.forgingaura.molecular_expansion.blocks.decomposer.TileEntityMolecularDecomposer;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

    public static void regiterTileEntities() {
        GameRegistry.registerTileEntity(TileEntityMolecularDecomposer.class, "molecular_decomposer");
    }
}
