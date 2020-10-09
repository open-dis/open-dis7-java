package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@664632e9
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 11126
 */
public class CH46SeaKnight extends EntityType
{
    public CH46SeaKnight()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 11088, Utility helicopter
        setSubCategory((byte)3); // uid 11124, Boeing model 107
        setSpecific((byte)2); // uid 11126, CH-46 Sea Knight
    }
}
