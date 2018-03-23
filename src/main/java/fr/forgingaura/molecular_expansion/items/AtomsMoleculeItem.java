package fr.forgingaura.molecular_expansion.items;

import fr.forgingaura.molecular_expansion.Molecular_Expansion;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class AtomsMoleculeItem extends Item {

    public AtomsMoleculeItem(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Molecular_Expansion.MOD_ID, unlocalizedName));
    }

}
