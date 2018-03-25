package fr.forgingaura.molecular_expansion.proxy;

import fr.forgingaura.molecular_expansion.init.AtomsItems;
import fr.forgingaura.molecular_expansion.init.MainsBlocks;
import fr.forgingaura.molecular_expansion.init.MainsItems;

public class ServerProxy implements CommonProxy {

    @Override
    public void preInit() {
        AtomsItems.init();
        AtomsItems.register();
        MainsItems.init();
        MainsItems.register();
        MainsBlocks.init();
        MainsBlocks.register();
    }
}
