package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6fd83fc1
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 15843
 */
public class SA341F extends EntityType
{
    public SA341F()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)6); // uid 15838, Aerospatiale SA 341 Gazelle
        setSpecific((byte)5); // uid 15843, SA 341 F
    }
}
