package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@33187485
 * Country: Russia (RUS)
 * Entity kind: Life form
 * Domain: LAND
 *
 * Entity type uid: 32142
 */
public class _762mmBlaserR93 extends EntityType
{
    public _762mmBlaserR93()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)15); // uid 32140, Sniper Rifles
        setSpecific((byte)44); // uid 32142, 7.62mm Blaser R93
    }
}
