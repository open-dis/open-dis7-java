package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@708769b7
 * Country: Australia (AUS)
 * Entity kind: Life form
 * Domain: LAND
 *
 * Entity type uid: 31580
 */
public class _127mmFGM148Javelin1 extends EntityType
{
    public _127mmFGM148Javelin1()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)30); // uid 31543, Australian Special Operations Command (SOCOMD)
        setSubCategory((byte)50); // uid 31579, Anti-Tank Missiles
        setSpecific((byte)60); // uid 31580, 127mm FGM-148 Javelin
    }
}