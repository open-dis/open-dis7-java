package edu.nps.moves.dis7.entities.irn.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5122e4bf;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 27269
 */
public class Misagh1 extends EntityType
{
    /** Default constructor */
    public Misagh1()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 27268, Guided
        setSubCategory((byte)1); // uid 27269, Misagh-1
    }
}
