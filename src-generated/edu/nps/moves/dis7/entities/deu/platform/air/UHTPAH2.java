package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b5fad2d;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 16363
 */
public class UHTPAH2 extends EntityType
{
    /** Default constructor */
    public UHTPAH2()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 16353, Attack Helicopter
        setSubCategory((byte)2); // uid 16362, Eurocopter Tigre
        setSpecific((byte)1); // uid 16363, UHT (PAH-2)
    }
}
