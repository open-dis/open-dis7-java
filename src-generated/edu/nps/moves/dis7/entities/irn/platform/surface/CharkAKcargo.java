package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7cbc3762;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18137
 */
public class CharkAKcargo extends EntityType
{
    /** Default constructor */
    public CharkAKcargo()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18114, Auxiliary
        setSubCategory((byte)4); // uid 18136, Delvar Class (support ship)
        setSpecific((byte)1); // uid 18137, Chark (AK) (cargo)
    }
}
