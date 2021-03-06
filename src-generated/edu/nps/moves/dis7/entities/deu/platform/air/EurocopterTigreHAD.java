package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@74f6c5d8;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24110
 */
public class EurocopterTigreHAD extends EntityType
{
    /** Default constructor */
    public EurocopterTigreHAD()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 16353, Attack Helicopter
        setSubCategory((byte)2); // uid 16362, Eurocopter Tigre
        setSpecific((byte)6); // uid 24110, Eurocopter Tigre HAD
    }
}
