package edu.nps.moves.dis7.entities.ser.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@59a09be;
 * Country: Serbia and Montenegro;
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 21695
 */
public class TMRP6AntiTankmine extends EntityType
{
    /** Default constructor */
    public TMRP6AntiTankmine()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)3); // uid 21694, Fixed
        setSubCategory((byte)1); // uid 21695, TMRP-6 Anti-Tank mine
    }
}
