package edu.nps.moves.dis7.entities.jpn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@e260766;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29180
 */
public class MitsubishiMU2S extends EntityType
{
    /** Default constructor */
    public MitsubishiMU2S()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 24790, ASW/Patrol/Observation
        setSubCategory((byte)2); // uid 29180, Mitsubishi MU-2S
    }
}
