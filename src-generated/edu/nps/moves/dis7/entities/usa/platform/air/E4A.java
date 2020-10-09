package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51f95f0d
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 11045
 */
public class E4A extends EntityType
{
    public E4A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 11029, Surveillance / C2 (Airborne Early Warning)
        setSubCategory((byte)5); // uid 11044, Boeing E-4 Advanced Airborne Command Post (AABNCP)
        setSpecific((byte)1); // uid 11045, E-4A
    }
}
