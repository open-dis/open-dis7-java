package edu.nps.moves.dis7.entities.srb.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@653a5967;
 * Country: Serbia (SRB);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 30182
 */
public class TMRP6AntiTankmine extends EntityType
{
    /** Default constructor */
    public TMRP6AntiTankmine()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)3); // uid 30181, Fixed
        setSubCategory((byte)1); // uid 30182, TMRP-6 Anti-Tank mine
    }
}
