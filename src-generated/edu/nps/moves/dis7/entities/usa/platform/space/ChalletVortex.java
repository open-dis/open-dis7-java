package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13250132
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 12453
 */
public class ChalletVortex extends EntityType
{
    public ChalletVortex()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 12431, Unmanned
        setSubCategory((byte)4); // uid 12450, Electronic Intelligence (ELINT) satellite
        setSpecific((byte)3); // uid 12453, Challet/Vortex
    }
}
