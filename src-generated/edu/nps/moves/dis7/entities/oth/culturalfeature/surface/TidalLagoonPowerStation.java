package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6cc8da1c;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 29782
 */
public class TidalLagoonPowerStation extends EntityType
{
    /** Default constructor */
    public TidalLagoonPowerStation()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 29775, Electrical Power Installation
        setSubCategory((byte)2); // uid 29778, Tidal Power Station
        setSpecific((byte)4); // uid 29782, Tidal Lagoon Power Station
    }
}
