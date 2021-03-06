package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7bdf61ad;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 11025
 */
public class RC135XCobraEye extends EntityType
{
    /** Default constructor */
    public RC135XCobraEye()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 11003, Reconnaissance
        setSubCategory((byte)7); // uid 11021, Boeing RC-135
        setSpecific((byte)4); // uid 11025, RC-135X Cobra Eye
    }
}
