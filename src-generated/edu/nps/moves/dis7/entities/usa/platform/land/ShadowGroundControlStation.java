package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6361b799;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10739
 */
public class ShadowGroundControlStation extends EntityType
{
    /** Default constructor */
    public ShadowGroundControlStation()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)29); // uid 10728, Command, Control, Communications, and Intelligence (C3I) System
        setSubCategory((byte)8); // uid 10736, UAV Ground Control Station
        setSpecific((byte)3); // uid 10739, Shadow Ground Control Station
    }
}
