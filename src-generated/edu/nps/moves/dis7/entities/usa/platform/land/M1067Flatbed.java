package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4f654cee;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29372
 */
public class M1067Flatbed extends EntityType
{
    /** Default constructor */
    public M1067Flatbed()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 10578, Large Tracked Utility Vehicle
        setSubCategory((byte)4); // uid 10600, M973 Small Unit Support Vehicle (SUSV)
        setSpecific((byte)4); // uid 29372, M1067 Flatbed
    }
}
