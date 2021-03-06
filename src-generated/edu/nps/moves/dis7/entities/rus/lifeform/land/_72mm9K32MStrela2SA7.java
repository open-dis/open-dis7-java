package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13234ac9;
 * Country: Russia (RUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32170
 */
public class _72mm9K32MStrela2SA7 extends EntityType
{
    /** Default constructor */
    public _72mm9K32MStrela2SA7()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)85); // uid 32169, Man-Portable Air Defense System (MANPADS)
        setSpecific((byte)20); // uid 32170, 72mm 9K32M Strela-2 (SA-7)
    }
}
