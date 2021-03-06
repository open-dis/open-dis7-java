package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7dc7cbad;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29151
 */
public class EmbraerKC390 extends EntityType
{
    /** Default constructor */
    public EmbraerKC390()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 29149, Cargo/Tanker
        setSubCategory((byte)2); // uid 29151, Embraer KC-390
    }
}
