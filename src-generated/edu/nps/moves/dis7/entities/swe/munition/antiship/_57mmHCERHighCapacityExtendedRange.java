package edu.nps.moves.dis7.entities.swe.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@729cd862;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 27451
 */
public class _57mmHCERHighCapacityExtendedRange extends EntityType
{
    /** Default constructor */
    public _57mmHCERHighCapacityExtendedRange()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)2); // uid 27449, Ballistic
        setSubCategory((byte)2); // uid 27450, 57 mm
        setSpecific((byte)1); // uid 27451, 57 mm HCER (High Capacity Extended Range)
    }
}
