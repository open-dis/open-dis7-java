package edu.nps.moves.dis7.entities.ita.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@14e750c5;
 * Country: Italy (ITA);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21677
 */
public class _40mm70BREDA extends EntityType
{
    /** Default constructor */
    public _40mm70BREDA()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)2); // uid 21676, Ballistic
        setSubCategory((byte)1); // uid 21677, 40 mm/70 BREDA
    }
}
