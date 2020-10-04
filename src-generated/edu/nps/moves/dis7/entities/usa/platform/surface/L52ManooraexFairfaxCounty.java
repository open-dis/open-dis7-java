package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7fdd43cd
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 11684
 */
public class L52ManooraexFairfaxCounty extends EntityType
{
    public L52ManooraexFairfaxCounty()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 11660, Tank Landing Ship
        setSubCategory((byte)2); // uid 11682, Newport Class LPA/LST (modified)
        setSpecific((byte)2); // uid 11684, L52 Manoora (ex. Fairfax County)
    }
}
