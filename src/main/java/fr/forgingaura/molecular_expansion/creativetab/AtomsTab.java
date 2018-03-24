package fr.forgingaura.molecular_expansion.creativetab;

import fr.forgingaura.molecular_expansion.init.AtomsItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AtomsTab extends CreativeTabs {

    public AtomsTab() {
        super("molecularAtoms");
        this.setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(AtomsItems.hydrogene);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
