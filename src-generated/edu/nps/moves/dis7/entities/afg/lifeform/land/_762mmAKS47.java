package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77a2688d
 * Country: Afghanistan (AFG)
 * Entity kind: Life form
 * Domain: LAND
 *
 * Entity type uid: 32187
 */
public class _762mmAKS47 extends EntityType
{
    public _762mmAKS47()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32180, Afghan National Army (ANA)
        setSubCategory((byte)5); // uid 32181, Assault Rifles
        setSpecific((byte)114); // uid 32187, 7.62mm AKS-47
    }
}
