package edu.nps.moves.dis7.entities.ukr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51d387d3;
 * Country: Ukraine (UKR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29842
 */
public class T84Oplot extends EntityType
{
    /** Default constructor */
    public T84Oplot()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 29838, Tank
        setSubCategory((byte)1); // uid 29839, T-84 MBT
        setSpecific((byte)3); // uid 29842, T-84 Oplot
    }
}
