package fr.forgingaura.molecular_expansion.proxy;

import fr.forgingaura.molecular_expansion.init.AtomsItems;

public class ServerProxy implements CommonProxy {

    @Override
    public void preInit() {
        AtomsItems.init();
        AtomsItems.register();
    }
}
