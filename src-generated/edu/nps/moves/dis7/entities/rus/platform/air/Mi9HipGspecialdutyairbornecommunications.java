package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@49798e84;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13440
 */
public class Mi9HipGspecialdutyairbornecommunications extends EntityType
{
    /** Default constructor */
    public Mi9HipGspecialdutyairbornecommunications()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 13431, Utility helicopter
        setSubCategory((byte)1); // uid 13432, Mi-8/9/17/171 Hip
        setSpecific((byte)8); // uid 13440, Mi-9 Hip G (special duty & airborne communications)
    }
}
