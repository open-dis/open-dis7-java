package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4751e8b9;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 11180
 */
public class OH58DKiowaKiowaWarrior extends EntityType
{
    /** Default constructor */
    public OH58DKiowaKiowaWarrior()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)24); // uid 11174, Observation helicopter
        setSubCategory((byte)2); // uid 11179, Bell Model 406 AHIP
        setSpecific((byte)1); // uid 11180, OH-58D Kiowa/Kiowa Warrior
    }
}
