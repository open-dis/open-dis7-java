package edu.nps.moves.dis7.entities.srb.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@49ced9c7;
 * Country: Serbia (SRB);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 30180
 */
public class _82mmHEATTM79 extends EntityType
{
    /** Default constructor */
    public _82mmHEATTM79()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 30178, Ballistic
        setSubCategory((byte)1); // uid 30179, 82mm Recoilless Ammunition
        setSpecific((byte)1); // uid 30180, 82mm HEAT-T M79
    }
}
