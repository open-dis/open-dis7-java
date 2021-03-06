package edu.nps.moves.dis7.entities.zaf.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3b96f8b0;
 * Country: South Africa (ZAF);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 29085
 */
public class ZT3IngweLeopard extends EntityType
{
    /** Default constructor */
    public ZT3IngweLeopard()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 22824, Guided
        setSubCategory((byte)2); // uid 29085, ZT3 Ingwe (Leopard)
    }
}
