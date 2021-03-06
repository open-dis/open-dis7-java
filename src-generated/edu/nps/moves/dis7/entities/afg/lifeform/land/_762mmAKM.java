package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23bd047f;
 * Country: Afghanistan (AFG);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32186
 */
public class _762mmAKM extends EntityType
{
    /** Default constructor */
    public _762mmAKM()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32180, Afghan National Army (ANA)
        setSubCategory((byte)5); // uid 32181, Assault Rifles
        setSpecific((byte)113); // uid 32186, 7.62mm AKM
    }
}
