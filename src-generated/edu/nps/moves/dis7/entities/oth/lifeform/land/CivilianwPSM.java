package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37ffe4f3;
 * Country: Other;
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32738
 */
public class CivilianwPSM extends EntityType
{
    /** Default constructor */
    public CivilianwPSM()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32731, Civilian
        setSubCategory((byte)80); // uid 32737, Hand Guns
        setSpecific((byte)1); // uid 32738, Civilian w/ PSM
    }
}
