package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@d21a74c;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28754
 */
public class TPK420SL7 extends EntityType
{
    /** Default constructor */
    public TPK420SL7()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 15674, Small Wheeled Utility Vehicle
        setSubCategory((byte)3); // uid 28744, VLRA (Escort, Reconnaissance, Support) 4x4
        setSpecific((byte)10); // uid 28754, TPK 4.20 SL7
    }
}
