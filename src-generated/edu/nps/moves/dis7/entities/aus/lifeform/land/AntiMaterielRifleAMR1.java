package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7740b0ab
 * Country: Australia (AUS)
 * Entity kind: Life form
 * Domain: LAND
 *
 * Entity type uid: 31569
 */
public class AntiMaterielRifleAMR1 extends EntityType
{
    public AntiMaterielRifleAMR1()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)30); // uid 31543, Australian Special Operations Command (SOCOMD)
        setSubCategory((byte)17); // uid 31569, Anti-Materiel Rifle (AMR)
    }
}
