package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2bec854f;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28031
 */
public class CH53GSwdoorgunsM3M extends EntityType
{
    /** Default constructor */
    public CH53GSwdoorgunsM3M()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 16366, Utility Helicopter
        setSubCategory((byte)9); // uid 28025, Sikorsky S-65A
        setSpecific((byte)2); // uid 28029, CH-53GS
        setExtra((byte)2); // uid 28031, CH-53GS w/ doorguns M3M
    }
}
