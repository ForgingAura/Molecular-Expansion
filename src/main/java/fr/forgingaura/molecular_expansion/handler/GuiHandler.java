package fr.forgingaura.molecular_expansion.handler;

import fr.forgingaura.molecular_expansion.Molecular_Expansion;
import fr.forgingaura.molecular_expansion.blocks.decomposer.ContainerMolecularDecomposer;
import fr.forgingaura.molecular_expansion.blocks.decomposer.GuiMolecularDecomposer;
import fr.forgingaura.molecular_expansion.blocks.decomposer.TileEntityMolecularDecomposer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == Molecular_Expansion.GUI_MOLECULAR_DECOMPOSER) return new ContainerMolecularDecomposer(player.inventory, (TileEntityMolecularDecomposer)world.getTileEntity(new BlockPos(x, y, z)));
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == Molecular_Expansion.GUI_MOLECULAR_DECOMPOSER) return new GuiMolecularDecomposer(player.inventory, (TileEntityMolecularDecomposer)world.getTileEntity(new BlockPos(x, y, z)));
        return null;
    }
}
