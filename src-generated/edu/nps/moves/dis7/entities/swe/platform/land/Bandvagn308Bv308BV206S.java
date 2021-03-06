package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@9b21bd3;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27656
 */
public class Bandvagn308Bv308BV206S extends EntityType
{
    /** Default constructor */
    public Bandvagn308Bv308BV206S()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 27646, Large Tracked Utility Vehicle
        setSubCategory((byte)2); // uid 27656, Bandvagn 308 (Bv 308 / BV 206S)
    }
}
