package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@62d0ac62;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30870
 */
public class GenericLifeboatEnclosed extends EntityType
{
    /** Default constructor */
    public GenericLifeboatEnclosed()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)101); // uid 30867, Life-Saving Equipment
        setSubCategory((byte)1); // uid 30868, Generic Lifeboat
        setSpecific((byte)2); // uid 30870, Generic Lifeboat Enclosed
    }
}
