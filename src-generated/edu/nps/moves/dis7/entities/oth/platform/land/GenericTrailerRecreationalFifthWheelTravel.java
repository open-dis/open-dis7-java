package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@20765ed5;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25949
 */
public class GenericTrailerRecreationalFifthWheelTravel extends EntityType
{
    /** Default constructor */
    public GenericTrailerRecreationalFifthWheelTravel()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)89); // uid 25929, Trailer
        setSubCategory((byte)20); // uid 25949, Generic Trailer, Recreational, Fifth Wheel Travel
    }
}
