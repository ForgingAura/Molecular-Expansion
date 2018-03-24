package fr.forgingaura.molecular_expansion.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MainTab extends CreativeTabs {

    public MainTab() {
        super("molecularExpansion");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(Blocks.IRON_BLOCK));
    }
}
