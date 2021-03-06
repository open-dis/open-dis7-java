package edu.nps.moves.dis7.entities.swe.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b9396d3;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26868
 */
public class UrdA241 extends EntityType
{
    /** Default constructor */
    public UrdA241()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 26855, Auxiliary
        setSubCategory((byte)4); // uid 26867, Special Purpose Ships
        setSpecific((byte)1); // uid 26868, Urd (A241)
    }
}
