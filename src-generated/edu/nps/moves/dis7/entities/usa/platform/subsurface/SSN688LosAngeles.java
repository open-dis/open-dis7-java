package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@67e0fd6d;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 12343
 */
public class SSN688LosAngeles extends EntityType
{
    /** Default constructor */
    public SSN688LosAngeles()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 12301, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)4); // uid 12342, Los Angeles class
        setSpecific((byte)1); // uid 12343, SSN 688 Los Angeles
    }
}
