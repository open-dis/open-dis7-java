package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@721eb7df;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 31033
 */
public class GenericUAVwithDroppableBomb extends EntityType
{
    /** Default constructor */
    public GenericUAVwithDroppableBomb()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 31031, Unmanned
        setSubCategory((byte)1); // uid 31032, Generic UAV
        setSpecific((byte)1); // uid 31033, Generic UAV - with Droppable Bomb
    }
}
