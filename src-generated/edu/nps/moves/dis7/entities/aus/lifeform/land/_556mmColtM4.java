package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@601d295;
 * Country: Australia (AUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 31545
 */
public class _556mmColtM4 extends EntityType
{
    /** Default constructor */
    public _556mmColtM4()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)30); // uid 31543, Australian Special Operations Command (SOCOMD)
        setSubCategory((byte)5); // uid 31544, Assault Rifles
        setSpecific((byte)42); // uid 31545, 5.56mm Colt M4
    }
}
