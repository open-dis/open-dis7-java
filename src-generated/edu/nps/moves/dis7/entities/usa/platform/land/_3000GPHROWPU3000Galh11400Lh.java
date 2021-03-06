package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@26ca61bf;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27686
 */
public class _3000GPHROWPU3000Galh11400Lh extends EntityType
{
    /** Default constructor */
    public _3000GPHROWPU3000Galh11400Lh()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)18); // uid 27262, ROWPU - Reverse Osmosis Water Purification Unit
        setSpecific((byte)3); // uid 27686, 3000-GPH ROWPU (3000 Gal/h / 11400 L/h)
    }
}
