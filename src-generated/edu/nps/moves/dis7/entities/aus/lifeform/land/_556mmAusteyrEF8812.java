package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f106af8;
 * Country: Australia (AUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 31539
 */
public class _556mmAusteyrEF8812 extends EntityType
{
    /** Default constructor */
    public _556mmAusteyrEF8812()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 31530, Royal Australian Navy (RAN)
        setSubCategory((byte)5); // uid 31531, Assault Rifles
        setSpecific((byte)62); // uid 31539, 5.56mm Austeyr EF88
    }
}
