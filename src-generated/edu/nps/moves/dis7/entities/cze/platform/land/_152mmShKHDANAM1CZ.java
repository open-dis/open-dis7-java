package edu.nps.moves.dis7.entities.cze.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@436813f3;
 * Country: Czech Republic (CZE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30080
 */
public class _152mmShKHDANAM1CZ extends EntityType
{
    /** Default constructor */
    public _152mmShKHDANAM1CZ()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 30079, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 30080, 152 mm ShKH DANA-M1 CZ
    }
}
