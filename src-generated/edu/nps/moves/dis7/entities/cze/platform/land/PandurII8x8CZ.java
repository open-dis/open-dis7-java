package edu.nps.moves.dis7.entities.cze.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@36902638;
 * Country: Czech Republic (CZE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30077
 */
public class PandurII8x8CZ extends EntityType
{
    /** Default constructor */
    public PandurII8x8CZ()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 30076, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 30077, Pandur II 8x8 CZ
    }
}
