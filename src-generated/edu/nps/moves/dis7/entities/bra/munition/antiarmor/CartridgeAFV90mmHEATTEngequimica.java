package edu.nps.moves.dis7.entities.bra.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7e5efcab;
 * Country: Brazil (BRA);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 26956
 */
public class CartridgeAFV90mmHEATTEngequimica extends EntityType
{
    /** Default constructor */
    public CartridgeAFV90mmHEATTEngequimica()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 26952, Ballistic
        setSubCategory((byte)1); // uid 26953, 90mm
        setSpecific((byte)3); // uid 26956, Cartridge, AFV, 90mm, HEAT-T, Engequimica
    }
}
