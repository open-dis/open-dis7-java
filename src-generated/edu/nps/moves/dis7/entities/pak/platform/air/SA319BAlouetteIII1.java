package edu.nps.moves.dis7.entities.pak.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@240139e1;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30458
 */
public class SA319BAlouetteIII1 extends EntityType
{
    /** Default constructor */
    public SA319BAlouetteIII1()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 30456, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 30457, Aerospatiale Alouette III
        setSpecific((byte)1); // uid 30458, SA 319B Alouette III
    }
}
