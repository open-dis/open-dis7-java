package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2afdf6b7;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 25139
 */
public class SSN780Missouri extends EntityType
{
    /** Default constructor */
    public SSN780Missouri()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 12301, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)5); // uid 12405, Virginia Class
        setSpecific((byte)7); // uid 25139, SSN 780 Missouri
    }
}
