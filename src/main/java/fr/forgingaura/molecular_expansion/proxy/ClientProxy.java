package fr.forgingaura.molecular_expansion.proxy;

import fr.forgingaura.molecular_expansion.init.AtomsItems;
import fr.forgingaura.molecular_expansion.init.MainsItems;

public class ClientProxy implements CommonProxy {

    @Override
    public void preInit() {
        AtomsItems.init();
        AtomsItems.register();
        AtomsItems.registerRenders();
        MainsItems.init();
        MainsItems.register();
        MainsItems.registerRenders();
    }
}
