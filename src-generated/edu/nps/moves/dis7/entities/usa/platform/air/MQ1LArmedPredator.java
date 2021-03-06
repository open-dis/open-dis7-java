package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@56b8aaf1;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 11239
 */
public class MQ1LArmedPredator extends EntityType
{
    /** Default constructor */
    public MQ1LArmedPredator()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 11232, Unmanned
        setSubCategory((byte)4); // uid 11236, Predator Medium Altitude Endurance UAV
        setSpecific((byte)3); // uid 11239, MQ-1L Armed Predator
    }
}
