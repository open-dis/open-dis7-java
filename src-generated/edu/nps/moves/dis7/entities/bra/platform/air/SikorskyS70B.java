package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@754ba872
 * Country: Brazil (BRA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 31997
 */
public class SikorskyS70B extends EntityType
{
    public SikorskyS70B()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 31996, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 31997, Sikorsky S-70B
    }
}
