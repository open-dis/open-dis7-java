package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1890516e;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28028
 */
public class CH53GwdoorgunsM3M extends EntityType
{
    /** Default constructor */
    public CH53GwdoorgunsM3M()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 16366, Utility Helicopter
        setSubCategory((byte)9); // uid 28025, Sikorsky S-65A
        setSpecific((byte)1); // uid 28026, CH-53G
        setExtra((byte)2); // uid 28028, CH-53G w/ doorguns M3M
    }
}
