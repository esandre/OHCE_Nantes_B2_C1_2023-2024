package fr.enzosandre.test.utilities;

import fr.enzosandre.LangueInterface;

public class LangueSpy implements LangueInterface {
    public boolean FéliciterAppeléAuMoinsUneFois() {
        return this.féliciterAppelé;
    }

    private boolean féliciterAppelé = false;

    @Override
    public String Féliciter() {
        féliciterAppelé = true;
        return "";
    }
}
