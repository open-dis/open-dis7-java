package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e84448c;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28203
 */
public class SA316BAlouetteIIINetherlands extends EntityType
{
    /** Default constructor */
    public SA316BAlouetteIIINetherlands()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)3); // uid 15831, Aerospatiale SA 316 Alouette III
        setSpecific((byte)5); // uid 28203, SA 316B Alouette III (Netherlands)
    }
}
