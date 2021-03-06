package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1eb906f3;
 * Country: United States of America (USA);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32673
 */
public class _556mmColtM4SpecialOperationsPeculiarModificationSOPMOD extends EntityType
{
    /** Default constructor */
    public _556mmColtM4SpecialOperationsPeculiarModificationSOPMOD()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32666, U.S. Army (USA)
        setSubCategory((byte)5); // uid 32669, Assault Rifles
        setSpecific((byte)43); // uid 32673, 5.56mm Colt M4 Special Operations Peculiar Modification (SOPMOD)
    }
}
