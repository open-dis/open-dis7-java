package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4edef76c;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22785
 */
public class Stridsvagn121 extends EntityType
{
    /** Default constructor */
    public Stridsvagn121()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 17469, Tank
        setSubCategory((byte)1); // uid 22784, Leopard 2 MBT
        setSpecific((byte)1); // uid 22785, Stridsvagn 121
    }
}
