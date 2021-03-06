package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@fb0a08c;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10648
 */
public class Compressor extends EntityType
{
    /** Default constructor */
    public Compressor()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)20); // uid 10646, Maintenance equipment trailer
        setSubCategory((byte)2); // uid 10648, Compressor
    }
}
