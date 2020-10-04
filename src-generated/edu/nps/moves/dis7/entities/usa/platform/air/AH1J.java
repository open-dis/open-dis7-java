package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@53f0d09c
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 11068
 */
public class AH1J extends EntityType
{
    public AH1J()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 11056, Attack helicopter
        setSubCategory((byte)2); // uid 11064, Bell Model 209 Hueycobra, Seacobra, Supercobra
        setSpecific((byte)4); // uid 11068, AH-1J
    }
}