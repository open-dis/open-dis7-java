package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@402f32ff;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32030
 */
public class L118105AR extends EntityType
{
    /** Default constructor */
    public L118105AR()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 32028, Towed Artillery
        setSubCategory((byte)2); // uid 32030, L118 (105 AR)
    }
}
