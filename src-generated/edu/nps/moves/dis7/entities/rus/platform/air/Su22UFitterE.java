package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@49601f82;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13281
 */
public class Su22UFitterE extends EntityType
{
    /** Default constructor */
    public Su22UFitterE()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 13259, Attack/Strike
        setSubCategory((byte)6); // uid 13280, Su-22 Fitter
        setSpecific((byte)1); // uid 13281, Su-22U Fitter E
    }
}
