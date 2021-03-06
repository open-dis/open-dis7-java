package edu.nps.moves.dis7.entities.prk.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@19fbc594;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 32508
 */
public class NoDongMod2 extends EntityType
{
    /** Default constructor */
    public NoDongMod2()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32499, Guided
        setSubCategory((byte)53); // uid 32508, No Dong Mod-2
    }
}
