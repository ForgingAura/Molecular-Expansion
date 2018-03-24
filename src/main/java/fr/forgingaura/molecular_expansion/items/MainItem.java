package fr.forgingaura.molecular_expansion.items;

import fr.forgingaura.molecular_expansion.Molecular_Expansion;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class MainItem extends Item{

    public MainItem(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Molecular_Expansion.MOD_ID, unlocalizedName));
    }
}
