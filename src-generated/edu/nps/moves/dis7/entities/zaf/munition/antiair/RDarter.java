package edu.nps.moves.dis7.entities.zaf.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@44da7eb3;
 * Country: South Africa (ZAF);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 28983
 */
public class RDarter extends EntityType
{
    /** Default constructor */
    public RDarter()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 28982, Guided
        setSubCategory((byte)1); // uid 28983, R-Darter
    }
}
