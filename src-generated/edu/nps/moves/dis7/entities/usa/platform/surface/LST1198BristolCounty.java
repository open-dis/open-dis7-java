package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@401c4250;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11681
 */
public class LST1198BristolCounty extends EntityType
{
    /** Default constructor */
    public LST1198BristolCounty()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 11660, Tank Landing Ship
        setSubCategory((byte)1); // uid 11661, Newport Class
        setSpecific((byte)20); // uid 11681, LST 1198 Bristol County
    }
}
