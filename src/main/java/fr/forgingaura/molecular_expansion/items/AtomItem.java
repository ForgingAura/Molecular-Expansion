package fr.forgingaura.molecular_expansion.items;

import fr.forgingaura.molecular_expansion.Molecular_Expansion;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class AtomItem extends Item {

    String name;

    public AtomItem(String unlocalizedName) {
        name = unlocalizedName;
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Molecular_Expansion.MOD_ID, unlocalizedName));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.translateToLocal("tooltip." + name + ".gmol").trim());
        tooltip.add(I18n.translateToLocal("tooltip." + name + ".proton").trim());
        tooltip.add(I18n.translateToLocal("tooltip." + name + ".neutron").trim());
        tooltip.add(I18n.translateToLocal("tooltip." + name + ".fusion").trim());
        tooltip.add(I18n.translateToLocal("tooltip." + name + ".ebullition").trim());
    }
}
