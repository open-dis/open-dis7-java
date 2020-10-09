package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51ff3c4b
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 12293
 */
public class SSBN740RhodeIsland extends EntityType
{
    public SSBN740RhodeIsland()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 12262, SSBN (Nuclear Ballistic Missile)
        setSubCategory((byte)3); // uid 12278, Ohio class
        setSpecific((byte)15); // uid 12293, SSBN 740 Rhode Island
    }
}
