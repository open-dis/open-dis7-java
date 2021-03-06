package edu.nps.moves.dis7.entities.bhr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e67b872;
 * Country: Bahrain (BHR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18686
 */
public class _44Suwad extends EntityType
{
    /** Default constructor */
    public _44Suwad()
    {
        setCountry(Country.BAHRAIN_BHR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18681, Auxiliary
        setSubCategory((byte)1); // uid 18682, Support Ship
        setSpecific((byte)4); // uid 18686, 44 Suwad
    }
}
