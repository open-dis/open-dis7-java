package edu.nps.moves.dis7.entities.ita.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5175d9ad;
 * Country: Italy (ITA);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21675
 */
public class SistelSeaKiller extends EntityType
{
    /** Default constructor */
    public SistelSeaKiller()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21670, Guided
        setSubCategory((byte)5); // uid 21675, Sistel Sea Killer
    }
}
