package edu.nps.moves.dis7.entities.tur.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@69fe0ed4;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30594
 */
public class McDonnellDouglasF4PhantomII extends EntityType
{
    /** Default constructor */
    public McDonnellDouglasF4PhantomII()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 30593, Fighter/Air Defense
        setSubCategory((byte)1); // uid 30594, McDonnell-Douglas F-4 Phantom II
    }
}
