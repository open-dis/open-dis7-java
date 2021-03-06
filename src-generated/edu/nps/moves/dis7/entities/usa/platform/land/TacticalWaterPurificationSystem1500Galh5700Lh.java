package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@32eae6f2;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27685
 */
public class TacticalWaterPurificationSystem1500Galh5700Lh extends EntityType
{
    /** Default constructor */
    public TacticalWaterPurificationSystem1500Galh5700Lh()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)18); // uid 27262, ROWPU - Reverse Osmosis Water Purification Unit
        setSpecific((byte)2); // uid 27685, Tactical Water Purification System (1500 Gal/h / 5700 L/h)
    }
}
