package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@33a71d23
 * Country: United States of America (USA)
 * Entity kind: Expendable
 * Domain: AIR
 *
 * Entity type uid: 30021
 */
public class MJU23AB extends EntityType
{
    public MJU23AB()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22242, Flare
        setSubCategory((byte)35); // uid 30019, MJU-23 Flare
        setSpecific((byte)2); // uid 30021, MJU-23A/B
    }
}
