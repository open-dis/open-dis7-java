package edu.nps.moves.dis7.entities.oth.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7ac058a0;
 * Country: Other;
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 21705
 */
public class _25000lbsExplosive extends EntityType
{
    /** Default constructor */
    public _25000lbsExplosive()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 21697, Fixed
        setSubCategory((byte)1); // uid 21698, AN/FO (94% ammonium nitrate, 6% fuel oil)
        setSpecific((byte)7); // uid 21705, 25 000 lbs. Explosive
    }
}
