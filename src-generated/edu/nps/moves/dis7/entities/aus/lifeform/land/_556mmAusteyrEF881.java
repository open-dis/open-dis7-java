package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1f71e024;
 * Country: Australia (AUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 31526
 */
public class _556mmAusteyrEF881 extends EntityType
{
    /** Default constructor */
    public _556mmAusteyrEF881()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)13); // uid 31517, Royal Australian Air Force (RAAF)
        setSubCategory((byte)5); // uid 31518, Assault Rifles
        setSpecific((byte)62); // uid 31526, 5.56mm Austeyr EF88
    }
}
