package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@11574592;
 * Country: Russia (RUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32163
 */
public class _120mmAT4CSpigotC9M111MFaktoriya extends EntityType
{
    /** Default constructor */
    public _120mmAT4CSpigotC9M111MFaktoriya()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)50); // uid 32156, Anti-Tank Missiles
        setSpecific((byte)180); // uid 32163, 120mm AT-4C Spigot C/9M111M Faktoriya
    }
}
